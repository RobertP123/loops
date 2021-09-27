package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("which times table do you want");
        int input = sc.nextInt();
	for (int i = 0; i <= 10; i++){
        System.out.println(i + " times " + input + " = " +(i * input));
    }
    }
}
