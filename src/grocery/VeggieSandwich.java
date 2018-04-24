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
public class VeggieSandwich extends Sandwich{
    
    public VeggieSandwich(){
        _name="Veggie Sandwich";
        _description="A Veggie Sandwich";
        _cost=7;
    }
    
    public double cost(){
        return _cost;
    }
}
