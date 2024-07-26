import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor digite o número da conta: ");
        int conta = scanner.nextInt();
        
        System.out.println("Digite o numero da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nomeCompleto = scanner.next();
        
        System.out.println("Qual seu saldo atual? ");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", sua conta é " + conta + " e seu saldo de " + saldo + " reais já está disponível para saque!");
        
        
    }
}
