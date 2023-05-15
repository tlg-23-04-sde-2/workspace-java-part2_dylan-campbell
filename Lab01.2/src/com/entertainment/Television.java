package com.entertainment;

public class Television {
    // instance fields
    private String brand;
    private int volume;
    private Tuner tuner = new Tuner();

    // constructors
    public Television() {
    }

    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    // business methods
    public int getCurrentChannel() {
        return tuner.getChannel();
    }

    public void changeChannel(int channel) {
        tuner.setChannel(channel);
    }

    // accessor methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String toString() {
        return getClass().getSimpleName() +
                " [brand=" + getBrand() +
                ", volume=" + getVolume() +
                ", currentChannel=" + getCurrentChannel() +
                "]";
        /*
        return "Television [brand=" + getBrand() +
                ", volume=" + getVolume() +
                ", currentChannel=" + getCurrentChannel() +
                "]";
         */
    }
}