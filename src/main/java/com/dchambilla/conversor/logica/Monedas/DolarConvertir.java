package com.dchambilla.conversor.logica.Monedas;

public class DolarConvertir {

    public String convertir(int mSalida, Double cantidad) {
        switch (mSalida) {
            case 0 -> {
                return Double.toString((cantidad * 3.58));
            }
            case 1 -> {
                return Double.toString(cantidad);
            }
            case 2 -> {
                return Double.toString((cantidad * 0.90));
            }
            case 3 -> {
                return Double.toString((cantidad * 0.78));
            }
            case 4 -> {
                return Double.toString((cantidad * 141.74));
            }
            case 5 -> {
                return Double.toString((cantidad * 1286.65));
            }
        }
        return "No se ingresó la moneda";
    }
    
}
