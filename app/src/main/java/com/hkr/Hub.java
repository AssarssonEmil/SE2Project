package com.hkr;

public class Hub {

    private int id;
    private String name;
    private Device[] devices;

    public Hub() {
    }

    public Hub(int id, String name, Device[] devices) {
        this.id = id;
        this.name = name;
        this.devices = devices;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Device[] getDevices() {
        return devices;
    }

    public void setDevices(Device[] devices) {
        this.devices = devices;
    }
}
