package com.ghostfacedlabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter a word to check if palindrome");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder s = new StringBuilder();

        s.append(input);
        s.reverse();

        String reversed = s.toString();

        if (reversed.equals(input)) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }
}
