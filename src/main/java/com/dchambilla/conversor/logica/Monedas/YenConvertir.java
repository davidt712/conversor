package com.dchambilla.conversor.logica.Monedas;

public class YenConvertir {

    public String convertir(int mSalida, Double cantidad) {
        switch (mSalida) {
            case 0 -> {
                return Double.toString((cantidad * 0.025));
            }
            case 1 -> {
                return Double.toString((cantidad * 0.0071));
            }
            case 2 -> {
                return Double.toString((cantidad * 0.0063));
            }
            case 3 -> {
                return Double.toString((cantidad * 0.0055));
            }
            case 4 -> {
                return Double.toString(cantidad);
            }
            case 5 -> {
                return Double.toString((cantidad * 9.07));
            }
        }
        return "No se ingresó la moneda";
    }
    
}
