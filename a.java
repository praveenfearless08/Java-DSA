package com.praveen;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double basicSalary = sc.nextDouble();
        char grade = sc.next().charAt(0);

        double hra = (20 * basicSalary) /100;
        double da = (50 * basicSalary)/100;
        double pf = (11 * basicSalary)/100;

        if(grade == 'a'){
            int allow = 1700;
            double totalSalary = basicSalary + hra + allow + da - pf;
            System.out.println((int)(totalSalary));
        }
        else if(grade == 'b'){
            int allow = 1500;
            double totalSalary = basicSalary + hra + allow + da - pf;
            System.out.println((int)(totalSalary));

        }
        else{
            int allow = 1300;
            double totalSalary = basicSalary + hra + allow + da - pf;
            System.out.println((int)(totalSalary));
        }

    }
}
