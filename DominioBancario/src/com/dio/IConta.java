package com.dio;

import java.awt.*;

public interface IConta {

    void sacar (double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();
    void imprimirInfoComuns();
    String getTipoConta ();
}
