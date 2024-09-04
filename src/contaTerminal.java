import java.util.Scanner;

public class contaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int LIMITE_DIGITOS = 4;
        String nomeCliente;
        String agencia;
        double saldo;
        int conta;


        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.nextLine();


        System.out.println("Digite o número da agência (apenas números): ");
        agencia = scanner.nextLine();

        //Formatando para que tenha "-" antes do ultimo numero
        if (agencia.length() >8) {
            agencia = agencia.substring(0,9 ) + "-" + agencia.substring(8);
        } else {
            agencia += "-";
        }

        // Loop para garantir que o número da conta não tenha mais de 4 dígitos
        do {
            System.out.println("Digite o número da conta (máximo de 4 dígitos): ");
            conta = scanner.nextInt();
            if (String.valueOf(conta).length() > LIMITE_DIGITOS) {
                System.out.println("Erro: O número da conta não pode ter mais que 4 dígitos.");
            }
        } while (String.valueOf(conta).length() > LIMITE_DIGITOS);


        System.out.println("Digite o valor depositado: ");
        saldo = scanner.nextDouble();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %04d e seu saldo %.2f já está disponível para saque.%n",
                nomeCliente, agencia, conta, saldo);

        scanner.close();
    }
}
