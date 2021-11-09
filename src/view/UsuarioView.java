package view;

import controller.UsuarioController;
import model.Usuario;

import java.util.Scanner;

public class UsuarioView {

    Usuario usuario = new Usuario();
    UsuarioController usuarioController = new UsuarioController();

    public void menu() {

        Scanner scan = new Scanner(System.in);
        int opcao;
        do {

            System.out.println("===================================");
            System.out.println("    [1] - Adicionar Numero         ");
            System.out.println("    [2] - Visualizar Lista");
            System.out.println("    [3] - Relatorios ");
            System.out.println("===================================");

            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    this.adicionar();
                    break;
                case 2:
                    this.listar();
                    break;
                case 3:
                    this.relatorios();
                    break;
                default:
                    break;
            }
        } while (true);
    }

    public void adicionar() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        String numero = scan.nextLine();
        System.out.println("===================================");
        usuarioController.adicionar(numero);
    }

    public void listar() {
        System.out.println(usuarioController.listar());
    }

    public void relatorios() {
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===================================");
            System.out.println("      [1] - Maior Numero");
            System.out.println("      [2] - Menor Numero");
            System.out.println("      [3] - Média dos valores");
            System.out.println("      [0] - Voltar");
            System.out.println("===================================");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(usuarioController.maiorValor());
                    break;
                case 2:
                    System.out.println(usuarioController.menorValor());
                    break;
                case 3:
                    System.out.println(usuarioController.mediaValores());
                    break;
                default:
                    break;
            }

        } while (opcao != 0);
    }
}
