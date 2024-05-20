/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aryan
 */
public class Person {
    private String name = "Sydney";
    private int sum;
    private boolean status = true;
    
    
    
    
    public String getName(){
        return name;
    }
    
    public int calcSum(int x,int y){
        sum = x + y;
        return sum;
        
    }
    
    public boolean checkStatus(int mark){
        if(mark > 49){
            status = true;
            
        }
        else
        {
            status = false;
        }
        return status;
        
    }
    
}
