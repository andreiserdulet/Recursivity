package com.company.Cont;

import java.util.Scanner;

public class Cont {
    private int id = 0;
    private double sold = 0;
    private double anualInterestRate = 0;
    private String dataCreate;
    Scanner scanner = new Scanner(System.in);

    Cont() {

    }

    public Cont(int id, double sold) {
        this.id = id;
        this.sold = sold;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public double getAnualInterestRate() {
        return anualInterestRate;
    }

    public void setAnualInterestRate(double anualInterestRate) {
        this.anualInterestRate = anualInterestRate;
    }

    public String getDataCreate() {
        return dataCreate;
    }

    public void setDataCreate(String dataCreate) {
        this.dataCreate = dataCreate;
    }



    void afisareMeniu() {
        System.out.println();
        System.out.println("1.Afisare id cont. " + "\n2.Afisare sold curent." + "\n3.Afisare anualInterest" + "\n4.Depunere " + "\n5.Retragere" + "\n6.Interes lunar" + "\n0.Exit");
        System.out.println();

    }

    void aplicatie(double sold, int id, double anualInterestRate) {
        afisareMeniu();
        int optiune = -1;
        System.out.println("Alegeti o optiune");
        while (optiune != 0) {
            optiune = scanner.nextInt();
            scanner.nextLine();
            if (optiune == 1) {
                System.out.println("Id-ul este: " + id);
                System.out.println("Alegeti o optiune");
                afisareMeniu();
            } else if (optiune == 2) {
                System.out.println("Soldul curent este de: " + sold);
                System.out.println("Alegeti o optiune");
                afisareMeniu();
            } else if (optiune == 3) {
                System.out.println("Interesul anual este de: " + anualInterestRate);
                System.out.println("Alegeti o optiune");
                afisareMeniu();
            } else if (optiune == 4) {
                System.out.println("Introduceti suma pe care doriti sa o puneti");
                double sumaDepusa = scanner.nextDouble();
                scanner.nextLine();
                double total = sumaDepusa + sold;
                System.out.println("Ati depus suma " + sumaDepusa + " de lei");
                System.out.println("Aveti in total " + total + " de lei in cont");
                System.out.println("Alegeti o optiune");
                afisareMeniu();
            } else if (optiune == 5) {
                System.out.println("Ce suma doresti ? ");
                double sumaRetrasa = scanner.nextDouble();
                scanner.nextLine();
                double total = sold -sumaRetrasa;
                if (sumaRetrasa > sold) {
                    System.out.println("Nu aveti destui bani");
                    System.out.println("Alegeti o optiune");
                    afisareMeniu();
                } else {
                    System.out.println("Ati retras " + sumaRetrasa + "de lei cu succes");
                    System.out.println("Sold curent: " + total);
                    System.out.println("Alegeti o optiune" + "\n");
                    afisareMeniu();
                }

            } else if (optiune == 6) {
                double taxa = sold - (anualInterestRate / 100 * sold);
                System.out.println(taxa);
                System.out.println("Alegeti o optiune");
                afisareMeniu();
            }
        }
    }
    //Metodele cerute in problema ceruta
    public double monthlyInterestRate(double sold, double anualInterestRate) {
        this.sold = sold;
        this.anualInterestRate = anualInterestRate;
        double taxa = sold - (anualInterestRate / 100 * sold);
        return taxa;
    }

    public double retragere(double sold) {
        System.out.println("Ce suma doresti ? ");
        double sumaRetrasa = scanner.nextDouble();
        scanner.nextLine();
        if (sumaRetrasa > sold) {
            System.out.println("Nu aveti destui bani");
        } else {
            System.out.println("Ati retras " + sumaRetrasa + "de lei cu succes");
            System.out.println("Sold curent: " + (sold - sumaRetrasa));
        }
        return sumaRetrasa;


    }

    public double depunere() {
        System.out.println("Introduceti suma pe care doriti sa o puneti");
        double sumaDepusa = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ati depus suma " + sumaDepusa + " de lei");
        System.out.println("Aveti in total " + (sumaDepusa + sold) + " de lei in cont");
        return sumaDepusa;
    }
}
