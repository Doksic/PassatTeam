package com.Passat.Passat.model;

public class Weapon {
    private String name;
    private String type;
    private String serialNumber;
    private int quantity;
    private String description;

    public Weapon() {}

    public Weapon(String name, String type, String serialNumber, int quantity, String description) {
        this.name = name;
        this.type = type;
        this.serialNumber = serialNumber;
        this.quantity = quantity;
        this.description = description;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getSerialNumber() { return serialNumber; }
    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
