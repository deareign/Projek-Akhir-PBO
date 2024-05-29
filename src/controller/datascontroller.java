/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import DAOdatas.datasDAO;
import DAOImplement.dataservisimplement;
import model.*;
import view.*;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.*;

/**
 *
 * @author HP
 */
public class datascontroller {

    home frame;
    dataservisimplement impldatas;
    List<datas> dp;

    public datascontroller(home frame) {
        this.frame = frame;

        impldatas = new datasDAO();
        dp = impldatas.getAll();
    }

    public void isitabel() {
        dp = impldatas.getAll();
        modeltabeldataservis mp = new modeltabeldataservis(dp);
        frame.getjTable1().setModel(mp);
    }

    public void insert() {
        String nama = frame.getBtnNama().getText();
        String tanggal = frame.getBtnTgl().getText();
        String nohp = frame.getBtnNomor().getText();
        String jenis_kendaraan = frame.getBtnJenisKendaraan().getSelectedItem().toString();
        String plat = frame.getBtnPlatKendaraan().getText();
        String jenisS = frame.getBtnJenisServis().getSelectedItem().toString();

        String total = frame.getBtnTotal().getText();
        String status = "Belum Lunas";

        if (nama.isEmpty() || tanggal.isEmpty() || nohp.isEmpty() || jenis_kendaraan.isEmpty() || plat.isEmpty() || jenisS.isEmpty() || total.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Harap isi semua field", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date tgl = dateFormat.parse(tanggal);
            Double totalbiaya = Double.parseDouble(total);

            datas ds = new datas();
            ds.setNama_pelanggan(nama);
            ds.setTanggal(tgl);
            ds.setNo_telepon(nohp);
            ds.setJenis_kendaraan(jenis_kendaraan);
            ds.setPlat_kendaraan(plat);
            ds.setJenis_servis(jenisS);

            ds.setTotal_biaya(totalbiaya);
            ds.setStatus(status);
            impldatas.insert(ds);
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");

            frame.getBtnID().setText("");
            frame.getBtnNama().setText("");
            frame.getBtnNomor().setText("");
            frame.getBtnPlatKendaraan().setText("");
            frame.getBtnTgl().setText("");
            frame.getBtnJenisKendaraan().setSelectedItem(null);
            frame.getBtnJenisServis().setSelectedItem(null);

            frame.getBtnStatus().setText("");
            frame.getBtnTotal().setText("");

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(frame, "Format tanggal salah. Harap gunakan format dd-MM-yyyy", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public void update() {
        String nama = frame.getBtnNama().getText();
        String tanggal = frame.getBtnTgl().getText();
        String nohp = frame.getBtnNomor().getText();
        String jenis_kendaraan = frame.getBtnJenisKendaraan().getSelectedItem().toString();
        String plat = frame.getBtnPlatKendaraan().getText();
        String jenisS = frame.getBtnJenisServis().getSelectedItem().toString();
        String total = frame.getBtnTotal().getText();
        String id_servis = frame.getBtnID().getText();
        String status = "Belum Lunas";

        if (nama.isEmpty() || tanggal.isEmpty() || nohp.isEmpty() || jenis_kendaraan.isEmpty() || plat.isEmpty() || jenisS.isEmpty()  || total.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Harap isi semua field", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date tgl = dateFormat.parse(tanggal);
            Double totalbiaya = Double.parseDouble(total);

            int id_Servis = Integer.parseInt(id_servis);

            datas ds = new datas();
            ds.setNama_pelanggan(nama);
            ds.setTanggal(tgl);
            ds.setNo_telepon(nohp);
            ds.setJenis_kendaraan(jenis_kendaraan);
            ds.setPlat_kendaraan(plat);
            ds.setJenis_servis(jenisS);
            
            ds.setTotal_biaya(totalbiaya);
            ds.setStatus(status);
            ds.setId_servis(id_Servis);
            impldatas.update(ds);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");

            frame.getBtnID().setText("");
            frame.getBtnNama().setText("");
            frame.getBtnNomor().setText("");
            frame.getBtnPlatKendaraan().setText("");
            frame.getBtnTgl().setText("");
            frame.getBtnJenisKendaraan().setSelectedItem(null);
            frame.getBtnJenisServis().setSelectedItem(null);
         
            frame.getBtnStatus().setText("");
            frame.getBtnTotal().setText("");

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(frame, "Format tanggal salah. Harap gunakan format dd-MM-yyyy", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public void delete() {
        String id_servis = frame.getBtnID().getText();

        if (id_servis.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Harap isi ID Servis", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int id_Servis = Integer.parseInt(id_servis);
            impldatas.delete(id_Servis);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");

            frame.getBtnID().setText("");
            frame.getBtnNama().setText("");
            frame.getBtnNomor().setText("");
            frame.getBtnPlatKendaraan().setText("");
            frame.getBtnTgl().setText("");
            frame.getBtnJenisKendaraan().setSelectedItem(null);
            frame.getBtnJenisServis().setSelectedItem(null);

            frame.getBtnStatus().setText("");
            frame.getBtnTotal().setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Format ID salah. Harap gunakan format angka", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public void reset() {
        frame.getBtnID().setText("");
        frame.getBtnNama().setText("");
        frame.getBtnNomor().setText("");
        frame.getBtnPlatKendaraan().setText("");
        frame.getBtnTgl().setText("");
        frame.getBtnJenisKendaraan().setSelectedItem(null);
        frame.getBtnJenisServis().setSelectedItem(null);
  
        frame.getBtnStatus().setText("");
        frame.getBtnTotal().setText("");
    }
}
