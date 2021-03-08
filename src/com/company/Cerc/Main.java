package com.company.Cerc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti raza cercului: ");
        double raza = scanner.nextDouble();
        Cerc cerc = new Cerc();
        cerc.AriaCercului(raza);

    }
}
