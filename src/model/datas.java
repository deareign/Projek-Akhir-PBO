/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Date;
/**
 *
 * @author HP
 */
public class datas {
    private int id_servis;
    private String nama_pelanggan;
    private Date tanggal;
    private String no_telepon;
    private String jenis_kendaraan;
    private String plat_kendaraan;
    private String jenis_servis;
  
    private Double total_biaya;
    private String status;

    public int getId_servis() {
        return id_servis;
    }

    public void setId_servis(int id_servis) {
        this.id_servis = id_servis;
    }

    public String getNama_pelanggan() {
        return nama_pelanggan;
    }

    public void setNama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getNo_telepon() {
        return no_telepon;
    }

    public void setNo_telepon(String no_telepon) {
        this.no_telepon = no_telepon;
    }

    public String getJenis_kendaraan() {
        return jenis_kendaraan;
    }

    public void setJenis_kendaraan(String jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }

    public String getPlat_kendaraan() {
        return plat_kendaraan;
    }

    public void setPlat_kendaraan(String plat_kendaraan) {
        this.plat_kendaraan = plat_kendaraan;
    }

    public String getJenis_servis() {
        return jenis_servis;
    }

    public void setJenis_servis(String jenis_servis) {
        this.jenis_servis = jenis_servis;
    }

    public Double getTotal_biaya() {
        return total_biaya;
    }

    public void setTotal_biaya(Double total_biaya) {
        this.total_biaya = total_biaya;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    
    
}
