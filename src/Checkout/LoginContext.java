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
public class LoginContext {
    private LoginStrategy _strategy = new NonmemberStrategy();
    
    public void setStrategy(LoginStrategy strategy){
        _strategy=strategy;
    }
    
    public double executeStrategy(){
        double discount = _strategy.setDiscount();
        return discount;
    }
}
