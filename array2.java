//Ejercicio de array con el que escribes 2 frases o palabras y compruebas si son o no iguales
//Autor: Enrique García Herrera
public class array2 {
    public static void main(String[] args) {
        System.out.println("Escribe una frase:");
        String frase1 = System.console().readLine();
        System.out.println("Escribe la segunda frase:");
        String frase2 = System.console().readLine();
        if (frase1.equalsIgnoreCase(frase2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("no son iguales");
        }
        if (frase1.equals(frase2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("no son iguales");
        }

    }
}
