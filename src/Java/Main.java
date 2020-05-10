package Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int arraySize=scanner.nextInt();
        int array[]=new int[arraySize];
        System.out.println("Enter values of array:");
        for(int i=0;i<arraySize;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("Enter a number for search:");
        int number = scanner.nextInt();
        int i;
        for( i=0;i<arraySize;i++){
            if(number==array[i]) {
                System.out.println(number + " is present at location " + (i + 1));
                break;
            }

        }
        if(i==arraySize)
            System.out.println("Number not found:");


    }
}
