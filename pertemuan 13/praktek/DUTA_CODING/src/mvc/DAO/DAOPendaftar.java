/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAO;

import mvc.Koneksi.Koneksi;
import mvc.Model.Pendaftar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mvc.DAOInterface.IDAOPendaftar;
/**
 *
 * @author Novichen
 */
public class DAOPendaftar implements IDAOPendaftar{

    public DAOPendaftar()
    {
        con = Koneksi.getConnection();
    }
    
    @Override
    public List<Pendaftar> getAll() {
        List<Pendaftar> lstpendaftar = null;
        try
        {
            lstpendaftar = new ArrayList<Pendaftar>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(strRead);
            while(rs.next())
            {
                Pendaftar pdftr = new Pendaftar();
                pdftr.setNoKTP(rs.getInt("no_ktp"));
                pdftr.setNama(rs.getString("nama"));
                pdftr.setUsia(rs.getString("usia"));
                pdftr.setJk(rs.getString("jk"));
                pdftr.setAlamat(rs.getString("alamat"));
                pdftr.setAlasan(rs.getString("alasan"));
                lstpendaftar.add(pdftr);
            }
        }
        catch(SQLException e)
        {
            System.out.println("Error:  "+e);
        }
        return lstpendaftar;
    }
    


    @Override
    public boolean insert(Pendaftar b) {
        
        boolean result = true;
        PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strInsert);
            statement.setInt(1, b.getNoKTP());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getUsia());
            statement.setString(4, b.getJk());
            statement.setString(5, b.getAlamat());
            statement.setString(6, b.getAlasan());
            statement.execute();
            
        }catch(SQLException e)
        {
            System.out.println("Failed Input");
            result = false;
        }
        finally
        {
            try
            {
             statement.close();
            } catch (SQLException ex){
                System.out.println("Failed Input");
                result = false;
            }
        }
        return result;
    }
    

    @Override
    public void update(Pendaftar b) {
        PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strUpdate);
            
            statement.setString(1, b.getNama());
            statement.setString(2, b.getUsia());
            statement.setString(3, b.getJk());
            statement.setString(4, b.getAlamat());
            statement.setString(5, b.getAlasan());
            statement.setInt(6, b.getNoKTP());
            statement.execute();
            
        }catch(SQLException e)
        {
            System.out.println("Update Failed");
        }
        finally
        {
            try
            {
             statement.close();
            } catch (SQLException ex){
                System.out.println("Update Failed");
            }
        }        
    }
    
    @Override
    public void delete(int no_ktp) 
    {
      
PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strDelete);

            statement.setInt(1, no_ktp);
            statement.execute();
            
        }catch(SQLException e)
        {
            System.out.println("Delete Failed");
        }
        finally
        {
            try
            {
             statement.close();
            } catch (SQLException ex){
                System.out.println("Delete Failed");
            }
        }  
    }
    
    @Override
    public List<Pendaftar> getAllByName(String nama) {
        List<Pendaftar> lstpendaftar = null;
        try
        {
            lstpendaftar = new ArrayList<Pendaftar>();
            PreparedStatement st = con.prepareStatement(strSearch );
            st.setString(1, "%"+nama+"%");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                Pendaftar pdftr = new Pendaftar();
                pdftr.setNoKTP(rs.getInt("no_ktp"));
                pdftr.setNama(rs.getString("nama"));
                pdftr.setUsia(rs.getString("usia"));
                pdftr.setJk(rs.getString("jk"));
                pdftr.setAlamat(rs.getString("alamat"));
                pdftr.setAlasan(rs.getString("alasan"));
                lstpendaftar.add(pdftr);
            }
        }
        catch(SQLException e)
        {
            System.out.println("Error:  "+e);
        }
        return lstpendaftar;        
    }
    
    Connection con;
    //SQL Query 
    String strRead = "Select * from tbl_pendaftaran order by no_ktp desc;";
    String strInsert = "insert into tbl_pendaftaran (no_ktp,nama,usia,jk,alamat,alasan) values (?,?,?,?,?,?);";
    String strUpdate = "update tbl_pendaftaran set nama=?, usia=?, jk=?, alamat=?, alasan=? where no_ktp=?";
    String strDelete = "delete from tbl_pendaftaran where no_ktp=?";  
    String strSearch = "select * from tbl_pendaftaran where nama like ?";
}
