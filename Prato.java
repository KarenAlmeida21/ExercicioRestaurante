package SistemaRestaurante;

import sistema_imobiliario.Morador;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    private String nome;
    private double valor;
    List<Ingrediente> listaIngrediente = new ArrayList<>();

    public Prato(String arroz) {
    }

    public Prato(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;

    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Ingrediente> getListaIngrediente() {
        return listaIngrediente;
    }

    public void adicionarIngrediente(Ingrediente novoIngrediente) {

        listaIngrediente.add(novoIngrediente);
    }



    @Override
    public String toString() {
        return "\n Nome do prato: " + getNome()+
                "\n Valor: " + getValor() +
                "\n Ingredientes: " + getListaIngrediente();
    }
}
