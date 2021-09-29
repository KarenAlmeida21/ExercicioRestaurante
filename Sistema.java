package SistemaRestaurante;

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
        int opcaoMenu = new Scanner(System.in).nextInt();
    }

    //cadastrando ingrediente
    public static Ingrediente cadastrarIngrediente() {
        String nomeIngrediente = capturarDados("Digite o nome do novo ingrediente: ").nextLine();
        Ingrediente novoiIngrediente = new Ingrediente(nomeIngrediente);
        return novoiIngrediente;
    }


        //cadastrando prato
        //  public static Imovel cadastrarImovel(){
        //        String endereco = capturarDados("Digite seu endereço: ").nextLine();
        //        double valorAluguel = capturarDados("Digite o valor do aluguel: ").nextDouble();
        //
        //        Imovel imovel = new Imovel(endereco, valorAluguel);
        //        return imovel;
        //    }
        public static Prato cadastrarPrato () {
            String nomePrato = capturarDados("Digite o nome do novo prato: ").nextLine();
            double valor = capturarDados("Digite o valor do novo prato: R$ ").nextDouble();
            Prato novoPrato = new Prato(nomePrato, valor);
            return novoPrato;
        }


    }


