
//Ejercicio en array para sacar las vocales de las palabras escritas
//Autor: Enrique García Herrera
public class array4 {
    public static void main(String[] args) {

        System.out.println("Escribe una frase y te diré todas sus vocales: ");
        String frase = System.console().readLine().toLowerCase(); // Convertir a minúsculas para no diferenciar entre
                                                                  // mayúsculas y minúsculas

        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            switch (caracter) {
                case 'a':
                case 'á':
                    contadorA++;
                    break;
                case 'e':
                case 'é':
                    contadorE++;
                    break;
                case 'i':
                case 'í':
                    contadorI++;
                    break;
                case 'o':
                case 'ó':
                    contadorO++;
                    break;
                case 'u':
                case 'ú':
                    contadorU++;
                    break;
            }
        }

        System.out.println("Nº de A's: " + contadorA);
        System.out.println("Nº de E's: " + contadorE);
        System.out.println("Nº de I's: " + contadorI);
        System.out.println("Nº de O's: " + contadorO);
        System.out.println("Nº de U's: " + contadorU);

    }
}
