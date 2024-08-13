import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Locale;


/**
* Classe criada com objetivo de exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o cenário proposto,
* no desafio DIO - Trilha Java Básico (https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe).
*
* @author Lucas Avilla
* @version 1.0.0
* @since 13-08-2024
*/
public class ContaTerminal {
    public static void main(String[] args) {

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //nextLine() garante que toda a linha seja lida como uma única string, mesmo que contenha espaços.
        System.out.print("Por gentileza, digite o número da Agência: ");
        String agencia = scanner.nextLine();


        System.out.print("Agora, digite o número da Conta com dígito: ");
        int numeroDaConta = scanner.nextInt();
        scanner.nextLine(); 

        //nextLine() garante que toda a linha seja lida como uma única string, mesmo que contenha espaços.
        System.out.print("Por favor, digite seu nome completo, sem abreviações: ");
        String nomeDoCliente = scanner.nextLine();

        //Foi utilizado BigDecimal para saldo  devido a precisão ser essencial em cálculos financeiros.
        System.out.print("Por gentileza, digite o valor do saldo inicial: ");
        BigDecimal saldo = scanner.nextBigDecimal();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo de R$ " + saldo +
                " já está disponível para saque!");

        //Encerrando o recurso scanner
        scanner.close();
    }
}
