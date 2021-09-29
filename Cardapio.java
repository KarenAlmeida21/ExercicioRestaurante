package SistemaRestaurante;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    List<Prato>pratosDoDia = new ArrayList<>();

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
    //Vocês deverão criar um sistema de cadastros de pratos do dia de um restaurante.
    // O sistema deve permitir o cadastro de um prato e todos os seus ingredientes.
    // Ao final do programa deve ser exibido o nome do prato, seu valor e quais são seu ingredientes.
    //
    //Entrega Mínima: Sistema permite cadastrar um prato com valor, nome e ingredientes
    // e no final exibir os valores.
    //
    //Entrega Máxima: O sistema permite Adicionar mais de um prato antes de exibir o cardápio
}
