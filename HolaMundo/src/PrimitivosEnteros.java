public class PrimitivosEnteros {
    public static void main(String[] args) {

//        ----- BYTE -----

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte en byte a " + Byte.BYTES); // Muestra la cantidad de bytes
        System.out.println("Tipo byte en byte a " + Byte.SIZE); // Muestra la cantidad de bits
        System.out.println("Valor máximo de un byte " + Byte.MAX_VALUE); // Muestra del máximo al máximo de tamaño
        System.out.println("Valor mínimo de un byte " + Byte.MIN_VALUE); // Muestra del mínimo al máximo de tamaño

//        ----- SHORT -----

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short en byte a " + Short.BYTES); // Muestra la cantidad de bytes
        System.out.println("Tipo short en byte a " + Short.SIZE); // Muestra la cantidad de bits
        System.out.println("Valor máximo de un short " + Short.MAX_VALUE); // Muestra del máximo al máximo de tamaño
        System.out.println("Valor mínimo de un short " + Short.MIN_VALUE); // Muestra del mínimo al máximo de tamaño

//        ----- INT -----

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int en byte a " + Integer.BYTES); // Muestra la cantidad de bytes
        System.out.println("Tipo int en byte a " + Integer.SIZE); // Muestra la cantidad de bits
        System.out.println("Valor máximo de un int " + Integer.MAX_VALUE); // Muestra del máximo al máximo de tamaño
        System.out.println("Valor mínimo de un int " + Integer.MIN_VALUE); // Muestra del mínimo al máximo de tamaño

//        ----- LONG -----

        long numeroLong = 9223372036854775807L; // Añadimos la letra "L" para especificar que es un tipo long
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long en byte a " + Long.BYTES); // Muestra la cantidad de bytes
        System.out.println("Tipo long en byte a " + Long.SIZE); // Muestra la cantidad de bits
        System.out.println("Valor máximo de un long " + Long.MAX_VALUE); // Muestra del máximo al máximo de tamaño
        System.out.println("Valor mínimo de un long " + Long.MIN_VALUE); // Muestra del mínimo al máximo de tamaño

//        ----- VAR -----

        var numeroVar = 121123456783489673986798457694576984576F; // Añadimos "F" ó "D" del "float" ó "double"
        System.out.println("numeroVar = " + numeroVar);
    }
}
