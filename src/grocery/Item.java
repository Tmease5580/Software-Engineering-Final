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
public class Item {
    private final int _itemNum;
    private final String _name;
    private final double _price;
    private final String _description;
    private final String _imageName;
    
    public Item(int itemNum, String name, double price, String description, String imageName){
        _itemNum=itemNum;
        _name=name;
        _price=price;
        _description=description;
        _imageName=imageName;
    }
    public int getNum(){
        return _itemNum;
    }
    public String getName(){
        return _name;
    }
    public double getPrice(){
        return _price;
    }
    public String getDescription(){
        return _description;
    }
    public String getImage(){
        return _imageName;
    }
    
    @Override
    public boolean equals(Object o){
        
        boolean toReturn;
        if(this==o){
            toReturn=true;
        }else if(o==null){
            toReturn=false;
        }else if(getClass()!=o.getClass()){
            toReturn = false;
        }else{
            Item i = (Item)o;
            toReturn = (this._itemNum==i._itemNum);
        }
        
        return toReturn;
    }
    
    public String toString(){
        String item = _itemNum+" "+_name+" "+_description+" "+_price+" "+_imageName; 
        return item;
    }
}
