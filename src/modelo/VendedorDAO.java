/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class VendedorDAO {

    Conexion con;

    public VendedorDAO() {
        this.con = new Conexion();
    }

    public ArrayList<Vendedor> getVendedores( ) {
        Connection accesoBD = con.getConexion();
        Vendedor v = null;
        ArrayList<Vendedor> vendedores = new ArrayList<>();

        try {
            String sql = "SELECT * FROM vendedor";

            //System.out.println(sql);
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);

            while (resultados.next()) {
                int id=resultados.getInt("id_vendedor");
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String rut = resultados.getString("rut");
                v = new Vendedor(id,nombre, apellido, rut);
                vendedores.add(v);
            }
            accesoBD.close();
            return vendedores;
        } catch (Exception e) {
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }

    }

}
