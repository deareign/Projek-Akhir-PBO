/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.List;
import DAOdataservis.dataservisDAO;
import model.*;
import view.MainView;
import DAOImplement.dataservisimplement;
/**
 *
 * @author Win 10
 */
public class dataserviscontroller {
    MainView frame;
    dataservisimplement implementmotor;
    List<dataservis> dmtr;
	
    public dataserviscontroller(MainView frame){
        this.frame = frame;
        implementmotor = new dataservisDAO();
        dmtr = implementmotor.getAll();
    }
    
    public void isitabel(){
        dmtr = implementmotor.getAll();
        modeltabeldataservis mp = new modeltabeldataservis(dmtr);
        frame.getTabelservis().setModel(mp);
    }
}
