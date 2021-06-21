/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import mvc.DAO.DAOPendaftar;
import mvc.Model.Pendaftar;
import mvc.Model.TabelModelPendaftar;
import mvc.View.FormAdmin;
import java.util.List;
import javax.swing.JOptionPane;
import mvc.DAOInterface.IDAOPendaftar;
import mvc.View.FormUser;

/**
 *
 * @author Novichen
 */
public class ControllerPendaftar {

    public ControllerPendaftar(FormAdmin frmAdmin)
    {
        this.frmAdmin = frmAdmin;
//        this.frmUser = frmUser;
        
        iPendaftar = new DAOPendaftar();
        
        
    }
    public void isiTable()
    {
        lstPendaftar = iPendaftar.getAll();
        TabelModelPendaftar tabelPendaftar = new TabelModelPendaftar(lstPendaftar);
        frmAdmin.getTabelData().setModel(tabelPendaftar);
    }
    
    public void insert()
    {
        Pendaftar b = new Pendaftar();
        b.setNoKTP(Integer.parseInt(frmAdmin.gettxtKTP().getText()));
        b.setNama(frmAdmin.gettxtNama().getText());
        b.setUsia(frmAdmin.gettxtUsia().getText());
        b.setJk(frmAdmin.getJKel().getSelectedItem().toString());
        b.setAlamat(frmAdmin.gettxtAlamat().getText());
        b.setAlasan(frmAdmin.gettxtAlasan().getText());
        boolean res = iPendaftar.insert(b);
        if(res)
            JOptionPane.showMessageDialog(null, "Success Input");
        else
            JOptionPane.showMessageDialog(null, "Duplicate data found, Insert data FAILED ");
    }
    
    public void reset()
    {
        if(!frmAdmin.gettxtKTP().isEnabled())
            frmAdmin.gettxtKTP().setEnabled(true);
        frmAdmin.gettxtKTP().setText("");
        frmAdmin.gettxtNama().setText("");
        frmAdmin.gettxtUsia().setText("");
        frmAdmin.getJKel().setSelectedItem("L");
        frmAdmin.gettxtAlamat().setText("");
        frmAdmin.gettxtAlasan().setText("");
    }
    
    public void isiField(int row)
    {
        frmAdmin.gettxtKTP().setEnabled(false);
        frmAdmin.gettxtKTP().setText(lstPendaftar.get(row).getNoKTP().toString());
        frmAdmin.gettxtNama().setText(lstPendaftar.get(row).getNama());
        frmAdmin.gettxtUsia().setText(lstPendaftar.get(row).getUsia());
        frmAdmin.getJKel().setSelectedItem(lstPendaftar.get(row).getJk());
        frmAdmin.gettxtAlamat().setText(lstPendaftar.get(row).getAlamat());
        frmAdmin.gettxtAlasan().setText(lstPendaftar.get(row).getAlasan());
    }
    
    public void update ()
    {
        Pendaftar b = new Pendaftar();
        b.setNama(frmAdmin.gettxtNama().getText());
        b.setUsia(frmAdmin.gettxtUsia().getText());
        b.setJk(frmAdmin.getJKel().getSelectedItem().toString());
        b.setAlamat(frmAdmin.gettxtAlamat().getText());
        b.setAlasan(frmAdmin.gettxtAlasan().getText());
        b.setNoKTP(Integer.parseInt(frmAdmin.gettxtKTP().getText()));
        iPendaftar.update(b);
        JOptionPane.showMessageDialog(null, "Update Success");        
    }
    
    public void delete()
    {

        iPendaftar.delete(Integer.parseInt(frmAdmin.gettxtKTP().getText()));
        JOptionPane.showMessageDialog(null, "Delete Success");               
    }
    
    FormAdmin frmAdmin;
    FormUser frmUser;
    IDAOPendaftar iPendaftar;
    List<Pendaftar> lstPendaftar;

}
