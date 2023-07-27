package com.dchambilla.conversor.logica.Temperatura;

public class TemperaturaController {

    public String conversor(int tEntrada, int tSalida, Double cantidad) {

        switch (tEntrada) {
            case 0 -> {
                CelsiusConvertir celConv = new CelsiusConvertir();
                return celConv.convertir(tSalida, cantidad);
            }
            case 1 -> {
                FarenheitConvertir farConv = new FarenheitConvertir();
                return farConv.convertir(tSalida, cantidad);
            }
            case 2 -> {
                KelvinConvertir kelConv = new KelvinConvertir();
                return kelConv.convertir(tSalida, cantidad);
            }
        }
        
        return "No se insertó la temperatura";
    }
    
}
