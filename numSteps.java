/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.returnbestcombination;

/**
 *
 * @author Faroogh
 */
public class numSteps {
    // write your code here
         public int solve(int x) {
        // write your code here
        int steps=x/5;
        int stepsrem=x%5;
        for(int i=0; i<5; i++){
            if (stepsrem==i)
                    stepsrem=i;
        }
        steps=steps+1;
        return steps;
    }
}
