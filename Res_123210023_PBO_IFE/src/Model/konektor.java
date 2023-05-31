/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PC PRAKTIKUM
 */
import Model.ModelMovie;
import View.ViewMovie;
import java.sql.*;
import javax.swing.JOptionPane;

public class konektor {
    String DBurl="jdbc:mysql://localhost/movie";
    String DBusername="root";
    String DBpassword="";
    Connection koneksi;
    Statement state;
    public konektor(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi=DriverManager.getConnection(DBurl,DBusername, DBpassword);
            System.out.println("koneksi berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("koneksi gagal bang");
        }
        
    }          
}
