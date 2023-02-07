import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta !");
        int numeroConta = sc.nextInt();
        System.out.println();

        System.out.println("Por favor, digite o número da Agência !");
        sc.nextLine();
        String agencia = sc.nextLine();
        System.out.println();

        System.out.println("Por favor, digite o nome do cliente !");
        String nomeCliente = sc.nextLine();
        System.out.println();

        System.out.println("Por favor, digite o saldo da conta !");
        double saldo = sc.nextDouble();
        System.out.println();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque. %n",
                nomeCliente, agencia, numeroConta, saldo);

        sc.close();
    }
}
