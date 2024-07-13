import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        int numeroAgencia = scanner.nextInt();

        boolean contaBancaria = numeroAgencia == 1021;
            String agencia = "067-8";
            String nomeCliente = "MARIO ANDRADE";
            double saldo = 237.48;
            
        //CASO DE TESTE
        contaBancaria = numeroAgencia == 2001;
            agencia = "009-1";
            nomeCliente = "EDUARDO FRANCISCO";
            saldo = 1000.58;


        System.out.println("Olá " + nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+", conta "+numeroAgencia+" e seu saldo R$:"+saldo+" já está disponível para saque");
    }
}
