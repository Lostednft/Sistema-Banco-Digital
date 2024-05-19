package org.example;

import lombok.Getter;
import java.util.HashSet;
import java.util.Set;

@Getter
public class Cliente {


    private String nome;
    private long CPF;
    private static Set<Long> cpfUsados = new HashSet<>();


    public Cliente(String nome, long CPF) {
        this.nome = nome;
        cpfValidacao(CPF, nome);
    }

    private void cpfValidacao(long CPF, String name)
    {
        if (cpfUsados.contains(CPF))
        {
            System.out.println(String.format("Cadastro de %s e com CPF %d falhou! o CPF ja é existente!", name,CPF));
        }
        else
        {
            this.CPF = CPF;
            cpfUsados.add(CPF);
        }
    }
}


