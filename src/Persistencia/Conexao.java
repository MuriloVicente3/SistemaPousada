/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;





/**
 *
 * @author muril
 */
public class Conexao {
    public Connection conexaoBD(){
            Connection conn = null;
            
            try {
                String url = "jdbc:mysql://localhost:3306/pousada?user=root&password=";
                conn = DriverManager.getConnection(url);
                
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, erro.getMessage());
            }
            return conn;
        }
}
        
    
       

