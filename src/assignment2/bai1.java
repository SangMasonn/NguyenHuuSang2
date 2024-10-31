
package assignment2;

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
         Scanner student = new Scanner(System.in);
        System.out.print("Enter of fullName: ");
        String name = student.nextLine();

        System.out.print("Enter of Age : ");
        int age = student.nextInt();
        
        System.out.print("Enter OfSex: ");
        student.nextLine();
        String sex = student.next();

        System.out.print("Enter of specialized: ");
        student.nextLine();
        String specialized = student.nextLine();

        System.out.print("Enter of GPA : ");
        double GPA = student.nextDouble();

        System.out.print("Enter of Howtown : ");
        student.nextLine();
        String Howtown = student.nextLine();
        
        System.out.println("\nOutput of Information !");
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Sex :" + sex);
        System.out.println("specialized :" + specialized);
        System.out.println("GPA :" + GPA);
        System.out.println("Howtown :" + Howtown);
    
    }
}
