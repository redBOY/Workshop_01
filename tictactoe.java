package main.day5;

import java.util.Scanner;
public class evenodd {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int c = sc.nextInt();

        if (c % 2 == 0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
    }
}
