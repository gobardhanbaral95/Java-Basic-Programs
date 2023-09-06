//Wap to print Star Pattern 11?
package com.mypackage.basicprograms;
public class StarPattern11 {
    public static void main(String[] args) {
        for (int i = 1;i <= 4;i++) {
            for (int j =4;j>=1;j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}


