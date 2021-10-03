package SistemaRestaurante;

import java.util.Scanner;
//Vocês deverão criar um sistema de cadastros de pratos do dia de um restaurante. O sistema deve permitir o cadastro de um prato e todos os seus ingredientes. Ao final do programa deve ser exibido o nome do prato, seu valor e quais são seu ingredientes.
//
//
//
//Entrega Mínima: Sistema permite cadastrar um prato com valor, nome e ingredientes e no final exibir os valores.
//
//Entrega Máxima: O sistema permite Adicionar mais de um prato antes de exibir o cardápio.

public class Sistema {
    public static void menu() {
        System.out.println("1 para cadastrar novo ingrediente");
        System.out.println("2 para cadastrar novo prato");
        System.out.println("3 para exibir o cardápio");
        System.out.println("4 para sair");
    }

    private static Scanner obterDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }


    public static Ingrediente adicionarIngrediente() {
        String nome = obterDados("Digite o nome do novo ingrediente:").nextLine();
        System.out.println("Ingrediente adicionado");
        Ingrediente novoIngrediente = new Ingrediente(nome);
        return novoIngrediente;
    }
    public static Prato adicionarPrato(){
        String nome = obterDados("Digite o nome do parto: ").nextLine();
        double valor = obterDados("Digite o valor do prato: ").nextDouble();
        System.out.println("Prato adicionado\n");
        Prato novoPrato = new Prato(nome,valor);
        return novoPrato;
    }

    public static void encerrarCadastro(){
        System.out.println("Sistema encerrado");

    }
   public static void ExecutarSistema(){
        boolean menu =true;
        menu();
      Cardapio cardapio = new Cardapio();
        while (menu){
            int opcaoMenu = obterDados("Digite a opção escolhida: ").nextInt();
            if(opcaoMenu == 1){
                adicionarIngrediente();
            }if(opcaoMenu == 2){
                adicionarPrato();
            }if (opcaoMenu==3){
                System.out.println(cardapio);
            }else if (opcaoMenu==4){
                encerrarCadastro();
                menu=false;
            }
        }
   }

}
