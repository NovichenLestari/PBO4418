/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;

import mvc.Model.Pendaftar;
import java.util.List;

/**
 *
 * @author Novichen
 */
public interface IDAOPendaftar {
    //read data
    public List<Pendaftar> getAll();
    
    //insert
    public boolean insert(Pendaftar b);
    
    //update data
    public void update(Pendaftar b);
    
    // delete data
    public void delete(int no_ktp);
    
    // search data
    public List<Pendaftar> getAllByName(String nama);
    
}

