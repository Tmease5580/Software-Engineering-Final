/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery;

/**
 *
 * @author throgers
 */
public class ItalianSandwich extends Sandwich{
    
    public ItalianSandwich(){
        _name="Italian Sandwich";
        _description="An Italian Sandwich";
        _cost=6;
    }
    
    public double cost(){
        return _cost;
    }
}
