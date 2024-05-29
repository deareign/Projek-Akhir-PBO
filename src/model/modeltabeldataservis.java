/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HP
 */
public class modeltabeldataservis extends AbstractTableModel {

    List<datas> dp;

    public modeltabeldataservis(List<datas> dp) {
        this.dp = dp;

    }

    @Override
    public int getRowCount() {
        return dp.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID Servis";
            case 1:
                return "Nama Pelanggan";
            case 2:
                return "Tanggal";
            case 3:
                return "No Telepon";
            case 4:
                return "Jenis Kendaraan";
            case 5:
                return "Plat Kendaraan";
            case 6:
                return "Jenis Service";
     
            case 7:
                return "Total Biaya";
            case 8:
                return "Status";
        
            default:
                return null;

        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return dp.get(row).getId_servis();
            case 1:
                return dp.get(row).getNama_pelanggan();
            case 2:
                return dp.get(row).getTanggal();
            case 3:
                return dp.get(row).getNo_telepon();
            case 4:
                return dp.get(row).getJenis_kendaraan();
            case 5:
                return dp.get(row).getPlat_kendaraan();
            case 6:
                return dp.get(row).getJenis_servis();
           
            case 7:
                return dp.get(row).getTotal_biaya();
            case 8:
                return dp.get(row).getStatus();
           
            default:
                return null;
        }
    }
}
