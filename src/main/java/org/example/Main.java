package org.example;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Luis", 3414145);
        Cliente c2 = new Cliente("Maria",3414145);
        Cliente c3 = new Cliente("Pedro",5183843);

        FuncaoConta conta = new ContaPoupanca(c2);
        FuncaoConta conta2 = new ContaCorrente(c1);
        FuncaoConta conta3 = new ContaCorrente(c3);


        conta2.depositar(50);
        conta2.sacar(20);
        conta2.InfoConta();

        conta.depositar(50);
        conta.sacar(10);
        conta.InfoConta();


        conta3.depositar(50);
        conta3.sacar(30);
        conta3.InfoConta();


    }
}