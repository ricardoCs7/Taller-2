package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class VentaDAO {

    Conexion con;
    

    public VentaDAO() {
        this.con = new Conexion();
    }
    
    

    public void guardarVenta(Venta venta) {
        Connection accesoBD = con.getConexion();
                   
//         Formato Venta = ( Vendedor vendedor, Fecha fecha, int monto, String sucursal)
        
        try {
            String sql ="insert into venta ('sucursal', 'monto', 'fecha', 'id_vendedor') values "
                    + "('"+venta.getSucursal()+"',"+venta.getMonto()+",'"+venta.getFecha()+"',"
                    +venta.getVendedor().getId_vendedor()+");" ;

            //System.out.println(sql);
            Statement st = accesoBD.createStatement();
            st.executeUpdate(sql);
      
            
            accesoBD.close();
           
        } catch (Exception e) {
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            
        }

    }

}
