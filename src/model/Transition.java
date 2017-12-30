package model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Transition extends Thread{

    private ArrayList<JLabel> listTransitions;
    private ArrayList<JLabel> listTokens;
    private ArrayList<JLabel> listOperators;
    private ArrayList<Integer> listData;
    private ArrayList<JLabel> results;
    
    private final Color colorRed = new Color(224,24,52);
    private final int time = 1000;
    
    private final ArrayList<Integer> materials;
    
    private final int cuero = 2;
    private final int nylon = 3;
    private final int bisuteria = 3;
    private final int tachuelas = 16;
    private final int suelas = 2;
    private final int pegamento = 1;
    
    private int nroShoes = 0;
    
    public Transition(ArrayList<JLabel> listTransitions, ArrayList<JLabel> listTokens, ArrayList<JLabel> listOperators
            , ArrayList<Integer> listData, ArrayList<JLabel> results) {
        this.listTransitions = listTransitions;
        this.listTokens = listTokens;
        this.listOperators = listOperators;
        this.listData = listData;
        this.results = results;
        materials = new ArrayList<>();
        materials.addAll(Arrays.asList(
                cuero,
                nylon,
                bisuteria,
                tachuelas,
                pegamento,
                suelas
        ));
        allVisibleOperators();
    }

    public void allVisibleOperators(){
        this.listOperators.forEach((o)->{
            o.setVisible(true);
        });
    }
    
    public void changeColor(int index, Color color){
        listTransitions.get(index).setBackground(color);
    }
    
    public void visibleToken(int index,boolean band){
        listTokens.get(index).setVisible(band);
    }
    
    public void visibleOperator(int index,boolean band){
        listOperators.get(index).setVisible(band);
    }
    
    public boolean existsEnoughDataSlow(int index){
        /*for(int i = 0; i < 6 ; i++){
            if(listData.get(i) < materials.get(i)){
                return false;
            }
        }
        return true;*/

        if(index == 4){
            return listData.get(index) >= materials.get(index) && listData.get(index + 1) >= materials.get(index + 1);
        }
        else{
            return listData.get(index) >= materials.get(index);
        }
        
    }
    
    public boolean existsEnoughDataFast(int index){
        /*for(int i = 0; i < 6 ; i++){
            if(i != 2){
                if(listData.get(i) < materials.get(i)){
                    return false;
                }
            }
        }
        return true;*/
        
        if(index == 3){
            return listData.get(4) >= materials.get(4) && listData.get(5) >= materials.get(5);
        }
        else{
            return listData.get(index) >= materials.get(index);
        }   
        
    }
    
    public void deleteDataSlow(int index){
        
        switch(index){
            case 0: listData.set(0, listData.get(0) - materials.get(0)); break;
            case 1: listData.set(1, listData.get(1) - materials.get(1)); break;
            case 2: listData.set(2, listData.get(2) - materials.get(2)); break;
            case 3: listData.set(3, listData.get(3) - materials.get(3)); break;
            case 4: listData.set(4, listData.get(4) - materials.get(4)); 
                    listData.set(5, listData.get(5) - materials.get(5));
                    break;
        }
     
    }
    
    public void deleteDataFast(int index){
        
        switch(index){
            case 0: listData.set(0, listData.get(0) - materials.get(0)); break;
            case 1: listData.set(1, listData.get(1) - materials.get(1)); break;
            case 2: listData.set(2, listData.get(2) - materials.get(2)); break;
            case 3: listData.set(4, listData.get(4) - materials.get(4)); 
                    listData.set(5, listData.get(5) - materials.get(5));
                    break;
        }
     
    }
    
    public void showResults(){
        for(int i = 0; i < 6 ; i++){
            results.get(i).setText(listData.get(i).toString());
        }
        results.get(6).setText(String.valueOf(nroShoes));
    }
    
    
    @Override
    public void run() {
        
        //int token = -1;
        //int transition = -1;
        //int operator = -1;
        
        boolean band;
        
        if(listTransitions.size() == 12){
            try {
                while(existsEnoughDataSlow(0)){
                    band = false;
                    int token = -1;
                    int transition = -1;
                    int operator = -1;
                    
                    for(int i = 0; i < 6; i++){
                        showResults();
                        if(i != 5){
                            if(!existsEnoughDataSlow(i)){
                                band = true;
                                break;
                            }
                            else{
                                deleteDataSlow(i);
                            }
                        }

                        changeColor(++transition, colorRed);
                        Thread.sleep(time);
                        changeColor(transition, Color.blue);

                        visibleOperator(++operator, false);
                        visibleToken(++token, true);
                        Thread.sleep(time);
                        visibleOperator(operator, true);
                        visibleToken(token, false);

                        changeColor(++transition, colorRed);
                        Thread.sleep(time);
                        changeColor(transition, Color.blue);

                        visibleToken(++token, true);
                        Thread.sleep(time);
                        visibleToken(token, false);
                    }
                    
                    showResults();
                    
                    if(band){
                        break;
                    }
                    else{
                        nroShoes++;
                    }
                    
                }
                JOptionPane.showMessageDialog(null, "Fin del proceso");
            }
            catch(InterruptedException ex){
                System.out.println("Error");
            }
            
        }
        else{
            while(existsEnoughDataFast(0)){
                band = false;
                try {
           
                    int token = -1;
                    int transition = -1;
                    int operator = -1;
                    
                    
                    for(int i = 0; i < 5; i++){
                        showResults();
                        if(i != 4){
                            if(!existsEnoughDataFast(i)){
                                band = true;
                                break;
                            }
                            else{
                                deleteDataFast(i);
                            }
                        }


                        if(i == 2){
                            changeColor(listTransitions.size() - 1, colorRed);
                            Thread.sleep(time);
                            changeColor(listTransitions.size() - 1, Color.BLUE);

                            visibleToken(listTokens.size() - 1, true);
                            Thread.sleep(time);
                            visibleToken(listTokens.size() - 1, false);
                            Thread.sleep(time);

                            ++operator;

                        }


                        changeColor(++transition, colorRed);
                        Thread.sleep(time);
                        changeColor(transition, Color.blue);

                        visibleOperator(++operator, false);
                        visibleToken(++token, true);
                        Thread.sleep(time);
                        visibleOperator(operator, true);
                        visibleToken(token, false);

                        changeColor(++transition, colorRed);
                        Thread.sleep(time);
                        changeColor(transition, Color.blue);

                        visibleToken(++token, true);
                        Thread.sleep(time);
                        visibleToken(token, false);
                    }
                }
                catch(InterruptedException ex){
                    System.out.println("Error");
                }
                
                showResults();
                
                if(band){
                    break;
                }
                else{
                    nroShoes++;
                }
                
            }
            JOptionPane.showMessageDialog(null, "Fin del proceso");
        }
    }
    
}
