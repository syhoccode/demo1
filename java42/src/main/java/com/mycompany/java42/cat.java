
package com.mycompany.java42;

class cat extends animal{
    public cat(){
        super("con meo rach");
    }

    @Override
    public void makesound() {
        System.out.println("meo meo");
    }

    @Override
    public void eat() {
        System.out.println("meo an chuot"); 
    }

 
    
    
}
