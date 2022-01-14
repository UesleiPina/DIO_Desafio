package com.dio;

import java.awt.*;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println(">>> Extrato Conta Corrente <<<");
        super.imprimirInfoComuns();
    }

    @Override
    public String getTipoConta() {
        return "Corrente";
    }
}
