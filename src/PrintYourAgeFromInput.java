import java.util.Scanner;

public  class PrintYourAgeFromInput {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");



        //task 1: remove this comment and write one line of code here

        int age = input.nextInt();


        input.close(); // close the scanner (do not read anymore the user input)
        System.out.printf("Your age is:%d" ,age);
    }
}