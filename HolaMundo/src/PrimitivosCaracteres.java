public class PrimitivosCaracteres {
    public static void main(String[] args) {

//      ----- CHAR -----

        char caracteres = 'E'; // Basado en estándar unicode
        System.out.println("caracteres = " + caracteres);
        char caracteresArroba = '\u0040'; // Unicode
        System.out.println("caracteresArroba = " + caracteresArroba);
        char caracteresDecimal = 64; // Decimal
        System.out.println("caracteresDecimal = " + caracteresDecimal);
        System.out.println("caracteresDecimal = caracteres: " + (caracteresDecimal == caracteresArroba));
        char arroba = '@';
        System.out.println("arroba = " + arroba);
        System.out.println("arroba = caracteres: " + (arroba == caracteresDecimal));
        var caracteresVar = '&';
        System.out.println("caracteresVar = " + caracteresVar);

        System.out.println("Tipo char en byte a " + Character.BYTES); // Muestra la cantidad de bytes
        System.out.println("Tipo char en byte a " + Character.SIZE); // Muestra la cantidad de bits
        System.out.println("Valor máximo de un char " + Character.MAX_VALUE); // Muestra del máximo al máximo de tamaño
        System.out.println("Valor mínimo de un char " + Character.MIN_VALUE); // Muestra del mínimo al máximo de tamaño

//      ----- CHAR ESPECIALES -----

        char espacio = ' '; // El espacio se considera un character
        System.out.println("espacio = " + espacio);
        char retroceso = '\b';
        System.out.println("retroceso=" + retroceso);
        char tabulador = '\t';
        System.out.println("tabulador = " + tabulador);
        char nuevaLinea = '\n';
        System.out.println("nuevaLinea = " + nuevaLinea);
        char retornoCarro = '\r';
        System.out.println("retornoCarro = " + retornoCarro);

        System.out.println("Hola mundo" + System.lineSeparator() + "cruel");
    }
}
