package org.example;

public class ContaCorrente extends Conta{


    public ContaCorrente(Cliente nome) {
        super(nome);
    }

    public void InfoConta()
    {
        System.out.println("~~~~~~~~ CONTA CORRENTE ~~~~~~~~");
        ExibirConta();
    }
}
