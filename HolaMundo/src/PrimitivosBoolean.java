public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean booleanFalso = false;
        System.out.println("booleanFalso = " + booleanFalso);

        boolean booleanVerdadero = true;
        System.out.println("booleanVerdadero = " + booleanVerdadero);

        // Una forma de crear un boolean --> boolean datoLogic = Boolean.FALSE.booleanValue();

        boolean datoLogic;

        double d = 98765.43e-3; // 98.76543
        System.out.println("d = " + d);
        float f = 1.2345e2F; // 123.45
        System.out.println("f = " + f);

        datoLogic = d > f;
        System.out.println("f = " + datoLogic);

        boolean esIgual = (3 - 2) == 1;
        System.out.println("esIgual = " + esIgual);

    }
}
