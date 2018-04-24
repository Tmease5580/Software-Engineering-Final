/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notwegmansonline;
import grocery.Item;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import nwUI.StartMenu;
/**
 *
 * @author liskiles
 */
public class NotWegmansOnline {
    public static void startMenu(){
        JFrame menu = new StartMenu();
        menu.setDefaultCloseOperation(EXIT_ON_CLOSE);
        menu.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        startMenu();
        
        /*try(Connection con = DBConnection.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM groceries");
            )
        {
            ArrayList<Item> inventory =DBConnection.setGroceries(rs);
            for(int i=0;i<inventory.size();i++){
                System.out.println(inventory.get(i));
            }
        }*/
        
    }
    
}
