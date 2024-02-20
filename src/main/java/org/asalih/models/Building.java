package org.asalih.models;

public abstract class Building {
    private double price;
    private double meterSquare;
    private int rooms;
    private int livingRooms;

    public Building(double price, double meterSquare, int rooms, int livingRooms) {
        this.price = price;
        this.meterSquare = meterSquare;
        this.rooms = rooms;
        this.livingRooms = livingRooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public double getMeterSquare() {
        return meterSquare;
    }

    public void setMeterSquare(double meterSquare) {
        this.meterSquare = meterSquare;
    }

    public int getLivingRooms() {
        return livingRooms;
    }

    public void setLivingRooms(int livingRooms) {
        this.livingRooms = livingRooms;
    }

    @Override
    public String toString() {
        return "Building{" +
                "price=" + price +
                ", meterSquare=" + meterSquare +
                ", rooms=" + rooms +
                ", livingRooms=" + livingRooms +
                '}';
    }
}
