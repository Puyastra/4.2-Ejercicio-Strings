// Ejercicio de poner tu nombre y apellidos para luego imprimir las 3 primeras sílabas de ellos
// Autor: Enrique García Herrera
public class array3 {
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre:");
        String nombre = System.console().readLine();

        System.out.println("Ahora tu primer apellido:");
        String apellido1 = System.console().readLine();

        System.out.println("Ahora tu segundo apellido:");
        String apellido2 = System.console().readLine();

        String cadena = nombre.substring(0, 3) + apellido1.substring(0, 3) + apellido2.substring(0, 3);
        System.out.println(cadena);
        cadena = cadena.toUpperCase();
    }
}