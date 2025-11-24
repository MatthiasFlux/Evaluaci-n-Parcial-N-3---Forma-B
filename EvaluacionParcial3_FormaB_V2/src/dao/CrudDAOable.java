/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.ArrayList;

/**
 *
 * @author ddiaz
 */
public interface CrudDAOable<T> {
    public void create(T t) throws Exception;
    public boolean read(T t) throws Exception;
    public ArrayList<T> read() throws Exception;
    public void update(T t) throws Exception;
    public void delete(T t) throws Exception;
}
