//Wap to print Star Pattern 16?
package com.mypackage.basicprograms;

public class StarPattern16 {
    public static void main(String[] args) {
        for (int i = 5;i >= 1;i--) {
            for (int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }
            for(int k = 1;k<(i*2);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}