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
        imprimirInfoComuns();
    }
}

