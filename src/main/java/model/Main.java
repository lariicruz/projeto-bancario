package model;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta pp = new ContaPoupanca();
        cc.depositar(100);
        cc.transferir(100,pp);
        pp.sacar(50);
        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }

}
