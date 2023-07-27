package com.dchambilla.conversor.logica.Temperatura;

class CelsiusConvertir {

    public String convertir(int tSalida, Double cantidad) {
        switch (tSalida) {
            case 0 -> {
                return Double.toString(cantidad);
            }
            case 1 -> {
                return Double.toString((cantidad * 9 / 5) + 32);
            }
            case 2 -> {
                return Double.toString(cantidad + 273.15);
            }
        }
        return "No se ingresó la temperatura";
    }

}
