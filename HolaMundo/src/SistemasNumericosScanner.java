import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        // String numeroStr = scanner.nextLine();

        // Método para evitar que el usuario ingrese un string
        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt(); // Integer.parseInt(numeroStr);
        } catch (Exception e) {
            System.out.println("Error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

//      ----- DECIMAL -----

        String resultadoDecimal = "numeroDecimal = " + numeroDecimal;
        System.out.println(resultadoDecimal);

//      ----- BINARIO -----

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

//      ----- OCTAL -----

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

//      ----- HEXADECIMAL -----

        String resultadoHexa = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoDecimal;
        mensaje += "\n" + resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa;
        System.out.println("mensaje = " + mensaje);
    }
}
