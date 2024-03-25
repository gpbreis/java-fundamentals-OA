package br.com.gpbreis;

public class Product {

    private int item;
    private String name;
    private int unitsInStock;
    private double price;
    private boolean active = true;

    private double getInventoryValue() {
        return this.price * this.unitsInStock;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Product() {
    }

    public Product(int item, String name, int unitsInStock, double price) {
        this.item = item;
        this.name = name;
        this.unitsInStock = unitsInStock;
        this.price = price;
    }

    public void addToInventory(int quantity) {
        this.unitsInStock += quantity;
    }

    public void deductFromInventory(int quantity) {
        if (this.unitsInStock > 0 && this.unitsInStock - quantity >= 0) {
            this.unitsInStock -= quantity;
        }
    }

    @Override
    public String toString() {
        return "Item Number\t\t : " + this.item +
                "\nName\t\t\t : " + this.name +
                "\nQuantity in stock: " + this.unitsInStock +
                "\nPrice\t\t\t : " + this.price +
                "\nStock Value\t\t : " + getInventoryValue() +
                "\nProduct Status\t : " + (this.active ? "Active" : "Discontinued");
    }
}
