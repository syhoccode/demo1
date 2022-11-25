
package com.mycompany.java42;


public class animal {
    protected String name;

    public animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println("tôi đang ăn ..........");
    }
    public void sleep(){
        System.out.println("oooooooooooooozzzzzzzzzzzz");
    }
    public void makesound(){
        System.out.println("-=-=-=-=-=-=-=--=-=-==-=-");
    }
}
