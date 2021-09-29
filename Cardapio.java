package SistemaRestaurante;

import sistema_imobiliario.Morador;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    List<Prato> pratosDoDia = new ArrayList<>();

    public Cardapio() {
    }

    public Cardapio(List<Prato> pratosDoDia) {
        this.pratosDoDia = pratosDoDia;
    }

    public List<Prato> getPratosDoDia() {
        return pratosDoDia;
    }

    public void adicionarPrato(Prato novoPrato) {
        pratosDoDia.add(novoPrato);
    }

    @Override
    public String toString() {
        return "\nCardápio : " +
                "\n Prato do Dia: " + pratosDoDia;
    }

}
