public class ContaBancaria {
    String numeroConta;
    String titular;
    double saldo;

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado na conta " + numeroConta);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque na conta " + numeroConta);
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na conta " + numeroConta);
        }
    }

    void consultarSaldo() {
        System.out.printf("Conta: %s | Titular: %s | Saldo: R$%.2f%n", numeroConta, titular, saldo);
    }
}

