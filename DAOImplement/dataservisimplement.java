/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplement;
import java.util.List;
import model.*;
/**
 *
 * @author Win 10
 */
public interface dataservisimplement {
    public void insert(dataservis mt);
    public void update(dataservis mt);
    public void delete(int id);
    public List<dataservis> getAll();
}
