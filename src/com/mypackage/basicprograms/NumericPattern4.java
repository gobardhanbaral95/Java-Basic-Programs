//Wap to print Numeric Pattern 4?
package com.mypackage.basicprograms;

public class NumericPattern4
{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
