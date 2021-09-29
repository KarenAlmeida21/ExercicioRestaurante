package SistemaRestaurante;

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

    @Override
    public String toString() {
        return "\nCardápio : " +
                "\n Prato do Dia: " + pratosDoDia;
    }

}
