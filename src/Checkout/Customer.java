/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Checkout;

/**
 *
 * @author thmease
 */
public class Customer {
    private String _name;
    private String _address;
    private LoginContext _context = new LoginContext();
    private static Boolean _isDelivery;
    private static boolean _hasLoggedIn;
    private String _cardNumber;
    private static Customer _instance = null;
    
    
    private Customer(){
        _hasLoggedIn=false;
        _isDelivery=null;
    }
    
    public static Customer getInstance(){
        if(_instance==null){
            _instance = new Customer();
        }
        return _instance;
    }
    
    public void setName(String name){
        _name=name;
    }
    
    public void setAddress(String address){
        _address=address;
    }
    
    public void setContext(LoginContext context){
        _context=context;
    }
    
    public void setCardNumber(String cardNumber){
        _cardNumber=cardNumber;
    }
    
    public static void setIsDelivery(boolean isDelivery){
        _isDelivery=isDelivery;
    }
    
    public static void setHasLoggedIn(boolean hasLoggedIn){
        _hasLoggedIn=hasLoggedIn;
    }
    
    public LoginContext getContext(){
        return _context;
    }
    
    public String getName(){
        return _name;
    }
    
    public String getAddress(){
        return _address;
    }
    
    public static Boolean getIsDelivery(){
        return _isDelivery;
    }
    
    public static boolean getHasLoggedIn(){
        return _hasLoggedIn;
    }
}
