/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.pairprogramming;

/**
 *
 * @author mjimen19
 */
public class Box {
    private char boxCharacter;

    public Box(char boxCharacter) {
        this.boxCharacter = boxCharacter;
    }
    
    public char getBox() {
        return boxCharacter;
    }
    
    public void setBox(char character){
        boxCharacter = character;
    }
    
    public boolean isOccupied(){
        boolean isOcu = true;
        if(boxCharacter == ' ' || boxCharacter == 'S'){
            isOcu = false;
        }
        
        return isOcu;
    }
    
    public boolean isFinish(){
        return boxCharacter == 'S';
    }
    
    public boolean isStart(){
        return boxCharacter == 'E';
    }
}
