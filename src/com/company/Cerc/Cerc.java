package com.company.Cerc;

public class Cerc {
    private double raza;

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    public void AriaCercului(double raza){
        double ariacercului = (raza * raza) * Math.PI;
        System.out.printf("Aria cercului este de %.2f", ariacercului);
    }
}
