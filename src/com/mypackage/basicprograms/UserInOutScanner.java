//wap to Getting User Input in Java (using Scanner class)?
package com.mypackage.basicprograms;
import java.util.Scanner;
public class UserInOutScanner {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name=s.next();
        System.out.println("Enter Your Age : ");
        int age=s.nextInt();
        System.out.println("Enter Your Gender : ");
        char gender=s.next().charAt(0);
        System.out.println("Enter Your Phone No : ");
        long phno=s.nextLong();
        System.out.println("----------------------------------------");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Gender : "+gender);
        System.out.println("Phone No. : "+phno);

    }
}
