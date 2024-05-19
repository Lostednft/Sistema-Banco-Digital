package org.example;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(Cliente nome) {
        super(nome);
    }

    @Override
    public void InfoConta()
    {
        System.out.println("~~~~~~~~ CONTA POUPANÇA ~~~~~~~~");
        ExibirConta();
    }
}
