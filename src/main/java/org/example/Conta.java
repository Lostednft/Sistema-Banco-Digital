package org.example;

import lombok.Getter;
import java.util.Random;


@Getter
public abstract class Conta implements FuncaoConta{

    private final Random randomNumero = new Random();

    private Cliente cliente;
    private double saldo;
    private int agencia;
    private long numero;
    private Boolean contaAtiva;


    public Conta(Cliente nome) {
        this.cliente = nome;
        this.saldo = 0;
        this.contaAtiva = false;
        this.agencia = randomNumero.nextInt(9000) + 1000;
        numero = numeroContaRandom();
    }

    public long numeroContaRandom()
    {
        return randomNumero.nextLong(90000000) + 10000000;
    }

    @Override
    public void depositar (double valor) {

        if (statusConta())
        {
            this.saldo += valor;
        }

        else
        {
            if(valor >= 50)
            {
                System.out.println("Conta Ativada com Sucesso!");
                this.saldo += valor;
                statusConta();
            }
            else
            {
                this.saldo += valor;
                System.out.println(String.format("Falta %.2f R$ para ativar a Conta.", (50 - valor)));
            }
        }
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.saldo -= valor;
        contaDestino.saldo += valor;
        System.out.println("Transferência feita com sucesso!");
    }

    public boolean statusConta() {
        if (contaAtiva)
        {
            return true;
        }
        else
        {
            if (saldo >= 50)
            {
                return contaAtiva = true;
            }
            else
            {
                return false;
            }
        }
    }

    protected void ExibirConta()
    {
        System.out.println("Cliente da Conta: " + cliente.getNome());
        System.out.println("CPF do Cliente " + cliente.getCPF());
        System.out.println(String.format("Saldo Atual: %.2f RS",(this.saldo)));
        System.out.println("Conta esta Ativada?? " + statusConta());
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Numero Conta: " + this.numero);
    }
}
