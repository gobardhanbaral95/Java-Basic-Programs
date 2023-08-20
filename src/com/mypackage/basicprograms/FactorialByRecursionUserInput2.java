//Wap to Find the Factorial of the Number using Recursion with UserInput By Scanner Class 2nd Ways?
package com.mypackage.basicprograms;

import java.util.Scanner;

class FactorialByRecursionUserInput2
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no");
        int no = s.nextInt();
        int fact;
        FactorialByRecursionUserInput2 ob = new FactorialByRecursionUserInput2();
        fact= ob.calcFact(no);
        System.out.println("factorial of "+no+" is :"+fact);
    }
    int calcFact(int no)
    {
        if (no>=1)
        {
            return(no*calcFact(no-1));
        }
        return 1;
    }
}
