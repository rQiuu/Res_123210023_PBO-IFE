/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PC PRAKTIKUM
 * 
 */
import java.sql.*;
import com.mysql.cj.protocol.Resultset;
import javax.swing.JOptionPane;

public class ModelMovie extends konektor{
    
    public String[][]ReadTabel(){
        String data[][]=new String[1000][5];
        try {
            int jmlh=0;
            String query = "SELECT * FROM movie";
            
            state = koneksi.createStatement();
            ResultSet result = state.executeQuery(query);
            state.close();
            while (result.next()) {                
                data[jmlh][0]=result.getString("judul");
                data[jmlh][1]=result.getString("alur");
                data[jmlh][2]=result.getString("penokohan");
                data[jmlh][3]=result.getString("akting");
                jmlh++;
            }
            return data;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRORRR");
        }
        
    }
    
    public void Tambah(String judul, int alur, int penokohan, int akting, int nilai){
        try {
            String query = "INSERT INTO `movie` VALUES " + "("
                    + "'"+ judul +"',"+ alur +","+ penokohan +","+ akting +","+ nilai +")";
            
            state = koneksi.createStatement();
            state.executeUpdate(query);
            state.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "EORROR");
        }
        return false;   
    }
    
    public void Hapus(String judul){
        try {
            String query = "SELECT FROM movie WHERE judul='"+judul+"'";

            state = koneksi.createStatement();
            state.executeUpdate(query);
            state.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "EORROR");
        }
        return false;   
    }
    
    public void Update(String judul, int alur, int penokohan, int akting, int nilai){
        try {
            String query = "SELECT FROM movie lk WHERE judul='"+judul+"'";

            state = koneksi.createStatement();
            state.executeUpdate(query);
            state.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "EORROR");
        }
        return false;   
    }
    
}
