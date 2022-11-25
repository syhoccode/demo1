
package com.mycompany.java42;


public class Java42 {

    public static void main(String[] args) {
        System.out.println("con cho 1 ");
        dog d = new dog();
        d.eat();
        d.makesound();
        d.sleep();
        
        System.out.println("==========================");
        
        System.out.println("con meo @");
        cat c = new cat();
        c.eat();
        c.getName();
        c.makesound();
        
    }
}
