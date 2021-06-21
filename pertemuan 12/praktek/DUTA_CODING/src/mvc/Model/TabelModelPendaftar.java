/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Novc=ichen
 * 
 */
public class TabelModelPendaftar extends AbstractTableModel{
    
    public TabelModelPendaftar(List<Pendaftar> lstpendaftar){
        this.lstpendaftar = lstpendaftar;
    }
     
    
    @Override
    public int getRowCount() {
        return this.lstpendaftar.size();
        
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int column){
        switch (column){
            case 0:
                return "NO KTP";
            case 1:
                return "NAMA";
            case 2:
                return "USIA";
            case 3:
                return "Jenis Kelamin";
            case 4:
                return "Alamat";
            case 5:
                return "Alasan";
            default:
                return null;
                
        }
    }
            
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return lstpendaftar.get(rowIndex).getNoKTP();
            case 1:
                return lstpendaftar.get(rowIndex).getNama();
            case 2:
                return lstpendaftar.get(rowIndex).getUsia();
            case 3:
                return lstpendaftar.get(rowIndex).getJk();
            case 4:
                return lstpendaftar.get(rowIndex).getAlamat();
            case 5:
                return lstpendaftar.get(rowIndex).getAlasan();
            default:
                return null;
                
        }        
    }
    
    
    List<Pendaftar> lstpendaftar;
    
}
