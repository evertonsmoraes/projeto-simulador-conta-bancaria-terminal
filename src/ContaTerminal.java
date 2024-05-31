import java.util.Locale;
import java.util.Scanner;
/**
	* <h1>Conta Terminal</h1>
	*Simulação de Conta Terminal onde recebe variáveis atráves do terminal utilizando a classe scanner e posteriormente exibindo os dados capturados
	* 
	* <b>Note:</b> Projeto Módulo "Dominango a Linguagem de Programaação Java" do BootCamp Santander 2024 - Backend com Java"
	*
	* @author  Ëverton Moraes
	* @version 1.0
	* @since   31/05/2024
	*/
public class ContaTerminal {

    /**
	   * Este método é para capturar dados refentes a uma conta bancária e posteriormente exibir uma mensagem confirmando a 'criação' da conta com os dados capturados
	   * @param numeroConta Número da Conta que foi criada (int)
	   * @param numeroAgencia Número da Agência quem que a Conta foi criada (String)
       * @param nomeCliente Nome do Titular da Conta criada (String)
       * @param saldoInicial Saldo Inicial da Conta criada (double)
	   * @return int o resultado deste método é a soma dos dois números.
	   */

    public static void main(String[] args) {
    //criando o objeto scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    //recebendo as variaveis
    System.out.println("Por favor, digite o número da Conta:");
    int numeroConta = scanner.nextInt();

    System.out.println("Por favor, digite o número da Agência:");
    String numeroAgencia = scanner.next();
    
    //tratativa para pegar o nome com espaço
    scanner.nextLine();

    System.out.println("Por favor, digite o Nome do Cliente:");
    String nomeCliente = scanner.nextLine();

    System.out.println("Por favor, digite o Saldo Inicial:");
    double saldoInicial = scanner.nextDouble(); 

    //imprimindo a consulta final
    System.out.println("Olá "+nomeCliente+", \nobrigado por criar uma conta em nosso banco, sua agência é '"+numeroAgencia+"', conta '"+numeroConta+"' e seu saldo 'R$ "+saldoInicial+"'' já está disponível para saque");
    }
}
