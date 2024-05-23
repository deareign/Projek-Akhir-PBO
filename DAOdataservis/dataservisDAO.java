/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOdataservis;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.connector;
import model.*;
import DAOImplement.dataservisimplement;
/**
 *
 * @author Win 10
 */
public class dataservisDAO implements dataservisimplement{
    Connection connection;
    
    final String select = "SELECT * FROM `motor`";

    public dataservisDAO(){
        connection = connector.connection(); 
    }
    
    @Override
    public void insert(dataservis mt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(dataservis mt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<dataservis> getAll() {
        List<dataservis> dmt  = null;
        try{
           dmt = new ArrayList<dataservis>();
           Statement st = connection.createStatement();
           ResultSet rs = st.executeQuery(select);
           while(rs.next()){
                dataservis p= new dataservis();
                p.setNama(rs.getString("nama")); 
                p.setTanggal(rs.getDate("tanggal"));
                p.setTelp(rs.getInt("telp"));
                p.setAlamat(rs.getString("alamat"));
                p.setJenis_kendaraan(rs.getString("jenis_kendaraan"));
                p.setJenis(rs.getString("jenis"));
                p.setNo_plat(rs.getString("no_plat"));
                p.setTotal(rs.getInt("total"));
                p.setStatus(rs.getString("status"));
                dmt.add(p); }
        }catch (SQLException ex) {    
            Logger.getLogger(dataservisDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return dmt;
    }
}
