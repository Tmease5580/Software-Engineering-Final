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
public class StudentStrategy implements LoginStrategy{
    
    private double _discount = .05;
    
    public double setDiscount(){
        return _discount;
    }
}
