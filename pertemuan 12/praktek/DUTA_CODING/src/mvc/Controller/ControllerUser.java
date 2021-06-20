/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import mvc.DAO.DAOPendaftaran;
import mvc.DAOInterface.IPendaftaran;
import mvc.Model.Pendaftaran;
import mvc.View.FormUser;
import java.util.List;
import javax.swing.JOptionPane;
import mvc.Model.TabelModelPendaftaran;

/**
 *
 * @author Novichen
 */
public class ControllerUser {

    FormUser Iframe;
    IPendaftaran implPendaftaran;
    DAOPendaftaran Iuser;
    List<Pendaftaran> lb;
    
    public ControllerUser(FormUser Iframe){
        this.Iframe = Iframe;
       
        implPendaftaran = new DAOPendaftaran() {
            @Override
            public void update(Pendaftaran b) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        lb = implPendaftaran.getAll();
    }

    
    public void insert(){     
        Pendaftaran b = new Pendaftaran();
        b.setktp(Integer.parseInt(Iframe.getTxtKtp().getText()));
        b.setnama(Iframe.getTxtNama().getText());
        b.setjk(Iframe.getTxtJk().getSelectedItem().toString());
        b.setalamat(Iframe.getTxtAlamat().getText());
        b.setusia(Integer.parseInt(Iframe.getTxtUsia().getText()));
        b.setalasan(Iframe.getTxtAlasan().getText());
        boolean res = implPendaftaran.insert(b);
        if (res)
            JOptionPane.showMessageDialog(null, "Simpan data sukses");   
        else{
            JOptionPane.showMessageDialog(null, "GAGAL INSERT DATA\nKarena No KTP/NIK yang diinputkan sudah dipakai"); 
        }
    }
    public void reset(){
        Iframe.getTxtKtp().setText("");
        Iframe.getTxtNama().setText("");
        Iframe.getTxtJk().setSelectedItem("");
        Iframe.getTxtAlamat().setText("");
        Iframe.getTxtUsia().setText("");
        Iframe.getTxtAlasan().setText("");;
    }
        
    
    public void isiTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
