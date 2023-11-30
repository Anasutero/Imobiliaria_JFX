package br.com.imobiliaria.model;

public class Imovel extends Calculos{

    private String nomeProprietario;

    private String cidade;

    private double area;

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String obterDadosImovel(){
        return String.format("Seus dados:\nProprietário: %s\n Cidade: %s\n Área: %.2f", this.nomeProprietario, this.cidade, this.area);
    }



}
