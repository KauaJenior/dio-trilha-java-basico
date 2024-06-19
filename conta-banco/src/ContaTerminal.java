import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner meuObjeto = new Scanner(System.in);
       meuObjeto.useLocale(Locale.US);

       System.out.println("Por favor, digite seu nome");
        String nome = meuObjeto.next();

        System.out.println("Digite o número da Agência !");
        String numeroAgencia = meuObjeto.next();

        System.out.println("Digite o número da conta");
        int numeroConta = meuObjeto.nextInt();

        System.out.println("Informe seu saldo");
        float saldoDaConta = meuObjeto.nextFloat();

        System.out.println("Olá " + nome +", obrigado por criar uma conta em ");
        System.out.println("nosso banco, sua agência é " + numeroAgencia + ", " + "conta " + numeroConta + " e seu saldo de " + saldoDaConta + " ja esta disponível para saque."  );
        
    }
}
