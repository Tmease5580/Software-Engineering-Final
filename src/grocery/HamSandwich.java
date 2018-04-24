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
public class HamSandwich extends Sandwich{
    
    public HamSandwich(){
        _name="Ham Sandwich";
        _description="A Ham Sandwich";
        _cost=5;
    }
    
    public double cost(){
        return _cost;
    }
}
