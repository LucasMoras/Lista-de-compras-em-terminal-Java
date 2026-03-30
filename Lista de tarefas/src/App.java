import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        String decisao;
        int escolha;

        // Tela de opções
        do {
            System.out.println("---Lista de compras---");
            System.out.println("1. Adicionar itens à lista.");
            System.out.println("2. Ver sua lista atual.");
            System.out.println("3. Para sair");
            System.out.print("Escolha: ");
            escolha = leitor.nextInt();
            leitor.nextLine();

            if (escolha == 1) {
                // Adiciona itens
                do {
                    System.out.print("Digite o nome do item: ");
                    lista.add(leitor.nextLine());
                    System.out.print("Deseja adicionar mais um item a sua lista?(Sim/Não): ");
                    decisao = leitor.nextLine();
                } while (decisao.equalsIgnoreCase("Sim"));
                System.out.println("Itens adicionados!");

            } else if (escolha == 2) {
                // Mostra a lista atual
                System.out.println("Sua lista de compras atual:");
                for (int i = 0; i < lista.size(); i++) {
                    System.out.println((i + 1) + ". " + lista.get(i));
                }
                // Remoção de item
                System.out.print("Gostaria de remover algum item? (Sim/Não): ");
                decisao = leitor.nextLine();
                if (decisao.equalsIgnoreCase("Sim")) {
                    System.out.print("Escolha um índice para remover: ");
                    escolha = leitor.nextInt();
                    leitor.nextLine();
                    if (escolha > 0 && escolha <= lista.size()) {
                        lista.remove(escolha - 1);
                        System.out.println("Item removido!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                }
            } else {
                System.out.println("Fechando...");
            }
        } while (escolha == 1 || escolha == 2);

        leitor.close();
    }
}