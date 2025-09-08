/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractclasses;

/**
 *
 * @author lab_services_student
 */

// abstarct classes are nused as a generic blueprint for subclasses.
//abstarct classes are created when we dont intend on creating 
//types of this class. they are just used to express common 
//properties(varaiables and methods) of all its subclasses.
// if a class is abstarct it can still have a non abstarct methods
//but as long as you have atleast one abstract method
// the class needs to be declared as abstract as well.
public abstract class Animal {

    // ========== BASE/ PARENT/ SUPER CLASS ===========
    /*
    the base class is used to keep track of value and 
    behavours that are common to all child classes.
    In the example of an animal
    All animals have names and ages, all animals
    can walk and 'talk'
    But based on what subclass of animal you have 
    The way the behave (ie talk / walk) or even the attributes they have
    can be different so some animals have wings
     */
    //information hiding -> private class attributes

        String name;
        private int age;
        
        //Base construstor
        /*
        A constructor is a special method that is created whenever you 
        have a class. The purpose of a constructor is to set the values
        of any manditory class attributes. You can define a class constructor
        explicitly(Below) but if you do not define one. Java creates an implicit 
        contructor for your class. An implicit contructor creat an empty class object.
        A constructor is define byt the name of the class and has no return type
        */
        
        public Animal(String name, int age) {
            /*
            a con staructor of an abstract can be used to set all common va
            to refer to the class attributes we use the 'this' keyword.
            This referes to this class. To access the param we just use their names
            */
            this.name = name;
            this.age = age;
        }
        
        /*
        We give safe access to class attributes using 
        getters (returns the values of attribues) and 
        setters (sets values of attributes)
        */
        
        public String getName() {
            return this.name;
        }
        
        public int getAge() {
            return this.age;
        }
        
        public void setName(String name) {
            this.name = name;
        };
 
        public void setAge(int age) {
            this.age = age;
        };
         
        // an abstarct method does not have an implementation
        //ie. there are no {}
        //eg public abstarct void myMethod();
        //abstarct methods can define parameteres
        //eg. public abstract void myMethod(String myParam);
        // Behaviour/ methods that can be different in the child class
        public abstract String speak();
        
        public abstract String move();
        
        //What can't be overidden in a child class
        public final String kingdom() { //final -> not overridable
            return "Anamalia";
        }
        public static String classification() { // static -> not overridable
            return "some classification";
        }
        private void secret (){} //private -> not overridable
        
        //helper method for subclasses
        public String basicInfo(){
            return name + "(" + age + ")";
        }
        
        
}
