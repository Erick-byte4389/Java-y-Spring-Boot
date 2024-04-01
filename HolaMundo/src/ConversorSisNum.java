import javax.swing.*;

public class ConversorSisNum {
    public static void main(String[] args) {

        // Entrada de datos con Swing
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero: ");

        // Método para evitar que el usuario ingrese un string
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un númerp entero");
            main(args);
            System.exit(0);
        }

//      ----- DECIMAL -----

        String resultadoDecimal = "numeroDecimal = " + numeroDecimal;
        System.out.println(resultadoDecimal);

//      ----- BINARIO -----

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

//      ----- OCTAL -----

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

//      ----- HEXADECIMAL -----

        String resultadoHexa = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexa);

        String mensaje = resultadoDecimal;
        mensaje += "\n" + resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
