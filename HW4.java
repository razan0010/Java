import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        

//1.Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2
        System.out.println("Enter the length of the array (must be greater than or equal to 2): ");
        int length = data.nextInt();
        if (length>=2) {
            int[] numbers = new int[length];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < length; i++) {
                numbers[i] = data.nextInt();
            }
            boolean isSame;

            if (numbers[0] == numbers[numbers.length - 1]) {
                isSame = true;
                System.out.printf("Array = " + Arrays.toString(numbers) + "%nThe first and last elements are the same " + "(" + isSame + ")");
            } else {
                isSame = false;
                System.out.printf("Array = " + Arrays.toString(numbers) + "%nThe first and last elements are not the same " + "(" + isSame + ")");
            }
        } else System.out.println("Wrong! the length is less than 2");




//2.Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order
        System.out.println("Enter the size of the array: ");
        int size = data.nextInt();
        int[] _array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            _array[i] = data.nextInt();
        }
        System.out.println("Enter the key of the array: ");
        int k = data.nextInt();

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size- i - 1; j++) {
                if (_array[j] < _array[j + 1]) {
                    int temp = _array[j];
                    _array[j] = _array[j + 1];
                    _array[j + 1] = temp;
                }
            }
        }
        if (k <= size) {
            System.out.print(k + " largest elements of the said array are:");
            for (int i = 0; i < k; i++) {
                System.out.print(" " + _array[i]);
            }
        } else  System.out.print("You entered number larger than size of key (" +size+")");



//3.Write a Java program to find the numbers greater than the average of the numbers of a given array.
        System.out.println("Enter the size of the array: ");
        int _size = data.nextInt();
        int[] _arr = new int[_size];

        int sum=0;

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < _size; i++) {
            _arr[i] = data.nextInt();
            sum+=_arr[i];
        }
        double avg = sum/_size;
        System.out.printf("The average of the said array is: " + avg +"%nThe numbers in the said array that are greater than the average are:");
        for (int element :_arr) {
            if(element > avg){
                System.out.print(" " +element);
            }
        }



//4.Write a Java program to get the larger value between first and last element of an array of integers.
        int [] _numbers = new int[3];

        System.out.println("Enter 3 elements of the array:");
        for (int i = 0; i < _numbers.length; i++) {
            _numbers[i] = data.nextInt();
        } if (_numbers[0] > _numbers[_numbers.length -1]){
            System.out.printf("Larger value is the first element: (" +_numbers[0] +")");
        } else System.out.printf("Larger value is the last element: (" + _numbers[_numbers.length -1] +")");




//5.Write a Java program to swap the first and last elements of an array and create a new array.
        int[] firstArray = new int[3];
        int[] swapArray = new int[3];

        System.out.println("Enter 3 elements of the array:");
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = data.nextInt();
        }
        int temp = firstArray[0];
        firstArray[0] = firstArray[firstArray.length - 1];
        firstArray[firstArray.length - 1] = temp;

        for (int i = 0; i < firstArray.length; i++) {
            swapArray[i] = firstArray[i];
        }
        System.out.printf("Array after swap: "+ Arrays.toString(swapArray));



//6.Write a Java program to find all of the longest word in a given dictionary.
        String[] words = { "cat", "dog", "red", "is", "am" };

        int longest = 0;
        for (String word : words) {
            if (word.length() > longest) {
                longest = word.length();
            }
        }
        for (String word : words) {
            if (word.length() == longest) {
                System.out.println(word);
            }
        }



//7.Write a menu driven Java program with following option:Accept elements of an array
        //1.Display elements of an array
        //2.Search the element within array
        //3.Sort the array
        //4.To Stop
        //the size of the array should be entered by the user.

        int select;
        int[] array = null;
        int size2 = 0;

        do {
            System.out.printf("Select number from menu: %n1.Accept elements of an array " +
                    "%n2.Display elements of an array" +
                    " %n3.Search the element within array" +
                    "%n4.Sort the array %n5.Stop");


            System.out.print("Select from the menu: ");
            select = data.nextInt();

            switch (select) {
                case 1:
                    System.out.print("Enter the size of the array: ");
                    size2 = data.nextInt();
                    array = new int[size2];
                    for (int i = 0; i < size2; i++) {
                        System.out.print("Enter element " + (i + 1) + ": ");
                        array[i] = data.nextInt();
                    }
                    break;
                case 2:
                    if (array != null) {
                        System.out.println(Arrays.toString(array));
                    } else {
                        System.out.println("Array is empty!");
                    }
                    break;
                case 3:
                    if (array != null) {
                        System.out.print("Enter the element to search: ");
                        int searchElement = data.nextInt();
                        boolean found = false;
                        for (int i : array) {
                            if (i == searchElement) {
                                found = true;
                                break;
                            }
                        }
                        if (found) {
                            System.out.println(searchElement + " is present in the array.");
                        } else {
                            System.out.println(searchElement + " is not present in the array.");
                        }
                    } else {
                        System.out.println("Array is empty");
                    }
                    break;
                case 4:
                    if (array != null) {
                        Arrays.sort(array);
                        System.out.println("Sorted Array :" + Arrays.toString(array));
                    } else {
                        System.out.println("Array is empty");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid number! select from the menu!");
            }
        } while (select != 5);




//8.Write a program thats displays the number of occurrences of an element in the array.
        System.out.print("Enter the size of the array: ");
        int __size = data.nextInt();
        int[] arr = new int[__size];
        int element = 0;

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < __size; i++) {
            arr[i] = data.nextInt();
        }
        for (int e:arr) {
            element=e;
        int count = -1;
        for (int i = 0; i < __size; i++) {
            if (arr[i] == element) {
                count++;
            }
        }

            System.out.println(element + " occurs " + count + " times");
        }






////9.Write a program that places the odd elements of an array before the even elements.
        System.out.print("Enter the size of the array: ");
        int arrayLength = data.nextInt();
        int[] numbers = new int[arrayLength];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = data.nextInt();
        }

        System.out.println("Array before sorted: "+Arrays.toString(numbers));

        int oddCount = 0;
        int evenCount = arrayLength- 1;

        while (oddCount < evenCount) {
            while (numbers[oddCount] % 2 != 0) {
                oddCount++;
            }
            while (numbers[evenCount] % 2 == 0) {
                evenCount--;
            }

            if (oddCount < evenCount) {
                int tempr = numbers[oddCount];
                numbers[oddCount] = numbers[evenCount];
                numbers[evenCount] = tempr;
            }
        }
         System.out.println("Array after sorted: "+Arrays.toString(numbers));



//10. Write a program that test the equality of two arrays.
        System.out.print("Enter the size of the arrays: ");
        int arraysSize = data.nextInt();
        int[] arr1 = new int[arraysSize];
        int[] arr2 = new int[arraysSize];

        System.out.println("Enter the elements of the array 1:");
        for (int i = 0; i < arraysSize; i++) {
            arr1[i] = data.nextInt();
        }
        System.out.println("Enter the elements of the array 2:");
        for (int i = 0; i < arraysSize; i++) {
            arr2[i] = data.nextInt();
        }

        boolean isEquality = true;

        for (int i = 0; i < arraysSize; i++) {
            if (arr1[i] != arr2[i]) {
                isEquality = false;
            }
        }
        if(isEquality) {
            System.out.println("The arrays are equality (" + isEquality + ")");
        } else System.out.println("The arrays are not equality (" + isEquality + ")");

    }
}
