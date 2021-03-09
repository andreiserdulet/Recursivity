package com.company.Cont;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cont cont = new Cont();
        System.out.println("Introduceti soldul");
        double sold = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Introduceti ID-ul");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti interesul anual");
        double anualInterestRate = scanner.nextDouble();
        scanner.nextLine();
        cont.aplicatie(sold, id, anualInterestRate);
    }
}
