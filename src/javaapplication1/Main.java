/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author MC03353
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            dataTypes("College", 23, 'C', true);
      
    }// end of main
    
public static void dataTypes(String name, int age, char initial, 
        boolean isHappy){
       System.out.print("Name: " + name + "\n"
                                + "Integer: " + age + "\n"
                                + "Char: " + initial + "\n"
                                + "is Happy? " + isHappy + "\n");
}

public static void inttest(){
    int age = 12;
    
    if((age > 0) && (age < 12)){//if age is greater than 0 but less than 12
        System.out.print("Age is less than teens");//
    } else if ((age > 12) && (age < 20)) {
        System.out.print("Age is teens");//
    } else {
        System.out.print("Age is greater than teens");//
    }
}
    
}// end of class 
