//Wap to print Star Pattern 10?
package com.mypackage.basicprograms;

import java.util.Arrays;

public class StarPattern10
{
    public static void main(String[] args)
    {
               for(int i=1;i<=4;i++)
               {
                   for(int j=4;j>=i;j--)
                   {
                       System.out.print(" ");
                   }
                   for(int k=1;k<=i;k++)
                   {
                       System.out.print(" *");
                   }
                   System.out.println();
               }
    }
}
