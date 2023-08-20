//Wap to Print Multiplication Table using User Input by Scanner Class?
package com.mypackage.basicprograms;

import java.util.Scanner;

public class MultiplicationTableUserInput
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number you want to print multiplication table");
        int no=s.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(no+" * "+i+" = "+no*i);
        }
    }
}
