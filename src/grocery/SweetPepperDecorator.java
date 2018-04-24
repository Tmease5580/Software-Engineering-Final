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
public class SweetPepperDecorator extends Sandwich{
    private final double _decoratorCost=.25;
    private final String _decoratorName= " (Sweet Peppers)";
    private final String _decoratorDesc= ", thin slices of delicious peppers";
    
    Sandwich sandwich;
    
    public SweetPepperDecorator(Sandwich sandwich){
        this.sandwich=sandwich;
    }
    
    public String getName(){
        return sandwich.getName()+_decoratorName;
    }
    
    public String getDesc(){
        return sandwich.getDesc()+_decoratorDesc;
    }
    
    public double cost(){
        return sandwich.cost()+_decoratorCost;
    }
    
}
