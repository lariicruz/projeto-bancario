package model;


public class ContaPoupanca extends Conta {


    private static int SEQUENCIAL = 1;

    public ContaPoupanca() {
        super();
        super.agencia = AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }


    @Override
    public void imprimirExtrato() {
        System.out.println("** Extrato Conta Poupança ***");
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Numero: %d", super.numero));
        System.out.println(String.format("Saldo: %.2f", super.saldo));
    }
}

