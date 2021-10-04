package SistemaRestaurante;

import java.util.Scanner;

public class Sistema {


    public static void menu() {
        System.out.println("1 para cadastrar novo prato");
        System.out.println("2 para exibir o cardápio");
        System.out.println("3 para sair");
        // System.out.println("4 para sair");
    }

    private static Scanner obterDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }


    public static Prato prato() {
        String nome = obterDados("Digite o nome do prato: ").nextLine();
        double valor = obterDados("Digite o valor do prato: ").nextDouble();
        System.out.println("Prato adicionado\n");
        Prato prato = new Prato(nome, valor);

        return prato;
    }

    public static Ingrediente adicionarIngrediente() {
        String nome = obterDados("Digite o nome do ingrediente a ser adicionado: ").nextLine();
        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setNome(nome);
        return ingrediente;
    }

    public static void encerrarCadastro() {
        System.out.println("Sistema encerrado");

    }

    public static void ExecutarSistema() {
        boolean menu = true;
        menu();
        Cardapio cardapio = new Cardapio();

        while (menu) {
            int opcaoMenu = obterDados("\nDigite a opção escolhida: ").nextInt();
            if (opcaoMenu == 1) {
                Prato prato = prato();
                cardapio.adicionarPrato(prato);
                String opcaoIngredientes = obterDados("Deseja adicionar novos ingredientes:").nextLine();
                if (opcaoIngredientes.equalsIgnoreCase("Sim")) {
                    int qtdeIngredientes = obterDados("Quantos ingredientes: ").nextInt();
                    for (int x = 0; x < qtdeIngredientes; x++) {
                        Ingrediente ingrediente = adicionarIngrediente();
                        prato.adicionarIngrediente(ingrediente);
                    }
                }
            }if (opcaoMenu == 2) {
                    System.out.println(cardapio);
                } else if (opcaoMenu == 3) {
                    encerrarCadastro();
                    menu = false;
                }
            }
        }
}






