/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cesalberca.populator.model;

/**
 *
 * @author dam
 */
public class Humano {
    private String name;
    private String lName;
    private int salary;
    private int bYear;
    private String profCat;

    public Humano(String name, String lName, int salary, int bYear, String profCat) {
        this.name = name;
        this.lName = lName;
        this.salary = salary;
        this.bYear = bYear;
        this.profCat = profCat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getbYear() {
        return bYear;
    }

    public void setbYear(int bYear) {
        this.bYear = bYear;
    }

    public String getProfCat() {
        return profCat;
    }

    public void setProfCat(String profCat) {
        this.profCat = profCat;
    }
    
    
}
