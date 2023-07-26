import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);


//1.Write a program that prints the numbers from 1 to 100 such that:
    //If the number is a multiple of 3, you need to print "Fizz" instead of that number.
    //If the number is a multiple of 5, you need to print "Buzz" instead of that number.
    //If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.

        for (int i = 1; i <= 100 ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
           } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
           } else System.out.println(i);
           }




//2.Write a Java program to reverse a string.
        System.out.println("Input a string");
        String text = data.nextLine();
        int i = text.length()-1;
        while (i >= 0) {
            System.out.print(text.charAt(i));
            i--;
        }




//3.Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
        System.out.println("Input a positive integer");
        int num = data.nextInt();
        for (int i =1 ; i<=12 ; i++){
            if(num >= 0){
                int mul = num * i;
                System.out.println(num +" * " + i + " = "+ mul);
            } else {
                System.out.println("You entered a negative number");
                break;
            }
        }




//4.Write a program to find the factorial value of any number entered through the keyboard.
        System.out.println("Input number");
        int number = data.nextInt();
        int factorial = 1;
        for (int i = 1 ; i <= number ; i++){
            factorial*=i;
        }
        System.out.print("The factorial value of "+ number + " is "+factorial);




//5.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
        System.out.println("Input first number");
        int first = data.nextInt();
        System.out.println("Input second number");
        int second = data.nextInt();

        int sum =1;
        for (int i = 0; i < second; i++) {
            sum *= first;
        }
        System.out.println(first+ " ^ "+ second + " = "+ sum);




//6.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        System.out.println("Input number of your integers");
        int numbers = data.nextInt();

        int i = 0;
        int even=0;
        int odd=0;

        System.out.println("Enter " +numbers +" integer");
        while ( i < numbers) {
            int integer = data.nextInt();
            if(integer % 2==0){
                even+=integer;
            } else odd+=integer;
            i++;
        }
        System.out.printf("The sum of even integers is: " + even + "%nThe sum of odd numbers is: " + odd);




//7.Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
        System.out.println("Input a positive integer");
        int positiveInt = data.nextInt();
        boolean isPrime = true;

        if(positiveInt<=1){
            System.out.print("The number is not prime");
        } else
            for (int i = 2; i <= positiveInt/2; i++) {
                if (positiveInt % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print("The number is prime");
            } else
                System.out.print("The number is not prime");




//8.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
        System.out.println("Input number of your wants enters");
        int times = data.nextInt();
        int countPositive=0;
        int countNegative=0;
        int countZeros=0;

        System.out.println("Enter "+ times +" number");
        for (int i=1;  i <= times; i++) {
            int _num = data.nextInt();

            if(_num > 0){
                countPositive++;

            } else if (_num < 0) {
                countNegative++;

            } else countZeros++;
        }
        System.out.printf("The number of positive is: " + countPositive +
                "%nThe number of negative is: "+ countNegative +
                "%nThe number of zeros is: " + countZeros);




// 9.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days (Days 1 -7) for each week.
        int weeksCount=0;
        int daysCount=0;
        for (int i=0; i<4; i++){
            weeksCount++;
            System.out.println("Week " +weeksCount);
            for (int j=0; j<7; j++){
                daysCount++;
                System.out.println("Day " +daysCount);
                if (daysCount==7){
                    daysCount=0;
                }
            }
        }




//10.Write a program thats check if the word is a palindrome or not. hint: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.
        System.out.println("Input the word");
        String word = data.nextLine();

        boolean isPalindrome=true;
        int i = 0;
        while ( i < word.length() / 2) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                isPalindrome = false;
                break;}
            i++;
        }
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

    }
}
