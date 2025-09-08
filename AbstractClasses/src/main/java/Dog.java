/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
//To apply inheritance we add an extends keyword to the class
public class Dog extends Animal{
    private boolean fluffy;
    // the subclass constructor must call the constructor of the parent class
    public Dog(String name, int age, boolean isFluffy ){
        super(name,age);//always call super class constructor first
        this.fluffy = isFluffy;// instantiate any class variables
    }
    
    //how do we add different behaviour to a child class
    //with override
    @Override 
    public String speak(){
        return "woof";
    }
    
    @Override 
    public String move(){
        return "run";
    }
    
    public void doSomething() {
        System.out.println("");
    }
    
    //Use the super helper how you call a method from the super class
    public String describe() {
        return "Dog" + super.basicInfo() + "likes to" + move(); 
    }
    
    
}

