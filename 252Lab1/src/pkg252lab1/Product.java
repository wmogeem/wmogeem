/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg252lab1;

abstract class Product {
    private int id;
    private double price;
    private String name;
    private static int quantity = 0;
    
    
    public Product (int id, double price, String name){
        this.id = id;
        this.price = price;
        this.name = name;
        this.quantity ++;
    }

 
    public void applySaleDiscount(double percentage){
        this.price = this.price - ((percentage/10) * this.price);
    }
    
    public void addToShoppingCart(){
        System.out.println(this.name + "has been added to the shopping cart");
    }
    
    public void printTotalQuantity(){
        System.out.println("Total Quantity: " + this.quantity);
    }
    
    abstract void getSellableStats();

    
    
    public String toString(){
return "Product info:\n+Id: " + this.id + "\t" + "name" + this.name +
"\tPrice: SR" + this.price;
} 
    
}
