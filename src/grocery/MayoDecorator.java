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
public class MayoDecorator extends Decorator{
    
    
    private final double _decoratorCost=.09;
    private final String _decoratorName= " (Extra Mayo)";
    private final String _decoratorDesc= ", a dollop of mayo";
    
    Sandwich sandwich;
    
    public MayoDecorator(Sandwich sandwich){
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
