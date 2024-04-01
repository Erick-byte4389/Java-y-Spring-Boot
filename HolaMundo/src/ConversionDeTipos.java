public class ConversionDeTipos {
    public static void main(String[] args) {

//      ----- STRING A PRIMITIVO -----

        String numeroStr= "50";
        // Convertir de String a un Int
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        // Convertir de String a Double
        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "false";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

//      ----- PRIMITIVOS A STRING -----

        int otroNumero = 100;

        System.out.println("otroNumero = " + otroNumero);

        String otroNumeroStr = Integer.toString(otroNumero);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumero + 10); // Sobrecarga de métodos
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

//      ----- DE PRIMITIVOS A PRIMITIVOS

        int i = 22768;
        short s = (short)i; // Cast
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);

        // boolean b = (boolean)i; --> No se puede aplicar cast

        char b = (char)i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
