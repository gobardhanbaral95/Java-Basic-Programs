//Wap to Check for Armstrong Number in Java using UserInput by Scanner Class?
package com.mypackage.basicprograms;

import java.util.Scanner;

public class ArmstrongNumberUserInput
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=s.nextInt();
        int t1=no;
        int leng=0;
        while(t1!=0)
        {
            leng=leng+1;
            t1=t1/10;
        }
        int t2=no;
        int arm=0;
        int rem;
        while(t2 != 0)
        {
            int mul=1;
            rem=t2%10;
            for(int i=1;i<=leng;i++)
            {
                mul=mul*rem;
            }
            arm=arm+mul;
            t2=t2/10;
        }
        if(arm==no)
        {
            System.out.println(no+" is armstrong number");
        }
        else
        {
            System.out.println(no+" is not armstrong number");
        }
    }
}

