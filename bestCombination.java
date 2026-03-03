/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.returnbestcombination;

/**
 *
 * @author Faroogh
 */
public class ReturnBestCombination {
  
    public int combination(int a, int b, int c)
    {
        int v = 0, largest;
        int myArr[];
        myArr = new int[7];
        myArr[0] = a*b*c;
        myArr[1] = (a*b)+c;
        myArr[2] = a + b + c;
        myArr[3] = (a+b)*c;
        myArr[4] = a+(b*c);
        myArr[5] = a*(b+c);
        myArr[6] = a+b*c;

        System.out.println("length of my array" + myArr.length);
        
        for (int x = 0; x < myArr.length; x++)
        {
            System.out.println(myArr[x]);
        }
        
        for (int i = 0; i < myArr.length; i ++)
            {
                for (int j = i + 1; j < myArr.length; j++)
                    {
                        if (myArr[i] > myArr[j])
                            {
                                largest = myArr[i];
                                myArr[i] = myArr[j];
                                myArr[j] = largest;
                                v=myArr[j];
                            }
                    }
            }
        return v;
    }

    public static void main(String[] args) {
        int a;
        ReturnBestCombination myObj = new ReturnBestCombination();
        a = myObj.combination(1, 2, 3);
        System.out.println(a);
        
        //largest piece of cake
        largestPieceOfCake cake = new largestPieceOfCake();
        String r;
        r = cake.cakePiece(10);
        System.out.println("cake piece" + r);
        
        //most number of ones in a list
        int noOfOnes, noOfOnes2, noOfOnes3, noOfOnes4, noOfOnes5;
        int[] arr = {0,1,0,1,0,1,0,1,0,1,1,0,1,1,0,1,1,0};
        int[] arr2 = {1,0,0,1,0};
        int[] arr3 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] arr4 = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int[] arr5 = {1,0,0,0,1,1,0,0};
        maximumNoOfOnes obj = new maximumNoOfOnes();
        noOfOnes =  obj.solution(arr);
        noOfOnes2 = obj.solution(arr2);
        noOfOnes3 = obj.solution(arr3);
        noOfOnes4 = obj.solution(arr4);
        noOfOnes5 = obj.solution(arr5);
        System.out.println("No of ones" + noOfOnes);
        System.out.println("No of ones" + noOfOnes2);
        System.out.println("No of ones" + noOfOnes3);
        System.out.println("No of ones" + noOfOnes4);
        System.out.println("No of ones" + noOfOnes5);

        
        //smallest number 
        int smallestNum;
        int[] arr6 = {1,2,6,4,8};
        smallestNumerInsideList obj2 = new smallestNumerInsideList();
        smallestNum = obj2.smallestNumer(arr6);
        System.out.println("smallest numer" + smallestNum);
        
        //convert number to binary
        int[] binNum;
        binaryNum obj3 = new binaryNum();
        binNum = obj3.convertBinary(15);
        for(int j=0; j<binNum.length; j++){
        System.out.println(binNum[j]);}
        
        //evenly distribute
        String coin;
        evenlyDistribute obj4 = new evenlyDistribute();
        coin = obj4.solve(10, 20, 15, 14);
        System.out.println(coin);
        
        //dormitory
        int maxCap;
        dormRoomAvailaibility obj5 = new dormRoomAvailaibility();
        int[][] numbers={{2, 2},{1, 10},{3, 5},{0, 2}};
        maxCap=obj5.solve(numbers);
        System.out.println(maxCap);
        
        //lucky ticket
        String ticket;
        luckyTicket obj6 = new luckyTicket();
        ticket=obj6.solve("123321");
        System.out.println(ticket);
        
        //bus rides
        int busRides;
        busRides obj7 = new busRides();
        busRides=obj7.solution(6, 2, 1, 2);
        System.out.println(busRides);
        
        //time to string output
        String l1, l2;
        timeInString obj8 = new timeInString();
        l1=obj8.solution(7500);
        l2=obj8.solution(83643); //2h14m3s
        System.out.println(l1);
        System.out.println(l2);
        
        //number of steps
        int steps;
        numSteps obj9 = new numSteps();
        steps=obj9.solve(534204);
        System.out.println(steps);
        
        int d;
        strings obj10 = new strings();
        d=obj10.solve("1+1");
        System.out.println(d);
    }
}
