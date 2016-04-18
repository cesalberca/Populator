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
    private ArrayList<String> lastNames;
    private ArrayList<String> catProf;
    
    public Generator() {
        this.setNames();
        this.setLastNames();
        this.setCatProf();
    }
    
    public ArrayList<Human> generate(int numHumans) {
        ArrayList<Human> humans = new ArrayList<Human>();
        
        for (int i = 0; i < numHumans; i++) {
            humans.add(new Human(
                getRandomName(), 
                getRandomLastName(), 
                getRandomSalary(), 
                getRandomBYear(), 
                getRandomProfCat()));
        }
        return humans;
    }
    
    public String getRandomName() {
        int max = this.names.size();
        int randPosition = (int)(Math.random() * max);
        return names.get(randPosition);
    }
    
    public String getRandomLastName() {
        int max = this.lastNames.size();
        int randPosition = (int)(Math.random() * max);
        return lastNames.get(randPosition);
    }
    
    public int getRandomSalary(){
        int salary_min=8000;
        int salary_max=150000;
        int range = (salary_max - salary_min) + 1;   
        return (int)(Math.random() * range);
    }
    
    public int getRandomBYear(){
        int yearMin=1951;
        int yearMax=1998;
        int range = (yearMax - yearMin) + 1;   
        return (int)(Math.random() * range);
    }
    
    public String getRandomProfCat(){
        int max = this.catProf.size();
        int randPosition = (int)(Math.random() * max);
        return catProf.get(randPosition);
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
    
    public void setLastNames() {
        lastNames = new ArrayList();
        lastNames.add("Aarón");
        lastNames.add("Abdalá");
        lastNames.add("Abdón");
        lastNames.add("Abdul");
        lastNames.add("Abel");
        lastNames.add("Abelardo");
        lastNames.add("Abilio");
        lastNames.add("Abner");
        lastNames.add("Abraham");
        lastNames.add("Absalón");
        lastNames.add("Acacio");
        lastNames.add("Accio");
        lastNames.add("Adalberto");
        lastNames.add("Adán");
        lastNames.add("Adelfo");
        lastNames.add("Adelino");
        lastNames.add("Adelio");
        lastNames.add("Adolfo");
        lastNames.add("Adonaí");
        lastNames.add("Adonis");
        lastNames.add("Adrián");
        lastNames.add("Adriano");
        lastNames.add("Adulfo");
        lastNames.add("Africano");
        lastNames.add("Afrodisio");
        lastNames.add("Agamenón");
        lastNames.add("Agapito");
        lastNames.add("Agesilao");
        lastNames.add("Agripino");
        lastNames.add("Agustín");
    }
    
    public void setCatProf() {
        catProf = new ArrayList();
        catProf.add("Becario");
        catProf.add("IT");
        catProf.add("Comercial");
        
    }
}
