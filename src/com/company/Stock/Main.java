package com.company.Stock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Introduceti pretul anterior");
            double closingPrice = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Introduceti pretul curent");
            double currentPrice = scanner.nextDouble();
            scanner.nextLine();
            Stock stock = new Stock("Simbol", " Stock", closingPrice, currentPrice);
            int optiune = -1;
            System.out.println("Alege o optiune ! ");
            afisareMeniu();

            while (optiune != 0) {
                optiune = scanner.nextInt();
                if (optiune == 1) {
                    System.out.println("Pretul anterior: " + stock.getClosingPrice() + "\n");
                    afisareMeniu();

                } else if (optiune == 2) {
                    System.out.println("Pretul curent: " + stock.getCurrentPrice() + "\n");
                    afisareMeniu();

                } else if (optiune == 3) {
                    System.out.printf("Procentul modificat: %.2f ", stock.getChangePercent() + "\n");
                    afisareMeniu();

                }
            }
        } catch (Exception e) {
            afisareMeniu();


        }

    }

    public static void afisareMeniu() {
        System.out.println("1.Afiseaza pretul anterior");
        System.out.println("2.Afiseaza pretul curent");
        System.out.println("3.Procentul modificat");
        System.out.println("0.Exit");
    }
}
