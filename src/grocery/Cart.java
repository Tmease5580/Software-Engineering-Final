/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery;
import java.util.ArrayList;
/**
 *
 * @author thmease
 */
public class Cart {
    
    private ArrayList<Item> _listOfItems;
    private ArrayList<Sandwich> _listOfOrders;
    private static Cart _instance = null;
    
    private Cart(){
        _listOfItems = new ArrayList<Item>();
        _listOfOrders = new ArrayList<Sandwich>();
    }
    
    public ArrayList<Item> getItems(){
        return _listOfItems;
    }
    
    public ArrayList<Sandwich> getOrders(){
        return _listOfOrders;
    }
    
    public static Cart getInstance(){
        if(_instance==null){
            _instance = new Cart();
        }
        return _instance;
    }
    
    public void addItem(Item item){
        _listOfItems.add(item);
    }
    
    public void removeItem(Item item){
        _listOfItems.remove(item);
        
    }
    
    public void addSandwich(Sandwich sandwich){
        _listOfOrders.add(sandwich);
    }
    
    public void removeSandwich(Sandwich sandwich){
        _listOfOrders.remove(sandwich);
    }
    
    public void setItems(ArrayList<Item> newItems){
        _listOfItems = newItems;
    }
    
    public void setOrders(ArrayList<Sandwich> newOrders){
        _listOfOrders=newOrders;
    }
}
