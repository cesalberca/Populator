/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cesalberca.populator.model;

import java.util.ArrayList;

/**
 *
 * @author dam
 */
public class Generator {
    
    public static ArrayList<Human> generate(int numHumans){
        ArrayList<Human> humans = humans = new ArrayList(numHumans);
        Human humano = new Human(getRandomName(), getRandomLastName(), 
                getRandomSalary(), getRandomBYear(), getRandomProfCat());
        return humans;
    }
    
    public static String getRandomName(){
        return "c";
    }
    
    public static String getRandomLastName(){
        return "a";
    }
    
    public static int getRandomSalary(){
        int salary_min=8000;
        int salary_max=150000;
        return (int) ((Math.random() + salary_min) * salary_max);
        
    }
    
    public static int getRandomBYear(){
        return 1;
    }
    
    public static String getRandomProfCat(){
        return "b";
    }
    
}
