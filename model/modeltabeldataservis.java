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
 * @author Win 10
 */
public class modeltabeldataservis extends AbstractTableModel{
    List<dataservis> dm;
     public modeltabeldataservis(List<dataservis> dm){
        this.dm = dm; 
     }
     
    @Override
    public int getRowCount() {
        return dm.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Tanggal";
            case 1:
                return "Nama";
            case 2:
                return "No. Telp";
            case 3:
                return "Alamat";
            case 4:
                return "No Plat";
            case 5:
                return "Jenis Servis";
            case 6:
                return "Total";
            case 7:
                return "Status";
            default:
                return null; } 
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return dm.get(row).getTanggal();
            case 1:
                return dm.get(row).getNama();
            case 2:
                return dm.get(row).getTelp();
            case 3:
                return dm.get(row).getAlamat();
            case 4:
                return dm.get(row).getNo_plat();
            case 5:
                return dm.get(row).getJenis();
            case 6:
                return dm.get(row).getTotal();
            case 7:
                return dm.get(row).getStatus();
            default:
                return null; }
    }
}