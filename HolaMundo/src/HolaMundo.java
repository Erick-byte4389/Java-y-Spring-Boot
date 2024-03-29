public class HolaMundo {
    public static void main(String[] args) {
        /*
        void -> Significa que no retorna nada
        main() -> Es un método
         */
        String saludo = "Hola mundo"; // Variable tipo cadena
        System.out.println(saludo); // Estamos accediendo a una clase y al atributo print

        // Accediendo a un método para que se escriba en mayúsculas
        System.out.println("saludo = " + saludo.toUpperCase());

        // ---------- VARIABLES ---------------

        int valor = 100; // variable de tipo entero (no tiene métodos)

        Integer valor2 = 10; // Tiene métodos
        // valor2.byteValue(); -> Éste es el método

        System.out.println("valor = " + valor);

        boolean verdad = false; // variable de tipo booleano
        int valorX = 10;

        if (verdad) {
            System.out.println("valor = " + valor);
            valorX = 1010;
        }
        System.out.println("valor2 = " + valorX);

        var numero3 = "1000";
        System.out.println(numero3);

        String nombre;
        nombre = "Juan"; // Podemos cambiar el valor de la variable

        if (valor < 100) {
            nombre = "Erick";
        }
        System.out.println("nombre = " + nombre);

    }
}
