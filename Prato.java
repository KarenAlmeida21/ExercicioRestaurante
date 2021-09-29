package SistemaRestaurante;

import sistema_imobiliario.Morador;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    private String nome;
    private double valor;
    List<Ingrediente> listaIngrediente = new ArrayList<>();

    public Prato() {
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

    public List<Ingrediente> getListaIngrediente() {
        return listaIngrediente;
    }

    Prato prato1 = new Prato();

    public void adicionarIngrediente(Ingrediente novoIngrediente) {
        listaIngrediente.add(novoIngrediente);
        //


    }


    @Override
    public String toString() {
        return "\n Nome do prato: " + nome +
                "\n Ingredientes: " + listaIngrediente;
    }
}
