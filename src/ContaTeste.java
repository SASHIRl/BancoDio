import java.util.Scanner;
public class ContaTeste {

    public static void main (String[]args) {
        int n = 0;
        @SuppressWarnings("resource")
		Scanner scanf = new Scanner(System.in);

        Conta [] c = new Conta[100];
        for(int i = 0; i < c.length; ++i) {
        	
            c[i] = new Conta();
        }

        System.out.println("1 - CRIAR CONTA // 2 - DEPÓSITO // 3 - SAQUE \n4 - SALDO // 5 - NOME TÍTULAR // 6 - LISTA CONTAS // 7 - TRANSFERIR // 8 - SAIR");
        System.out.print("Opção: ");
        while (n != 8) {
            n = scanf.nextInt();
            System.out.println(); //Serve para limpar o buffer do teclado, usado para testes.
            switch (n) {
                case 1:
                    System.out.println("Vamos criar a sua conta!");
                    for (int i = 0; i < c.length; i++) {
                        if (c[i].getNome() == null) {
                            System.out.print("Digite seu nome: ");
                            String InsereNome = scanf.next();
                            c[i].setNome(InsereNome);
                        }
                        
                        if (c[i].getNumeroConta() == 0) {
                            System.out.print("Digite o número de sua conta: ");
                            long conta = scanf.nextLong();
                            c[i].setNumeroConta(conta);
                            break;
                        }
                    }
                    System.out.println("1 - CRIAR CONTA // 2 - DEPÓSITO // 3 - SAQUE \\n4 - SALDO // 5 - NOME TÍTULAR // 6 - LISTA CONTAS // 7 - TRANSFERIR // 8 - SAIR");
                    System.out.print("Opção: ");
                    break;
                case 2:
                    System.out.println("ÁREA DE DEPOSITO");
                    System.out.print("Qual valor deseja depositar? ");
                    double valorDeposito = scanf.nextDouble();
                    System.out.print("Digite o número da conta para depositar: ");
                    long contaNum = scanf.nextLong();
                    for (int i = 0; i < c.length; i++) {
                        if(contaNum == c[i].getNumeroConta()) {
                            c[i].deposita(valorDeposito);
                        }
                    }
                    System.out.println("1 - CRIAR CONTA // 2 - DEPÓSITO // 3 - SAQUE \\n4 - SALDO // 5 - NOME TÍTULAR // 6 - LISTA CONTAS // 7 - TRANSFERIR // 8 - SAIR");
                    System.out.print("Opção: ");
                    break;
                case 3:
                    System.out.println("ÁREA DE SAQUE");
                    System.out.print("Qual valor deseja sacar? ");
                    double valorSaque = scanf.nextDouble();
                    System.out.print("Digite o número da conta para sacar: ");
                    contaNum = scanf.nextLong();
                    for (int i = 0; i < c.length; i++) {
                        if(contaNum == c[i].getNumeroConta()) {
                            c[i].saca(valorSaque);
                            break;
                        }
                    }
                    System.out.println("1 - CRIAR CONTA // 2 - DEPÓSITO // 3 - SAQUE \\n4 - SALDO // 5 - NOME TÍTULAR // 6 - LISTA CONTAS // 7 - TRANSFERIR // 8 - SAIR");
                    System.out.print("Opção: ");
                case 4:
                    System.out.println("ÁREA DO EXTRATO");
                    System.out.print("Digite o número da conta para exibir o extrato: ");
                    contaNum = scanf.nextLong();
                    for (int i = 0; i < c.length; i++) {
                        if(contaNum == c[i].getNumeroConta()) {
                            System.out.println(c[i].getSaldo());
                        }
                    }
                    System.out.println("1 - CRIAR CONTA // 2 - DEPÓSITO // 3 - SAQUE \\n4 - SALDO // 5 - NOME TÍTULAR // 6 - LISTA CONTAS // 7 - TRANSFERIR // 8 - SAIR");
                    System.out.print("Opção: ");
                    break;
                case 5:
                    System.out.print("Digite o número da conta para exibir o nome: ");
                    contaNum = scanf.nextLong();
                    for (int i = 0; i < c.length; i++) {
                        if(contaNum == c[i].getNumeroConta()) {
                            System.out.println(c[i].getNome());
                        }
                    }
                    System.out.println("1 - CRIAR CONTA // 2 - DEPÓSITO // 3 - SAQUE \\n4 - SALDO // 5 - NOME TÍTULAR // 6 - LISTA CONTAS // 7 - TRANSFERIR // 8 - SAIR");
                    System.out.print("Opção: ");
                    break;
                case 6:
                	for (int i = 0; i < c.length; i++) {
                		if(c[i].getNome() != null && c[i].getNumeroConta() != 0) {
                			System.out.println("Nome: " + c[i].getNome() + " Conta: " + c[i].getNumeroConta());
                		}
                	}
                case 7:
                    System.out.print("Digite o número de sua conta: ");
                    long contaAtual = scanf.nextLong();
                    System.out.print("Digite o número da conta para qual irá transferir: ");
                    int contaNova = scanf.nextInt();
                    System.out.print("Digite o valor: ");
                    double valorTransf = scanf.nextDouble();
                    for (int i = 0; i < c.length; i++) {
                        if(c[i].getNumeroConta() == contaAtual) {
                            c[i].transferePara(c[contaNova], valorTransf);
                        }
                    }
                    System.out.println("1 - CRIAR CONTA // 2 - DEPÓSITO // 3 - SAQUE \\n4 - SALDO // 5 - NOME TÍTULAR // 6 - LISTA CONTAS // 7 - TRANSFERIR // 8 - SAIR");
                    System.out.print("Opção: ");
                    break;
                case 8:
                    System.out.println("Obrigado por utilizar nossos sistemas!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    System.out.print("Opção: ");
                    System.out.println("1 - CRIAR CONTA // 2 - DEPÓSITO // 3 - SAQUE \\n4 - SALDO // 5 - NOME TÍTULAR // 6 - LISTA CONTAS // 7 - TRANSFERIR // 8 - SAIR");
                    break;
            }
        }
    }
}