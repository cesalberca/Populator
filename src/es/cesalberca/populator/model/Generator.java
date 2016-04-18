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
    private ArrayList<String> names;
    
    public ArrayList<Human> generate(int numHumans){
        ArrayList<Human> humans = humans = new ArrayList(numHumans);
        Human human = new Human(
                getRandomName(), 
                getRandomLastName(), 
                getRandomSalary(), 
                getRandomBYear(), 
                getRandomProfCat());
        return humans;
    }
    
    public void setNames() {
        names = new ArrayList();
        names.add("Aarón");
        names.add("Abdalá");
        names.add("Abdón");
        names.add("Abdul");
        names.add("Abel");
        names.add("Abelardo");
        names.add("Abilio");
        names.add("Abner");
        names.add("Abraham");
        names.add("Absalón");
        names.add("Acacio");
        names.add("Accio");
        names.add("Adalberto");
        names.add("Adán");
        names.add("Adelfo");
        names.add("Adelino");
        names.add("Adelio");
        names.add("Adolfo");
        names.add("Adonaí");
        names.add("Adonis");
        names.add("Adrián");
        names.add("Adriano");
        names.add("Adulfo");
        names.add("Africano");
        names.add("Afrodisio");
        names.add("Agamenón");
        names.add("Agapito");
        names.add("Agesilao");
        names.add("Agripino");
        names.add("Agustín");
    }
    
    public String getRandomName(ArrayList<String> names){
        int max = names.size();
        int randPosition = (int)Math.random() * max;
        return names.get(randPosition);
    }
    
    public String getRandomLastName(){
        return "a";
    }
    
    public int getRandomSalary(){
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
