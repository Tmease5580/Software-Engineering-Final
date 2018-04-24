/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Checkout;

import grocery.Cart;
import grocery.Item;
import grocery.Sandwich;
import java.util.ArrayList;

/**
 *
 * @author thmease
 */
public class Receipt {
    protected Cart _theCart = Cart.getInstance();
    protected ArrayList<Item> _itemList = _theCart.getItems();
    protected ArrayList<Sandwich> _orderList = _theCart.getOrders();
    protected static Customer _customer = Customer.getInstance();
    protected String _output;
    public static String _sOutput;
    
    public void printReceipt(){
        _output = "Name of customer: " + _customer.getName() + "\n\n";  
        double total = 0.00;
        
        for(int i = 0; i < _itemList.size(); i++){
            Item itemA = _itemList.get(i);
            total = total + itemA.getPrice();
            _output += itemA.getName()+"\t\t"+itemA.getPrice()+"\n";
        }
        
        for(int j = 0; j < _orderList.size(); j++){
            Sandwich itemA = _orderList.get(j);
            total = total + itemA.cost();
            _output += itemA.getName()+"\t\t"+itemA.cost()+"\n";
        }
        
        _output += "\nSubtotal:\t\t"+String.format("%.2f",total)+"\n";
        _output += "Tax:      \t\t" + String.format("%.2f",(total * 0.06))+"\n";
        LoginContext context = _customer.getContext();
        double discount = context.executeStrategy();
        _output += "Discount:\t\t-" + String.format("%.2f",(total * discount))+"\n";
        total = total - (total * discount);
        
        if(_customer.getIsDelivery() == false){
            _output += "\nTotal:   \t\t" + String.format("%.2f",(total * 1.06))+"\n";
        }else{
            _output += "Delivery:\t\t" + String.format("$%.2f",(total * 0.05))+"\n";
            _output += "\nTotal:   \t\t" + String.format("$%.2f",(total * 1.11))+"\n";
        }
        _sOutput = _output;
    }
    public void printEstimate(){
        _output = "Name of customer: " + _customer.getName() + "\n\n";  
        double total = 0.00;
        
        for(int i = 0; i < _itemList.size(); i++){
            Item itemA = _itemList.get(i);
            total = total + itemA.getPrice();
            _output += itemA.getName()+"\t\t"+itemA.getPrice()+"\n";
        }
        
        for(int j = 0; j < _orderList.size(); j++){
            Sandwich itemA = _orderList.get(j);
            total = total + itemA.cost();
            _output += itemA.getName()+"\t\t"+itemA.cost()+"\n";
        }
        
        _output += "\nSubtotal:\t\t"+String.format("%.2f",total)+"\n";
        
        _sOutput = _output;
    }
    
    public static void setOutput(){
        
    }
}
