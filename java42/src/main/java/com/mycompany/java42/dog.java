
package com.mycompany.java42;


public class dog extends animal{
    public dog(){
        super("tieu ho");
    }

    @Override
    public void makesound() {
        System.out.println("gau gau"); 
    }

    @Override
    public void eat() {
        System.out.println("cho an cut"); 
    }

   
    
    
}
