
import java.util.Scanner;

public class TestaConta {
    
    public static void main(String[] args) {
        ContaImposto c1 = new ContaImposto(1000.00, 1);
        Scanner sc = new Scanner(System.in);

        
        while (true) {
            System.out.println("--- Mini-Banco ---");
            System.out.println("1 - Ver Saldo\n2 - Sacar\n3 - Depositar\n0 - SAIR");
            System.out.println("Opção: ");
            int myOpt = sc.nextInt(); // Ler entrada
            if (myOpt == 0) {
                System.out.println("--- OBRIGADO E VOLTE SEMRPE ---");
                break;
            } else {
                switch (myOpt) {
                    case 1:
                        System.out.println("Saldo atual>" + c1.getSaldo());
                        break;
                    case 2:
                        System.out.println("Valor do saque: ");
                        double valorSaque = sc.nextInt(); // Ler valor do saque
                        c1.debitar(valorSaque);
                        System.out.println("Saque efetuado com sucesso!\n");
                        break;
                    case 3:
                        System.out.println("Valor para deposito: ");
                        double valorDeposito = sc.nextInt(); // Ler valor para deposito
                        c1.setSaldo(valorDeposito);
                        System.out.println("Deposito efetuado com sucesso.\n");
                    default:
                        System.out.println("Opcao invalida");
                        break;
                }
            }
        }
    }
}
