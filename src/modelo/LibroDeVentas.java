/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

public class LibroDeVentas {

    public LibroDeVentas() {
    }

    public class LibroVenta {

        ArrayList<Venta> historialVentas;

        public LibroVenta() {
            historialVentas = new ArrayList<>();
        }

        public ArrayList<Venta> getListadoVentas() {
            return historialVentas;
        }

        public void setHistorialVentas(ArrayList<Venta> historialVentas) {
            this.historialVentas = historialVentas;
        }

    }
}
