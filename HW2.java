import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);


        // 1.Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers.
        System.out.print("Input first number: ");
        int firstNumber = data.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = data.nextInt();

        int sum = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int mul = firstNumber * secondNumber;
        double div = firstNumber / secondNumber;
        double mod = firstNumber % secondNumber;

        System.out.printf(firstNumber + " + " + secondNumber +" = "+ sum + "%n"
                + firstNumber + " - " + secondNumber +" = "+ sub + "%n"
                + firstNumber + " x " + secondNumber +" = "+ mul + "%n"
                + firstNumber + " / " + secondNumber +" = "+ div + "%n"
                + firstNumber + " mod " + secondNumber +" = "+ mod + "%n");



        // 2.Write a Java program to convert a given string into lowercase.
        System.out.print("Input a String: ");
        String name = data.nextLine();
        System.out.println(name.toLowerCase());




        // 3.Write a Java program that takes a string and a number from the user,then prints the character in the given index.
        System.out.print("Input a String: ");
        String text = data.nextLine();
        System.out.print("Input a number:  ");
        int num = data.nextInt();

        if(num <= text.length() && num > 0 ) {
            System.out.println("Value of index " + num + " is " + text.charAt(num));
        } else System.out.println("The index greater/less than text length");




        // 4.Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. (use if-statement)
        System.out.print("Input a number:  ");
        int number = data.nextInt();

        if(number % 2 ==0){
            System.out.println("1");
        } else System.out.println("0");




        // 5.Write a program that checks the role of the user
        System.out.println("Enter Your Role:");
        String role = data.nextLine();
        if(role.equalsIgnoreCase("admin")){
            System.out.println("Welcome admin");
        } else if (role.equalsIgnoreCase("superuser")) {
            System.out.println("Welcome superuser");
        } else if (role.equalsIgnoreCase("user")) {
            System.out.println("Welcome user");
        } else System.out.println("Invalid input");




        // 6.Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
        System.out.print("Input the first number: ");
        int first = data.nextInt();
        System.out.print("Input the second number: ");
        int second = data.nextInt();
        System.out.print("Input the third number: ");
        int third = data.nextInt();

        int total = first + second;
        boolean isValid = third == total;

        System.out.println("The result is: "+isValid);




        // 7.Take three numbers from the user and print the greatest number.
        System.out.print("Input the 1st number: ");
        int firstNum = data.nextInt();
        System.out.print("Input the 2nd number: ");
        int secondNum = data.nextInt();
        System.out.print("Input the 3rd number: ");
        int thirdNum = data.nextInt();

        int primaryGreatest = Math.max(firstNum, secondNum);
        int greatest = Math.max(primaryGreatest, thirdNum);

        System.out.println("The greatest: " + greatest);




        // 8.Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
        System.out.print("Input number between 1 and 7: ");
        int weekNum = data.nextInt();

        switch(weekNum) {
            case 1:  {
                System.out.printf("Sunday");
                break;
            }
            case 2 :{
                System.out.printf("Monday");
                break;
            }
            case 3 :{
                System.out.print("Tuesday");
                break;
            }
            case 4 :{
                System.out.print("Wednesday");
                break;
            }
            case 5 :{
                System.out.print("Thursday");
                break;
            }
            case 6 :{
                System.out.print("Friday");
                break;
            }
            case 7 :{
                System.out.print("Saturday");
                break;
            }
            default: System.out.println("Invalid number! choose from 1 to 7");
        }
    }
}
