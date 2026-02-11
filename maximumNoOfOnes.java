/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.returnbestcombination;

/**
 *
 * @author Faroogh
 */
public class maximumNoOfOnes {
    int solution(int[] l)
        {
            int i,alt=0;
            int total=0;
            for(i=l.length-1; i>0; i--){
                if(l[i]==0){
                    l[i]=1-l[i];
                    total=total+l[i];
                    }
                else{if(l[i-1]==1&&l[i]==1){
                    alt=alt+l[i-1]+l[i];
                    }               
            }}
            if(alt/2==l.length-1){return alt/2;}
            if(alt>2){total=l.length-total;
                return total;}
            else{if(alt==2){return alt+total;}
            else{return total+l[l.length-2];}}
                }
    }


    
