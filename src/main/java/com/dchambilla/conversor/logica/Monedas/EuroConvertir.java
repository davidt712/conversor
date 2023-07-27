package com.dchambilla.conversor.logica.Monedas;

public class EuroConvertir {

    public String convertir(int mSalida, Double cantidad) {
        switch (mSalida) {
            case 0 -> {
                return Double.toString((cantidad * 3.99));
            }
            case 1 -> {
                return Double.toString((cantidad * 1.11));
            }
            case 2 -> {
                return Double.toString(cantidad);
            }
            case 3 -> {
                return Double.toString((cantidad * 0.87));
            }
            case 4 -> {
                return Double.toString((cantidad * 157.87));
            }
            case 5 -> {
                return Double.toString((cantidad * 1432.75));
            }
        }
        return "No se ingresó la moneda";
    }
    
}
