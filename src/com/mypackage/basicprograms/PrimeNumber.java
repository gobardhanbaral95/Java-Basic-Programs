//Wap to Check Whether A Number is Prime or Not in Java?
package com.mypackage.basicprograms;
public class PrimeNumber
{
    public static void main(String[] args)
    {
        int no=7;
        int temp=0;
        for(int i=2;i<=no-1;i++)
        {
            if(no%i==0)
            {
                temp=temp+1;
            }
        }
        if(temp==0)
        {
            System.out.println(no+" is prime no");
        }
        else
        {
            System.out.println(no+" is not prime");
        }
    }
}
