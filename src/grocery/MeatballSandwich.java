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
public class MeatballSandwich extends Sandwich{
    
    public MeatballSandwich(){
        _name="Meatball Sandwich";
        _description="A Meatball Sandwich";
        _cost=6;
    }
    
    public double cost(){
        return _cost;
    }
}
