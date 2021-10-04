package SistemaRestaurante;

import sistema_imobiliario.Morador;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
     public List<Prato> pratosDoDia = new ArrayList<>();


    public Cardapio() {
    }

    public void adicionarPrato(Prato novoPrato) {
        pratosDoDia.add(novoPrato);
    }




    @Override
    public String toString() {
        return "Cardapio " +
                " Prato do dia: " + pratosDoDia;
    }
}
