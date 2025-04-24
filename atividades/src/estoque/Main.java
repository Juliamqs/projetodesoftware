package estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Roupas> estoque = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println(" MENU ESTOQUE DE ROUPAS");
            System.out.println("1 - Registrar nova roupa");
            System.out.println("2 - Adicionar peças");
            System.out.println("3 - Remover peças");
            System.out.println("4 - Exibir estoque");
            System.out.println("0 - Sair");
            
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Tipo: ");
                    String tipo = scanner.nextLine();
                    System.out.print("Tamanho (P, M, G): ");
                    String tamanho = scanner.nextLine();
                    System.out.print("Quantidade inicial: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Valor unitário (R$): ");
                    double valor = scanner.nextDouble();

                    Roupas novaRoupa = new Roupas(marca, tipo, tamanho, quantidade, valor);
                    estoque.add(novaRoupa);
                    System.out.println("Registrado com sucesso!");
                    System.out.println(novaRoupa);
                    break;

                case 2:
                    if (estoque.isEmpty()) {
                        System.out.println("Nenhuma roupa registrada.");
                        break;
                    }

                    exibirRoupasComIndice(estoque);
                    System.out.print("Digite o número da roupa para adicionar ao estoque: ");
                    int indiceAdd = scanner.nextInt();
                    System.out.print("Quantidade a adicionar: ");
                    int qtdAdd = scanner.nextInt();

                    estoque.get(indiceAdd).adicionarEstoque(qtdAdd);
                    System.out.println("Estoque atualizado:");
                    System.out.println(estoque.get(indiceAdd));
                    break;

                case 3:
                    if (estoque.isEmpty()) {
                        System.out.println("Nenhuma roupa registrada ainda.");
                        break;
                    }

                    exibirRoupasComIndice(estoque);
                    System.out.print("Digite o número da roupa para remover: ");
                    int indiceRemover = scanner.nextInt();
                    System.out.print("Quantidade a remover: ");
                    int qtdRemover = scanner.nextInt();

                    estoque.get(indiceRemover).removerEstoque(qtdRemover);
                    System.out.println("Estoque atualizado:");
                    System.out.println(estoque.get(indiceRemover));
                    break;

                case 4:
                    if (estoque.isEmpty()) {
                        System.out.println("Estoque vazio.");
                    } else {
                        System.out.println("\nEstoque Atual");
                        for (Roupas r : estoque) {
                            System.out.println(r);
                        }
                    }
                    break;

                case 0:
                    continuar = false;
                    System.out.println("Encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }

    public static void exibirRoupasComIndice(ArrayList<Roupas> lista) {
        System.out.println("\nLista de Roupas:");
        for (int i = 0; i < lista.size(); i++) {
            Roupas r = lista.get(i);
            System.out.println(i  + r.getTipo() + "  Marca: " + r.getMarca() + "  Tamanho: " + r.getTamanho());
        }
    }
}
