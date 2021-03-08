package com.company.Dreptunghi;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

            try {


                System.out.println("Introduceti lungimea");
                int lun = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduceti latiema");
                int lat = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Alege o optiune");
                int optiune = -1;
                while (optiune != 0) {
                    optiune = scanner.nextInt();
                    System.out.println("1.Calculeaza aria dreptunghiului");
                    System.out.println("2.Calculeaza perimetrul dreptunghiului");
                    System.out.println("0.Exit");
                    if (optiune == 1) {
                        rectangle.getArea(lun, lat);
                    } else if (optiune == 2) {
                        rectangle.getPerimeter(lun, lat);
                    }
                }
            } catch (Exception e) {
                System.out.println("Introdu cifre !");

            }

    }
}
