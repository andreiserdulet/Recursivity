package com.company.Dreptunghi;

public class Rectangle {
    private int lat;
    private int lun;
    public Rectangle(){


    }
    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public int getLun() {
        return lun;
    }

    public void setLun(int lun) {
        this.lun = lun;
    }
    public int getArea(int lun, int lat){
        int getArea = lat * lun;
        System.out.println("Aria este de: " + getArea);
        return getArea;

    }
    public int getPerimeter(int lun, int lat){
        int getPerimeter = 2 * (lat + lun);
        System.out.println("Perimetrul este de: " + getPerimeter);
        return getPerimeter;
    }
}
