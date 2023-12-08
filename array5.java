//Ejercicio con el objetivo de ver si un texto es palindromo o no
//Autor: Enrique García Herrera
public class array5 {
    public static void main(String[] args) {
        System.out.println("Introduce una frase: ");
        String frase = System.console().readLine().toLowerCase().replaceAll("\\s", ""); // Convertir a minúsculas y
                                                                                        // quitar espacios

        if (esPalindromo(frase)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }

    }

    private static boolean esPalindromo(String str) {
        int longitud = str.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (str.charAt(i) != str.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
