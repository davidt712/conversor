package com.dchambilla.conversor.logica.Monedas;

public class SolesConvertir {

    public String convertir(int mSalida, Double cantidad) {
        switch (mSalida) {
            case 0 -> {
                return Double.toString(cantidad);
            }
            case 1 -> {
                return Double.toString((cantidad*0.28));
            }
            case 2 -> {
                return Double.toString((cantidad *0.25));
            }
            case 3 -> {
                return Double.toString((cantidad * 0.22));
            }
            case 4 -> {
                return Double.toString((cantidad *39.56));
            }
            case 5 -> {
                return Double.toString((cantidad *359.14));
            }
        }
        return "No se ingresó la moneda";
    }
}
