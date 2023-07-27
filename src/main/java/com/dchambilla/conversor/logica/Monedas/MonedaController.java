package com.dchambilla.conversor.logica.Monedas;


public class MonedaController {

    public String conversor(int mEntrada, int mSalida, Double cantidad) {

        switch (mEntrada) {
            case 0 -> {
                SolesConvertir solConv = new SolesConvertir();
                return solConv.convertir(mSalida, cantidad);
            }
            case 1 -> {
                DolarConvertir dolConv = new DolarConvertir();
                return dolConv.convertir(mSalida, cantidad);
            }
            case 2 -> {
                EuroConvertir eurConv = new EuroConvertir();
                return eurConv.convertir(mSalida, cantidad);
            }
            case 3 -> {
                LibraConvertir libConv = new LibraConvertir();
                return libConv.convertir(mSalida, cantidad);
            }
            case 4 -> {
                YenConvertir yenConv = new YenConvertir();
                return yenConv.convertir(mSalida, cantidad);
            }
            case 5 -> {
                WonConvertir wonConv = new WonConvertir();
                return wonConv.convertir(mSalida, cantidad);
            }
        }
        return "No se ingresó la moneda";
    }

}
