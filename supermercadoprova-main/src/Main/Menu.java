package Main;

import Utils.Inputs;

public class Menu {

    public static void controleMenu() {
        Estoque.inicializaEstoque();

        do {
            mostraMenu();
        } while (switchCase());

    }

    public static void mostraMenu() {
        System.out.println("------------MENU------------");
        System.out.println("1 - MOSTRAR CATALOGO");
        System.out.println("2 - ADICIONAR ITEM AO CARRINHO");
        System.out.println("3 - VER PEDIDO");
        System.out.println("4 - IR PRO CAIXA");

        System.out.println("0 - ENCERRAR");
    }

    public static boolean switchCase() {
        System.out.println("ESCOLHA UMA OP��O: ");

        switch (Inputs.inputInt()) {
        case 1:
            Estoque.imprimeCatalagoDoEstoque();
            return true;
        case 2:
            Pedido.adicionaItem();
            return true;
        case 3:
            Pedido.imprimePedido();
            return true;
        case 4:
            Caixa.chamaPagamento();
            return true;
        case 0:
            return false;
        default:
            System.out.println("Opcao invalida");
            return true;
        }
    }

}
