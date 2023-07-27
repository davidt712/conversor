package com.dchambilla.conversor.logica.Monedas;

public class LibraConvertir {

    public String convertir(int mSalida, Double cantidad) {
        switch (mSalida) {
            case 0 -> {
                return Double.toString((cantidad * 4.61));
            }
            case 1 -> {
                return Double.toString((cantidad * 1.29));
            }
            case 2 -> {
                return Double.toString((cantidad * 1.16));
            }
            case 3 -> {
                return Double.toString(cantidad);
            }
            case 4 -> {
                return Double.toString((cantidad * 182.20));
            }
            case 5 -> {
                return Double.toString((cantidad * 1653.99));
            }
        }
        return "No se ingresó la moneda";
    }
    
}
