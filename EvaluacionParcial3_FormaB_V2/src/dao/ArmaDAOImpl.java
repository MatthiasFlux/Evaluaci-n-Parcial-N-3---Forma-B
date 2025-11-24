/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import baseDatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Arma;

public class ArmaDAOImpl implements CrudDAOable<Arma> {

    @Override
    public void create(Arma t) throws Exception {
        // SQL corregido para la tabla 'arma'
        String sql = "INSERT INTO arma (nombre, precision_arma) VALUES (?, ?)";
        
        try (Connection cx = Conexion.open()) {
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setString(1, t.getNombre());
            ps.setDouble(2, t.getPrecision());
            ps.executeUpdate();
        } catch (Exception e) {
            throw new Exception("Error al guardar el arma: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Arma> read() throws Exception {
        ArrayList<Arma> lista = new ArrayList<>();
        String sql = "SELECT * FROM arma";
        
        try (Connection cx = Conexion.open()) {
            PreparedStatement ps = cx.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Arma arma = new Arma();
                arma.setId(rs.getInt("id"));
                arma.setNombre(rs.getString("nombre"));
                arma.setPrecision(rs.getDouble("precision_arma"));
                
                lista.add(arma);
            }
        } catch (Exception e) {
            throw new Exception("Error al listar armas: " + e.getMessage());
        }
        return lista;
    }

    @Override
    public boolean read(Arma t) throws Exception {
        throw new UnsupportedOperationException("");
    }

    @Override
    public void update(Arma t) throws Exception {
        throw new UnsupportedOperationException("");
    }

    @Override
    public void delete(Arma t) throws Exception {
        throw new UnsupportedOperationException("");
    }
}