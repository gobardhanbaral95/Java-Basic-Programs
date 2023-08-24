//Wap to Print Fibonacci Series Using Recursion in Java?
package com.mypackage.basicprograms;

class FibonacciSeriesByRecursion
{
    static int a = 0, b = 1, c;

    public static void main(String[] args)
    {
        System.out.print(a + " " + b);
        FibonacciSeriesByRecursion ob = new FibonacciSeriesByRecursion();
        ob.printFib(15);
    }

    void printFib(int i)
    {
        if (i >= 1)
        {
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
            printFib(i-1);
        }

    }
}
