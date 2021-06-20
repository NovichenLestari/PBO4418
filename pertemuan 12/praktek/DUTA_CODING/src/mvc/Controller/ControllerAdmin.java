/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import mvc.DAO.DAOPendaftaran;
import mvc.DAOInterface.IPendaftaran;
import mvc.Model.Pendaftaran;
import mvc.View.FormAdmin;
import java.util.List;
import javax.swing.JOptionPane;
import mvc.Model.TabelModelPendaftaran;

/**
 *
 * @author Novichen
 */
public class ControllerAdmin {

    FormAdmin Aframe;
    IPendaftaran implPendaftaran;
    List<Pendaftaran> lb;
    
    public ControllerAdmin(FormAdmin Aframe){
        this.Aframe = Aframe;
       
        implPendaftaran = new DAOPendaftaran() {
            @Override
            public void update(Pendaftaran b) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        lb = implPendaftaran.getAll();
    }
    
    public void reset(){
        Aframe.getTxt_Ktp().setText("");
        Aframe.getTxtNama().setText("");
        Aframe.getTxtJk().setSelectedItem("");
        Aframe.getTxtAlamat().setText("");
        Aframe.getTxtUsia().setText("");
        Aframe.getTxtAlasan().setText("");
    }
    
    public void isiTable(){
        lb = implPendaftaran.getAll();
        TabelModelPendaftaran tmb = new TabelModelPendaftaran(lb);
        Aframe.getTabelData().setModel(tmb);
    }
    
    public void isiField(int row){
        Aframe.getTxt_Ktp().setEditable(false);
        String s=String.valueOf(lb.get(row).getktp());
        Aframe.getTxt_Ktp().setText(s);
        Aframe.getTxtNama().setText(lb.get(row).getnama());
        Aframe.getTxtJk().setSelectedItem(lb.get(row).getjk());
        Aframe.getTxtAlamat().setText(lb.get(row).getalamat());     
        String i=String.valueOf(lb.get(row).getktp());
        Aframe.getTxtUsia().setText(i);
        Aframe.getTxtAlasan().setText(lb.get(row).getalasan());
    }
    
    public void update(){
            Pendaftaran b = new Pendaftaran();                       
            b.setnama(Aframe.getTxtNama().getText());
            b.setjk(Aframe.getTxtJk().getSelectedItem().toString());
            b.setalamat(Aframe.getTxtAlamat().getText());
            b.setusia(Integer.parseInt(Aframe.getTxtUsia().getText()));
            b.setalasan(Aframe.getTxtAlasan().getText());
            b.setktp(Integer.parseInt(Aframe.getTxt_Ktp().getText()));       
            implPendaftaran.update(b);
            JOptionPane.showMessageDialog(null, "Update data sukses");                    
    }
    
    public void delete(){
        if(!Aframe.getTxt_Ktp().getText().trim().isEmpty()){
            int id = Integer.parseInt(Aframe.getTxt_Ktp().getText());
            implPendaftaran.delete(id);
            JOptionPane.showMessageDialog(null, "Delete data sukses");
        }else{
            JOptionPane.showMessageDialog(Aframe,"Pilih data yang akan di hapus");
        }
    }
    
    public void isiTableCariNama(){
        lb = implPendaftaran.getCariNama(Aframe.getTxtCariNama().getText());
        TabelModelPendaftaran tmb = new TabelModelPendaftaran(lb);
        Aframe.getTabelData().setModel(tmb);
    }
}
