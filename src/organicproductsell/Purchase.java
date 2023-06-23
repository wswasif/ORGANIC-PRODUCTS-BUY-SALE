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
public class Purchase {
    private int id;
    private String name;
    private String purchase;
    
    public Purchase(int pid,String pname,String ppurchase){
        this.id=pid;
        this.name=pname;
        this.purchase=ppurchase;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getPurchase(){
        return purchase;
    }
    
}
