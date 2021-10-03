package SistemaRestaurante;

import sistema_imobiliario.Morador;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    List<Prato> pratosDoDia = new ArrayList<>();
    private String nome;

    public Cardapio() {
    }

    public Cardapio(String nome) {
        this.nome = nome;
    }

    public Cardapio(List<Prato> pratosDoDia) {

        this.pratosDoDia = pratosDoDia;
    }

    public List<Prato> getPratosDoDia() {
        return pratosDoDia;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarPrato(Prato novoPrato) {
        pratosDoDia.add(novoPrato);
    }


    @Override
    public String toString() {
        return "Cardapio " +
                " Nome: " + nome +
                " Prato do dia: " + pratosDoDia;
    }
}
