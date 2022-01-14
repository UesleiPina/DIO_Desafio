package com.dio;

import java.awt.*;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println(">>> Extrato Conta Poupança <<<");
        super.imprimirInfoComuns();
    }

    @Override
    public String getTipoConta() {
        return "Poupança";
    }

}
