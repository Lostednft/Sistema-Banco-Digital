package org.example;

public interface FuncaoConta{

    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, Conta nome);
    void InfoConta();
}
