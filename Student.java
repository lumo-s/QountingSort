/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qountingsort;

/**
 *
 * @author 86139
 */
public class Student {
    
    private String name;
    private int score;
    
    public Student(String name,int score){
        this.name=name;
        this.score=score;
    }
    
    public String getName(){
        return name;
    }
    
    public int getScore(){
        return score;
    }
    
    @Override
    public String toString(){
        return String.format("Student(name: %s, score:%d)",name,score);
    }
    
    
    
    
}
