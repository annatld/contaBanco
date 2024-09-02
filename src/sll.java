import java.util.Scanner;

public class sll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int LIMITE_DIGITOS = 5; // Define o limite de dígitos

        System.out.println("Digite um número com até " + LIMITE_DIGITOS + " dígitos:");

        String entrada = scanner.nextLine();

        // Verifica o comprimento da entrada
        if (entrada.length() > LIMITE_DIGITOS || !entrada.matches("\\d+")) {
            System.out.println("Erro: A entrada deve conter no máximo " + LIMITE_DIGITOS + " dígitos numéricos.");
        } else {
            int numero = Integer.parseInt(entrada); // Converte a entrada para inteiro
            System.out.println("Número digitado: " + numero);
        }
    }
}