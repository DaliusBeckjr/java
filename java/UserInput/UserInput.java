// this is another practice program for the user input in java 
//  Thur Mar 23,2023 10.11pm
// 
// 

import java.util. Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System. in); // for now just ignore keyboard.close() it runs fine.
        int age;

        System.out.println("what is your age?");
        age = keyboard.nextInt();

        System.out.println("Here is the value that you have entered: ");
        System.out.println(age);
    }
}