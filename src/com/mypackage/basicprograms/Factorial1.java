//Wap to Find the Factorial of the Number?
package com.mypackage.basicprograms;
public class Factorial1
{
    public static void main(String[] args)
    {
        int no=5;
        int fact=1;
        for(int i=1;i<=no;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial  of "+no+" is "+fact);
    }
}
