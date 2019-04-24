/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Fecha;
import modelo.Vendedor;
import modelo.VendedorDAO;
import modelo.Venta;
import modelo.VentaDAO;
import vista.VentanaRegistrarVenta;

/**
 *
 * @author Ricardo
 */
public class RegVentaController implements ActionListener{
    

    private VentanaRegistrarVenta vReg;
    ArrayList<Vendedor> listaVendedores;
    
    
    public RegVentaController(VentanaRegistrarVenta vreg) {
        this.vReg = vreg;
         
        rellenarJcComboxVendedor();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       String comando = e.getActionCommand();
       
        if ( comando == "registrar") {
           try {
               generarVenta();
           } catch (ParseException ex) {
               Logger.getLogger(RegVentaController.class.getName()).log(Level.SEVERE, null, ex);
               System.out.println("Error al regustrar Venta");
           }
        }
    }

    
    
    
    
    public void generarVenta() throws ParseException{
        
        VentaDAO vd = new VentaDAO();
       
      Vendedor vendedor = listaVendedores.get(vReg.getJcVendedor().getSelectedIndex());
      String sucursal= vReg.getJcSucursal().getSelectedItem().toString();
      int monto = Integer.parseInt(vReg.getTfMonto().getText());
      Fecha fecha = new Fecha(vReg.getTfDia().getText(),vReg.getTfMes().getText(),vReg.getTfAño().getText());
      
      Venta v = new Venta(monto, sucursal, monto, fecha, vendedor);
      
      vd.guardarVenta(v);
      
     
    }
    

    public void rellenarJcComboxVendedor() {

        VendedorDAO c = new VendedorDAO();
        listaVendedores = c.getVendedores();
        
        for (int i = 0; i < listaVendedores.size(); i++) {
            String nombre = listaVendedores.get(i).getNombre();
            String apellido = listaVendedores.get(i).getApellido();
            vReg.getJcVendedor().addItem(nombre+" "+apellido);
        }
    }

}
