import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class ContaTerminal {
    String conta, agencia;
    String nomecliente;
    float saldo;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-Vindo ao Banco RFGS");
        System.out.println("Vamos cadastrar o seu cartão");
        
        System.out.println("Digite seu nome completo: ");
        String nomecliente = scanner.nextLine();

        System.out.println("Digite o numero da agencia");
        String agencia = scanner.next();

        System.out.println("Digite o numero da conta");
        String conta = scanner.next();

        

        System.out.println("Cadastro do Cartao RGGS com SUCESSO");

        System.out.println("Digite o valor que deseja ter na conta: ");
        float saldo = scanner.nextFloat();

        //Adiciona formatação de saldo em moeda brasileira
    

         NumberFormat formatoBR = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String saldoFormatado = formatoBR.format(saldo);

        System.out.println("Parabens pelo seu Cadatro " +nomecliente+ ", sua agencia e conta e: "+ agencia + "-" +conta +  " e seu saldo e de: "+saldoFormatado);
        System.out.println("Bom aproveito");
        System.out.println("Até Breve!!!");

       
    }
}
