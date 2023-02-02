package org.example.utilitario;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Ultis {
    static NumberFormat formatandosValores = new DecimalFormat("R$ #, ##0.00");
    public static String doubleToString(Double valor){
        return formatandosValores.format(valor);
    }
}
