package main;


import entidades.Mensajes;
import entidades.empleados.Salario;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {

    public static void main(String[] args) {

        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
        simbolo.setDecimalSeparator('.');
        simbolo.setGroupingSeparator(',');

        DecimalFormat formateador = new DecimalFormat("###,###.##", simbolo);
        Salario sueldo = new Salario();

        String horas = JOptionPane.showInputDialog(null, Mensajes.MENSAJE_PETICION_HORAS.getMensajes());

        String valor = JOptionPane.showInputDialog(null, Mensajes.MENSAJE_PETICION_VALOR_HORAS.getMensajes());

        sueldo.setHorasTrabajadas(Double.parseDouble(horas));
        sueldo.setValorHora(Double.parseDouble(valor));
        JOptionPane.showMessageDialog(null,Mensajes.MENSAJE_RESPUESTA.getMensajes() + formateador.format(sueldo.calcularSalario()));
    }
}
