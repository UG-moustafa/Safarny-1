/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Elzorkany
 */
public class Orders {
    
    static Connection connection=connec.getConnection();
    
    
    /////////////  START FROM HERE .. P.S  WRITE COMMENTS ABOVE UR METHUODS  **//////////////////
    
    // moutstafa mahmoud  
    
    // insert into country table   
    
    public void inset_into_country (Project.Model.model model){
        try {
            Statement statement = connection.createStatement();
             String Query = "insert into contries( contry_name, price_on_go_pass, price_on_go_childern, price_on_go_baby,p_on_go_back_pass,p_on_go_back_children,p_on_go_back_baby)values('" + model.get_country_name() + "','" + model.get_price_on_go_pass() + "','" + model.get_price_on_go_childern() + "','" + model.get_price_on_go_baby() +"','" + model.get_p_on_go_back_pass() +"','" + model.get_p_on_go_back_childern() +"','" + model.get_p_on_go_back_baby() + "')";
//             String Query = "insert into contries( contry_name, price_on_go_pass, price_on_go_childern, price_on_go_baby,p_on_go_back_pass,p_on_go_back_children,p_on_go_back_baby)values('gggg',5,65,34,343,34,34)";
            statement.execute(Query);
        } catch (SQLException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,  " Erooor  in " + ex) ;
        }
      
    
    }// ent of insert method in country 
    
   // insert into hotels 
    
//    public void isert_into_hotels(Project.Model.model mode){
//        try {
//            Statement statement =connection.createStatement();   
//            String Query="insert into hotels( country_id , hotel_name, price_at_night, phone,address)values('" + mode.get_country_id() + "','" + mode.get_hotel_name() + "','"  + mode.get_price_at_night() + "','" + mode.get_phone() +"','" + mode.get_address() + "')";
//            
//            
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    
//    
//    }
    
    // method to add hotel 
    
    public void isert_into_hotel(Project.Model.model modeHOtel){
        try {
            Statement statement = connection.createStatement();
           String Query = "insert into hotels( country_id , hotel_name, price_at_night, phone,address)values('1','"+modeHOtel.get_hotel_name()+"','"+modeHOtel.get_phone()+"','"+modeHOtel.get_price_at_night()+"','"+modeHOtel.get_address()+"')";
           // String Query = "insert into contries( contry_name, price_on_go_pass, price_on_go_childern, price_on_go_baby,p_on_go_back_pass,p_on_go_back_children,p_on_go_back_baby)values('gggg',5,65,34,343,34,34)";
            //String Qrery = "insert into hotels( country_id , hotel_name, price_at_night,phone,address)values('1','3','3','5','5')";
            statement.executeQuery(Query);
            
         } catch (SQLException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
