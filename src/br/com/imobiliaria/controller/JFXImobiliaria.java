package br.com.imobiliaria.controller;

import br.com.imobiliaria.model.Calculos;
import br.com.imobiliaria.model.Imovel;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;

public class JFXImobiliaria {

    public TextField tfProprietario;
    public TextField tfCidade;
    public TextField tfArea;
    public Button bQuadrado;
    public Button bRetangulo;
    public Button bTriangulo;
    public Button bCirculo;
    public Button bLosango;
    public Button bSalvar;
    public Button bFechar;

    Calculos imovel = new Calculos();
    Imovel dados = new Imovel();

    public void calcularQuadrado(ActionEvent actionEvent) {
       double lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o lado do quadrado: "));

        //Comando para mudar ow estpa na caixa de texto e converter o que queremos adicionar lá em string
        tfArea.setText(String.valueOf(imovel.calcularAreaQuadrado(lado)));
    }

    public void calcularRetangulo(ActionEvent actionEvent) {
        double ladoA = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o lado A do retangulo: "));
        double ladoB = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o lado B do retangulo: "));

        //Comando para mudar ow estpa na caixa de texto e converter o que queremos adicionar lá em string
        tfArea.setText(String.valueOf(imovel.calcularAreaRetangulo(ladoA, ladoB)));
    }

    public void calcularTriangulo(ActionEvent actionEvent) {

        double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o base do Triângulo: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a altura do Triângulo: "));

        //Comando para mudar ow estpa na caixa de texto e converter o que queremos adicionar lá em string
        tfArea.setText(String.valueOf(imovel.calcularAreaTriangulo(base, altura)));
    }

    public void calcularCirculo(ActionEvent actionEvent) {

        double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o raio do círculo: "));

        //Comando para mudar o estpa na caixa de texto e converter o que queremos adicionar lá em string
        tfArea.setText(String.valueOf(imovel.calcularAreaCirculo(raio)));
    }

    public void calcularLosango(ActionEvent actionEvent) {

        double maior = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a diagonal maior: "));
        double menor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a diagonal menor: "));

        //Comando para mudar ow estpa na caixa de texto e converter o que queremos adicionar lá em string
        tfArea.setText(String.valueOf(imovel.calcularAreaLosango(maior, menor)));
    }

    public void salvar(ActionEvent actionEvent) {
        String nomeProprietario = tfProprietario.getText();
        String cidade = tfCidade.getText();
        double area  = Double.parseDouble(tfArea.getText());

        dados.setNomeProprietario(nomeProprietario);
        dados.setCidade(cidade);
        dados.setArea(area);

        String texto = dados.obterDadosImovel();

        JOptionPane.showMessageDialog(null, texto);

    }

    public void fechar(ActionEvent actionEvent) {
        //Comando que finaliza a aplicação no JFX
        System.exit(0);
    }
}
