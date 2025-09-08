/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractclasses;

/**
 *
 * @author lab_services_student
 */
public class Dog extends Animal {
    private boolean fluffy;

    public Dog(String name, int age, boolean isFluffy){
    super(name,age);//always call super class constructor first
        this.fluffy = isFluffy;// instantiate any class variables
    }
    
    //how do we add different behaviour to a child class
    //with override
    @Override 
    public String speak(){
        return "woof";
    }
    //when extending an abstract class all abstract methods
    // should be implemented. if you choose no to implement an abstract methods
    //this class needes to be declared as abstarct too.
    @Override 
    public String move(){
       return "run";
    }
    
  //  public void doSomething() {
    //    System.out.println("");
    //}
    
    //Use the super helper how you call a method from the super class
    public String describe() {
        return "Dog" + super.basicInfo() + "likes to" + move(); 
    }
    
    
}


