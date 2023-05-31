/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kontrol;

import Model.ModelMovie;
import View.ViewMovie;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.eventimport java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC PRAKTIKUM
 */
public class KontrolMovie {
    ViewMovie view;
    ModelMovie model;
    
    public KontrolMovie(ViewMovie view, ModelMovie model){
        this.view=view;
        this.model=model;
        
        view.getbTambah().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int alur = Integer.parseInt(view.getTfAlur());
                    int penokohan = Integer.parseInt(view.getTfPenokohan());
                    int akting = Integer.parseInt(view.getTfAkting());
                    model.Tambah(view.getTfJudul(), alur, penokohan, akting, alur);
                    view.getjTable1().setModel(new DefaultTableModel(data, new String[]{"judul", "alur", "penokohan", "akting", "nilai"}));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "GAGAL");
                }
            }
        });
        
//        view.getbDelete().addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    int alur = Integer.parseInt(view.getTfAlur());
//                    int penokohan = Integer.parseInt(view.getTfPenokohan());
//                    int akting = Integer.parseInt(view.getTfAkting());
//                    
//                    JOptionPane.showMessageDialog(null, "GAGAL");
//                }
//            }
//        });
        
        
    }
}
