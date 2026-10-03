package aividadeSwitchCase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciação (com aspas corrigidas no nome do Pedro)
        Livro livro = new Livro("Java primeiros passos", "Autor - Daniel", 50.0);
        Cliente cliente = new Cliente("Pedro", "123.456.789-00", 30.0);

        // Apresentação do Menu
        System.out.println("=== MENU DE OPÇÕES ===");
        System.out.println("1 - Consultar dados do Livro e do Cliente");
        System.out.println("2 - Realizar a Compra do Livro");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opção: ");

        // Leitura 
        int opcao = scanner.nextInt();

        // Estrutura switch-case
        switch (opcao) {
            case 1:
                livro.exibirDados();
                System.out.println("Cliente: " + cliente.getNome() + " | Saldo Atual: R$ " + cliente.getSaldoCarteira());
                break;

            case 2:
                boolean compraAprovada = cliente.realizarPagamento(livro.getPreco());
                if (compraAprovada) {
                    System.out.println("Compra realizada com sucesso! Saldo restante: R$ " + cliente.getSaldoCarteira());
                } else {
                    System.out.println("Erro: Saldo insuficiente na carteira!");
                }
                break;

            case 3:
                System.out.println("Encerrando atendimento. Até logo!");
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}