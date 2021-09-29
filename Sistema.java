package SistemaRestaurante;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Sistema {
    //recebendo a entrada
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }


    //menu
    public static void menu() {
        System.out.println("Digite 1-Para cadastrar um novo ingrediente");
        System.out.println("Digite 2- Para cadastrar um novo prato");
        System.out.println("Digite 3-Para exibir os ingredientes cadastrados");
        System.out.println("Digite 4- Para exibir o cardápio");

    }

    //cadastrando ingrediente
    public static Ingrediente cadastrarIngrediente() {
        String nome = capturarDados("Digite o nome do novo ingrediente: ").nextLine();
        Ingrediente novoIngrediente = new Ingrediente(nome);
        return novoIngrediente;
    }


    public static Prato cadastrarPrato() {
        String nome = capturarDados("Digite o nome do novo prato: ").nextLine();
        double valor = capturarDados("Digite o valor do novo prato: R$ ").nextDouble();
        Prato novoPrato = new Prato(nome, valor);
        return novoPrato;
    }


    //executando
    public static void executar() {
        boolean menu = true;
        Cardapio restaurante1 = new Cardapio();

        while (menu) {
            menu();
            int opcaoMenu = capturarDados("Digite a opção selecionada: ").nextInt();

            if (opcaoMenu == 1) {
                //cadastrar novo ingrediente
            }
            if (opcaoMenu == 2) {
                //cadastrar novo prato
            } else if(opcaoMenu==3){
                //exibir ingredientes
            }else if(opcaoMenu==4){
                //exibir pratos
            }else {
                System.out.println("Volte Sempre");
                menu = false;
            }
        }


    }
}


