package com.dchambilla.conversor.logica.Monedas;

public class WonConvertir {

    public String convertir(int mSalida, Double cantidad) {
        switch (mSalida) {
            case 0 -> {
                return Double.toString((cantidad * 0.0028));
            }
            case 1 -> {
                return Double.toString((cantidad * 0.00078));
            }
            case 2 -> {
                return Double.toString((cantidad * 0.00070));
            }
            case 3 -> {
                return Double.toString((cantidad * 0.00060));
            }
            case 4 -> {
                return Double.toString((cantidad * 0.11));
            }
            case 5 -> {
                return Double.toString(cantidad);
            }
        }
        return "No se ingresó la moneda";
    }
    
}
