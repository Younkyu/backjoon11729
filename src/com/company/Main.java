package com.company;

import java.util.Scanner;

public class Main {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        hanoi(1,3,2, count);
        System.out.println((int)Math.pow(2,count) - 1);
        System.out.println(sb.toString());
    }

    public static void hanoi (int from, int to, int center, int count) {
        if(count == 0) return;
        else if(count == 1) {
            sb.append(from + " " + to);
            sb.append(System.lineSeparator());
        } else {
            hanoi(from, center, to, count -1);
            sb.append(from + " " + to);
            sb.append(System.lineSeparator());
            hanoi(center, to, from, count -1);
        }
    }
}
