public class SistemasNumericos {
    public static void main(String[] args) {

//      ----- DECIMAL -----

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

//      ----- BINARIO -----

        int numeroBinario = 0B111110100;
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println("numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal));

//      ----- OCTAL -----

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

//      ----- HEXADECIMAL -----

        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1f4;
        System.out.println("numeroHex " + numeroHex);
    }
}
