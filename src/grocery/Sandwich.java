/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery;

/**
 *
 * @author thmease
 */
public abstract class Sandwich {
    String _name;
    String _description;
    double _cost;
    
    public String getName(){
        return _name;
    }
    
    public String getDesc(){
        return _description;
    }
    
    public abstract double cost();
    
    public boolean equals(Object o){
        
        boolean toReturn;
        if(this==o){
            toReturn=true;
        }else if(o==null){
            toReturn=false;
        }else if(getClass()!=o.getClass()){
            toReturn = false;
        }else{
            Sandwich s = (Sandwich)o;
            toReturn = (this._name.equals(s._name) && this._description.equals(s._description) && this._cost==s._cost);
        }
        
        return toReturn;
    }
}