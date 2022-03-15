

import java.sql.*;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class BankData {
    Connection con ;
    Statement stm;
    ResultSet rs;
   
   PreparedStatement pst;
    
     public BankData(){
     try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bankmanagementsystem","root","rootwdp");
        stm = con.createStatement();
}
      catch(Exception b){
          System.out.print(b);
         
      }
     }
    
}
