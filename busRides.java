/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.returnbestcombination;

/**
 *
 * @author Faroogh
 */
public class busRides {
    int solution(int n, int m, int a, int b){
        int cost,costb,gcost,g,h,rides;
        rides=n/m;
        cost=rides*b;
        costb=n%m;
        
        
        if(costb==0){
            return cost;
        }
        //The condition if rides < b: does not make sense in the context of bus rides 
        //and ticket costs. It should likely compare the cost of buying single tickets 
        //for the remaining rides versus buying another group ticket.
        if(rides<b){
            gcost=cost+a;
        }
        else{
            //The calculation g = a - costb is unclear and likely incorrect. 
            // It should compare the cost of buying single tickets for the remaining rides (costb * a) versus buying another group ticket (b).
            g=a-costb;
            //The calculation h = g - m is not meaningful in this context and introduces unnecessary complexity.
            h=g-m;
            gcost=h+cost;
        }
        //Reassigning cost to gcost reduces clarity. 
        //Consider using more descriptive variable names or returning the value directly.
        cost = gcost;
            
        return cost;
    }
}
