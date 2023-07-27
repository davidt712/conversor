package com.dchambilla.conversor.logica.Temperatura;

class KelvinConvertir {

    String convertir(int tSalida, Double cantidad) {
        switch (tSalida) {
            case 0 -> {
                return Double.toString(cantidad + 273.15);
            }
            case 1 -> {
                return Double.toString((cantidad -273.15)*9/5 + 32);
            }
            case 2 -> {
                
                return Double.toString(cantidad);
            }
        }
        return "No se ingresó la temperatura";
    }

}
