package com.dio;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Banco extends JFrame{

    private final List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            this.contas.add(new ContaPoupanca(new Cliente(String.format("%d", i))));

        for (int i = 0; i < 10; i++)
            this.contas.add(new ContaCorrente(new Cliente(String.format("%d", i))));

        criaJanela();
        addButtonsMain();
        this.setVisible(true);
    }

    private void criaJanela() {
        this.setTitle("Banco DIO");
        this.setBounds(50, 100, 700, 500);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    private void addButtonsMain() {
        JMenuBar menuBar = new JMenuBar();
        JButton menuClientes = new JButton("Lista de Clientes");
        JButton menuContas = new JButton("Lista de Contas");
        menuClientes.addActionListener(e -> this.addListaClientes());
        menuContas.addActionListener(e -> this.addListaContas());
        menuBar.add(menuClientes);
        menuBar.add(menuContas);
        menuBar.setLayout(new FlowLayout());
        this.add(menuBar);
    }

    private void addListaClientes () {
        DefaultListModel<String> l = new DefaultListModel<>();
        for (Conta c : contas)
            l.addElement("Cliente: " + c.getCliente() + " : Conta " + c.getTipoConta());

        JList<String> list = new JList<>(l);
        this.add(list);
        this.setVisible(true);
    }

    private void addListaContas() {
        DefaultListModel<String> l = new DefaultListModel<>();
        for (Conta c : contas)
            l.addElement("Conta " + c.getTipoConta() + " : " + c.getNumero());

        JList<String> list = new JList<>(l);
        this.add(list);
        this.setVisible(true);
    }

}
