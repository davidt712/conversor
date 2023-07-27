package com.dchambilla.conversor.logica.Temperatura;

class FarenheitConvertir {

    public String convertir(int tSalida, Double cantidad) {
        switch (tSalida) {
            case 0 -> {
                return Double.toString((cantidad-32)*5/9);
            }
            case 1 -> {
                return Double.toString(cantidad);
            }
            case 2 -> {
                return Double.toString((cantidad-32)*5/9+273.15);
            }
        }
        return "No se ingresó la temperatura";
    }

}
