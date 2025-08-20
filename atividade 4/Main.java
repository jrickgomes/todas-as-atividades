public class Main {
    public static void main(String[] args) {
        // Instanciando duas contas
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();

        // Atribuindo dados
        conta1.numeroConta = "001-9";
        conta1.titular = "Ana Lima";
        conta1.saldo = 500.00;

        conta2.numeroConta = "002-7";
        conta2.titular = "Carlos Souza";
        conta2.saldo = 1200.00;

        // Operações na conta1
        conta1.depositar(250.00);
        conta1.sacar(100.00);
        conta1.consultarSaldo();

        // Operações na conta2
        conta2.depositar(300.00);
        conta2.sacar(1500.00); // vai avisar saldo insuficiente
        conta2.sacar(200.00);
        conta2.consultarSaldo();
    }
}
