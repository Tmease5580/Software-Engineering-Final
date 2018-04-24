/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notwegmansonline;

import grocery.Item;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author thmease
 */
public class DBConnection {
    private static final String _username = "tmease";
    private static final String  _password = "root";
    private static final String _connection = "jdbc:mysql://localhost/NotWegmansOnline";
    
    public static Connection getConnection() throws SQLException{
        
        return DriverManager.getConnection(_connection, _username, _password);
    }
    
    public static ArrayList<Item> setGroceries(ResultSet groceries) throws SQLException{
        ArrayList<Item> inventory = new ArrayList();
        int i=1;
        int id;
        String name;
        double price;
        String description;
        String imageName;
        Item item;
        while(groceries.next()){
            groceries.absolute(i);
            id = groceries.getInt("itemID");
            name = groceries.getString("name");
            price = groceries.getDouble("price");
            description = groceries.getString("description");
            imageName = groceries.getString("imageName");
            
            item = new Item(id,name,price,description,imageName);
            inventory.add(item);
            i++;
            
        }
        
        return inventory;
    }
    
    public static boolean validateLogin(String username, String password)throws SQLException{
                
        boolean isValid = false;
        String checkUsername;
        String checkPassword;
        int i=1;
        try(Connection con = DBConnection.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            )
        {
            int rsSize = 0;
            rs.last();
            rsSize=rs.getRow();
            rs.first();
            while((!isValid||rs.next())&&i<=rsSize){
                rs.absolute(i);
                checkUsername=rs.getString("username");
                checkPassword=rs.getString("password");
                if(checkUsername.equalsIgnoreCase(username)&&checkPassword.equals(password)){
                    isValid=true;
                }
                i++;
            }
        
        }
        return isValid;
    }
    
    public static boolean validateEmail(String domain)throws SQLException{
        
        boolean isValid = false;
        String checkDomain;
        int i=1;
        
        try(Connection con = DBConnection.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM collegedomains");
            )
        {
            int rsSize = 0;
            rs.last();
            rsSize=rs.getRow();
            rs.first();
            
            while((!isValid||rs.next())&&i<=rsSize){
                rs.absolute(i);
                checkDomain=rs.getString("collegedomains");
                if(checkDomain.equalsIgnoreCase(domain)){
                    isValid=true;
                }
                i++;
            }
        }
        
        
        return isValid;
    }
}
