import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String agencia;
        int numConta;
        String nomeCliente;
        float saldo;

        System.out.print("Informe seu nome completo: ");
        nomeCliente = sc.nextLine();
        System.out.print("Informe o número da agência: ");
        agencia = sc.nextLine();
        System.out.print("Digite o número da conta: ");
        numConta = sc.nextInt();
        System.out.print("Informe o saldo: ");
        saldo = sc.nextFloat();

        sc.close();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numConta, saldo);
    }
}
