//Wap to Find the Factorial of the Number using Recursion?
package com.mypackage.basicprograms;
public class FactorialByRecursion {
    static int fact=1;
    public static void main(String[] args) {
        int no = 5;
        FactorialByRecursion ob = new FactorialByRecursion();
        ob.calcFact(no);
        System.out.println("factorial of "+no+" is "+fact);
    }

    void calcFact(int no) {
        if (no >= 1)
        {
            fact=fact*no;
            calcFact(no-1);
        }
    }
}
