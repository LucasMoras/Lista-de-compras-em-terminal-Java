import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

void main() {
    Scanner leitor = new Scanner(System.in);
    List<String> lista = new ArrayList<>();
    String decisao;
    int escolha;

    // Tela de opções
    do {
        IO.println("---Lista de compras---");
        IO.println("1. Adicionar itens à lista.");
        IO.println("2. Ver sua lista atual.");
        IO.println("3. Para sair");
        IO.print("Escolha: ");
        escolha = leitor.nextInt();
        leitor.nextLine();

        if (escolha == 1) {
            // Adiciona itens
            do {
                IO.print("Digite o nome do item: ");
                lista.add(leitor.nextLine());
                IO.print("Deseja adicionar mais um item a sua lista?(Sim/Não): ");
                decisao = leitor.nextLine();
            } while (decisao.equalsIgnoreCase("Sim"));
            IO.println("Itens adicionados!");

        } else if (escolha == 2) {
            // Mostra a lista atual
            IO.println("Sua lista de compras atual:");
            for (int i = 0; i < lista.size(); i++) {
                IO.println((i + 1) + ". " + lista.get(i));
            }
            // Remoção de item
            IO.print("Gostaria de remover algum item? (Sim/Não): ");
            decisao = leitor.nextLine();
            if (decisao.equalsIgnoreCase("Sim")) {
                IO.print("Escolha um índice para remover: ");
                escolha = leitor.nextInt();
                leitor.nextLine();
                if (escolha > 0 && escolha <= lista.size()) {
                    lista.remove(escolha - 1);
                    IO.println("Item removido!");
                } else {
                    IO.println("Índice inválido!");
                }
            }
        } else {
            IO.println("Fechando...");
        }
    } while (escolha == 1 || escolha == 2);

    leitor.close();
}
