//Ejercicio de array con el objetivo de escribir una frase y después imprimir palabra por palabra dicha frase
public class array {
    public static void main(String[] args) {
        System.out.println("Escribe una frase y te la pondré debajo:");
        String frase = System.console().readLine();

        // Dividir la cadena en palabras usando el espacio como delimitador
        String[] palabras = frase.split(" ");

        // Mostrar cada palabra en una línea diferente
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
