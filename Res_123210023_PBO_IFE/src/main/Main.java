/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;


import Model.ModelMovie;
import View.ViewMovie;
import Konektor.konektor;
//import java.sql.*;

/**
 *
 * @author PC PRAKTIKUM
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ViewMovie view = new ViewMovie();
        ModelMovie model = new ModelMovie();
        konektor koneksi = new  konektor(model,view);
    }
    
}
