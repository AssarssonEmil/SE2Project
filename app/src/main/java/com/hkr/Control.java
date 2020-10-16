package com.hkr;

public class Control {

    private int id;
    private String name;
    private boolean isWritable;
    private String dataType;
    private boolean state;

    public Control() {
    }

    public Control(int id, String name, boolean isWritable, String dataType, boolean state) {
        this.id = id;
        this.name = name;
        this.isWritable = isWritable;
        this.dataType = dataType;
        this.state = state;
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

    public boolean isWritable() {
        return isWritable;
    }

    public void setWritable(boolean writable) {
        isWritable = writable;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
