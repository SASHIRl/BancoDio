public class Conta {
    private long numeroConta;
    
    private String nome;
    private double saldo;

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double exibeSaldo() {
        System.out.println("Saldo: R$ " + saldo);
        return saldo;
    }

    public void saca (double valor) {
        if (nome == null) {
            System.out.println("Necessário criar uma conta antes de realizar o saque.");
        } else if (valor < 0) {
            System.out.println("Valor inválido!");
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Feito saque de: R$ " + valor);
            System.out.println("Saldo atualizado: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void deposita (double valor) {
        if (valor < 0) {
            System.out.println("Valor inválido!");
        } else {
            saldo += valor;
            System.out.println("Depositado valor de: R$ " + valor);
            System.out.println("Saldo atualizado: R$ " + saldo);
        }
    }

    public String nomeTitular() {
        if(numeroConta == 0) {
            System.out.println(nome + " ainda não tem uma conta criada");
        } else {
            System.out.println("O titular da conta " + numeroConta + " é " + nome);
            return nome;
        }
        return nome;
    }

    public void transferePara(Conta destino, double valor) {
        if(this.saldo > valor) {
            this.saldo = this.saldo - valor;
            destino.saldo = destino.saldo + valor;
            System.out.println("Feita transferência de " + valor + " da conta de " + nome + " para " + destino.nomeTitular());
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}