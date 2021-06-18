/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import mvc.DAO.DAOMahasiswa;
import mvc.DAOInterface.IMahasiswa;
import mvc.Model.Mahasiswa;
import mvc.Model.TabelModelMahasiswa;
import mvc.View.FormMahasiswa;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */

public class ControllerMahasiswa {
    FormMahasiswa frame;
    IMahasiswa implMahasiswa;
    List<Mahasiswa> lb;
    
    public ControllerMahasiswa(FormMahasiswa frame){
        this.frame = frame;
        implMahasiswa = new DAOMahasiswa();
        lb = implMahasiswa.getAll();
    }
    
    public void reset(){
        if(frame.getTxtID().isEnabled())
            frame.getTxtID().setEditable(true);
        frame.getTxtID().setText("");
        frame.getTxtNim().setText("");
        frame.getTxtNama().setText("");
        frame.getTxtJk().setSelectedItem("");
        frame.getTxtAlamat().setText("");
    }
    
    public void isiTable(){
        lb = implMahasiswa.getAll();
        TabelModelMahasiswa tmb = new TabelModelMahasiswa(lb);
        frame.getTabelData().setModel(tmb);
    }
    
    public void isiField(int row){
        frame.getTxtID().setEditable(false);
        String s=String.valueOf(lb.get(row).getId());
        frame.getTxtID().setText(s);
        frame.getTxtNim().setText(lb.get(row).getNim());
        frame.getTxtNama().setText(lb.get(row).getNama());
        frame.getTxtJk().setSelectedItem(lb.get(row).getJk());
        frame.getTxtAlamat().setText(lb.get(row).getAlamat());
    }
    
    public void insert(){
        if(!frame.getTxtNim().getText().trim().isEmpty()&!frame.getTxtNama().getText().trim().isEmpty()){
            Mahasiswa b = new Mahasiswa();
            b.setId(Integer.parseInt(frame.getTxtID().getText()));
            b.setNim(frame.getTxtNim().getText());
            b.setNama(frame.getTxtNama().getText());
            b.setJk(frame.getTxtJk().getSelectedItem().toString());
            b.setAlamat(frame.getTxtAlamat().getText());
            boolean res = implMahasiswa.insert(b);
            if (res)
                JOptionPane.showMessageDialog(null, "Simpan data sukses");   
            else
                JOptionPane.showMessageDialog(null, "GAGAL INSERT DATA\nKarena ID yang diinputkan sudah dipakai");
            
        } else{
            JOptionPane.showMessageDialog(frame,"Data Tidak Boleh Kosong");
        }
    }
    
    public void update(){
        if(!frame.getTxtID().getText().trim().isEmpty()){
            Mahasiswa b = new Mahasiswa();
            b.setNim(frame.getTxtNim().getText());
            b.setNama(frame.getTxtNama().getText());
            b.setJk(frame.getTxtJk().getSelectedItem().toString());
            b.setAlamat(frame.getTxtAlamat().getText());
            b.setId(Integer.parseInt(frame.getTxtID().getText()));
            implMahasiswa.update(b);
            JOptionPane.showMessageDialog(null, "Update data sukses");            
        } else{
            JOptionPane.showMessageDialog(frame,"Pilih data yang akan di ubah");
        }
    }
    
    public void delete(){
        if(!frame.getTxtID().getText().trim().isEmpty()){
            int id = Integer.parseInt(frame.getTxtID().getText());
            implMahasiswa.delete(id);
            JOptionPane.showMessageDialog(null, "Delete data sukses");
        }else{
            JOptionPane.showMessageDialog(frame,"Pilih data yang akan di hapus");
        }
    }
    
    public void isiTableCariNama(){
        lb = implMahasiswa.getCariNama(frame.getTxtCariNama().getText());
        TabelModelMahasiswa tmb = new TabelModelMahasiswa(lb);
        frame.getTabelData().setModel(tmb);
    }
    
    public void carinama(){
        if (!frame.getTxtCariNama().getText().trim().isEmpty()){
            implMahasiswa.getCariNama(frame.getTxtCariNama().getText());
            isiTableCariNama();
        }else{
            JOptionPane.showMessageDialog(frame,"SILAHKAN PILIH DATA");
        }
    }
}