package SistemaRestaurante;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    private String nome;
    List<Ingrediente> listaIngrediente = new ArrayList<>();

    public Prato(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\n Nome do prato: " + nome +
                "\n Ingredientes: " + listaIngrediente;
    }
}
