/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;

/**
 *
 * @author Novichen
 * 
 */
public class Pendaftar {

    /**
     * @return the id
     */
    public Integer getNoKTP() {
        return no_ktp;
    }

    /**
     * @param no_ktp the id to set
     */
    public void setNoKTP(Integer no_ktp) {
        this.no_ktp = no_ktp;
    }

    /**
     * @return the nim
     */
    public String getUsia() {
        return usia;
    }

    /**
     * @param usia the nim to set
     */
    public void setUsia(String usia) {
        this.usia = usia;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the jk
     */
    public String getJk() {
        return jk;
    }

    /**
     * @param jk the jk to set
     */
    public void setJk(String jk) {
        this.jk = jk;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getAlasan(){
        return alasan;
    }
    
    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }
    private Integer no_ktp;
    private String usia;
    private String nama;
    private String jk;
    private String alamat; 
    private String alasan;
    
}
