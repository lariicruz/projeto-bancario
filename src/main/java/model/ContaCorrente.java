package model;

public class ContaCorrente extends Conta {

    private static int SEQUENCIAL =1;
    public ContaCorrente() {
        super();
        super.agencia = AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("** Extrato Conta Corrente ***");
        imprimirInfoComuns();
    }


}
