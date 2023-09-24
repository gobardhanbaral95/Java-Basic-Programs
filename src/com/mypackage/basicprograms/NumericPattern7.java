//Wap to print Numeric Pattern 7?

package com.mypackage.basicprograms;

public class NumericPattern7
{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 5; j >= i; j--)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
