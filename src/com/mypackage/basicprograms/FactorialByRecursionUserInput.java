//Wap to Find the Factorial of the Number using Recursion with UserInput By Scanner Class?

package com.mypackage.basicprograms;
import java.util.Scanner;
class FactorialByRecursionUserInput
{
        static int fact=1;
        public static void main(String[] args)
        {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the no");
            int no = s.nextInt();
            FactorialByRecursionUserInput ob = new FactorialByRecursionUserInput();
            ob.calcFact(no);
            System.out.println("factorial of "+no+" is :"+fact);
        }
        void calcFact(int no)
        {
            if (no>=1)
            {
                fact=fact*no;
                calcFact(no-1);
            }
        }
}