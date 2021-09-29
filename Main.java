package SistemaRestaurante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//instanciando ingredientes
        Ingrediente ingrediente1 = new Ingrediente("batata");
        Ingrediente ingrediente2 = new Ingrediente("maça");
        Ingrediente ingrediente3 = new Ingrediente("sal");

        //instanciando prato
        Prato prato1 = new Prato("Arroz",10);
        prato1.adicionarIngrediente(ingrediente1);

        //instanciando cardapio
        Cardapio cardapio1 = new Cardapio("Cardapio Especial");

        //adicionando prato a cardapio
        cardapio1.adicionarPrato(prato1);

        //exibindo cardapio
        System.out.println(cardapio1);



        }


    }

