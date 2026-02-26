/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.returnbestcombination;

/**
 *
 * @author Faroogh
 */
public class timeInString {
    public String solution(int T) {
        // Implement your solution here
        int min, sec, hour, remhour;

        String b=T+"";
        
        if(T<60){
            b=T+"s";   
        }
        if(T>60){
            sec=T%60;
            min=T/60;
            b=min+"m"+sec+"s";
        }
        
        if(T>3600){
            hour=T/3600;
            remhour=T%3600;
            min=(remhour/60);
            sec=T%60;
            b=hour+"h"+min+"m"+sec+"s";
        }
        return b;
    }
}
