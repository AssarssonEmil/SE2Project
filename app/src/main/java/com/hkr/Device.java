package com.hkr;

public class Device {

    private int id;
    private String name;
    private String type;
    private Control[] control;

    public Device() {
    }

    public Device(int id, String name, String type, Control[] control) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.control = control;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Control[] getControl() {
        return control;
    }

    public void setControl(Control[] control) {
        this.control = control;
    }
}
