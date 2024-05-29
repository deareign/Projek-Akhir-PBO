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

/**
 *
 * @author HP
 */
public class controllerHistory {

    history frame;
    dataservisimplement impldatas;
    List<datas> dp;

    public controllerHistory(history frame) {
        this.frame = frame;

        impldatas = new datasDAO();
        dp = impldatas.getAll();
    }

    public void isiHistory() {
        dp = impldatas.selecthistory();
        modeltabeldataservis mps = new modeltabeldataservis(dp);
        frame.getTabelHistory().setModel(mps);
        int count = impldatas.count();
        frame.getjTxtJumlah().setText(Integer.toString(count));
    }
}
