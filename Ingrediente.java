package SistemaRestaurante;

public class Ingrediente {
    private String nome;

    public Ingrediente() {
    }

    public Ingrediente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Ingredientes: ";
    }

}
