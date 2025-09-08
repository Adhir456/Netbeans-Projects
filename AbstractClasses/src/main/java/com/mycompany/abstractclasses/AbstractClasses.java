/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstractclasses;

/**
 *
 * @author lab_services_student
 */
public class AbstractClasses {

    public static void main(String[] args) {
        Dog spike = new Dog ("Spike", 1, true);
        System.out.println()
         Animal a1 = new Dog("Rex",2,true);
      
       Dog a3 = new Dog("Rex",2,true);
       System.out.println(a1.getName() + "is an animal ?" + (a1 instanceof Animal));
    
        //test overriden methods
        System.out.println(a1.getName() + "likes to " + a1.move());
        System.out.println(a1.getName() + "says  " + a1.speak());
        
       
        
        //update using the setters\
        a3.setAge(10);
        System.out.println(a3.describe());
        
        
        
        
        
    }
}
