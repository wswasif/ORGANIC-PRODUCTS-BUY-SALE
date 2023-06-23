/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organicproductsell;

/**
 *
 * @author Wasif
 */
public class Product {
    private int id;
    private String name;
    private float price;
    private String date;
    private byte[] picture;
    
    public Product(int pid,String pname,float pprice,String pdate,byte[] ppicture)
    {
        this.id=pid;
        this.name=pname;
        this.price=pprice;
        this.date=pdate;
        this.picture=ppicture;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getprice(){
        return price;
    }
    public String getDate(){
        return date;
    }
    public byte[] getimage(){
        return picture;
    }
    
}
