public class PrimitivosFloat {

    static float miFlotante; // Si asignamos la variable fuera del void, podemos cambiar su valor

    public static void main(String[] args) {

//        ----- FLOAT -----

        float realFloat = 1.0F; // automáticamente, este entero lo convierte a decimal
        System.out.println("realFloat = " + realFloat);
        realFloat = 2120;
        System.out.println("realFloat = " + realFloat);

        float realFloat2 = 2.12e3F;
        System.out.println("realFloat2 = " + realFloat2);

        float realFloat3 = 1.5e4F; // 15000.0
        System.out.println("realFloat3 = " + realFloat3);

        float realFloat4 = 0.00000000015F; // 1.5e-10f
        System.out.println("realFloat4 = " + realFloat4);

        float numFloat = 0.00000000015F; // 1.5e-10F
        System.out.println("numFloat = " + numFloat);
        System.out.println("Tipo float en byte a " + Float.BYTES); // Muestra la cantidad de bytes
        System.out.println("Tipo float en byte a " + Float.SIZE); // Muestra la cantidad de bits
        System.out.println("Valor máximo de un float " + Float.MAX_VALUE); // Muestra del máximo al máximo de tamaño
        System.out.println("Valor mínimo de un float " + Float.MIN_VALUE); // Muestra del mínimo al máximo de tamaño

//        ----- DOUBLE -----

        double numDouble = 1.7976931348623157E308;
        System.out.println("numDouble = " + numDouble);
        System.out.println("Tipo double en byte a " + Double.BYTES); // Muestra la cantidad de bytes
        System.out.println("Tipo double en byte a " + Double.SIZE); // Muestra la cantidad de bits
        System.out.println("Valor máximo de un double " + Double.MAX_VALUE); // Muestra del máximo al máximo de tamaño
        System.out.println("Valor mínimo de un double " + Double.MIN_VALUE); // Muestra del mínimo al máximo de tamaño

//        float miFlotante; // Si está dentro del void debe ser inicializado
        miFlotante = 10F;
        System.out.println("miFlotante = " + miFlotante);
    }
}
