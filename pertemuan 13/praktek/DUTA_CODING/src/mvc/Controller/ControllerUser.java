/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import mvc.DAO.DAOPendaftar;
import mvc.Model.Pendaftar;
import mvc.Model.TabelModelPendaftar;
import java.util.List;
import javax.swing.JOptionPane;
import mvc.DAOInterface.IDAOPendaftar;
import mvc.View.FormUser;


/**
 *
 * @author Novichen
 */
public class ControllerUser {
        public ControllerUser(FormUser frmUser)
    {
        this.frmUser = frmUser;
        iUser = new DAOPendaftar();
    }
        
    public void insert()
    {
        Pendaftar b = new Pendaftar();
        b.setNoKTP(Integer.parseInt(frmUser.gettxtKTP().getText()));
        b.setNama(frmUser.gettxtNama().getText());
        b.setUsia(frmUser.gettxtUsia().getText());
        b.setJk(frmUser.getJKel().getSelectedItem().toString());
        b.setAlamat(frmUser.gettxtAlamat().getText());
        b.setAlasan(frmUser.gettxtAlasan().getText());
        boolean res = iUser.insert(b);
        if(res)
            JOptionPane.showMessageDialog(null, "Success Input");
        else
            JOptionPane.showMessageDialog(null, "Duplicate data found, Insert data FAILED ");
    }
    public void reset()
    {
        if(!frmUser.gettxtKTP().isEnabled())
            frmUser.gettxtKTP().setEnabled(true);
        frmUser.gettxtKTP().setText("");
        frmUser.gettxtNama().setText("");
        frmUser.gettxtUsia().setText("");
        frmUser.getJKel().setSelectedItem("L");
        frmUser.gettxtAlamat().setText("");
        frmUser.gettxtAlasan().setText("");
    }
    public void isiTable()
    {
        lstPendaftar = iUser.getAll();
        TabelModelPendaftar tabelPendaftar = new TabelModelPendaftar(lstPendaftar);
//        frmUser.getTabelData().setModel(tabelPendaftar);
    }
        
    FormUser frmUser;
    IDAOPendaftar iUser;
    List<Pendaftar> lstPendaftar;
}
