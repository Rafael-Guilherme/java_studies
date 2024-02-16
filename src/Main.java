import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Entre os dados do produto: ");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade no estoque: ");
        produto.quantidade = sc.nextInt();

        System.out.println(" ");
        System.out.println("Dados do produto:" + produto);

        System.out.println(" ");
        System.out.print("Entre com o número de produtos para serem adicionar ao estoque: ");
        int quantidade = sc.nextInt();
        produto.adicionarQuantidade(quantidade);

        System.out.println(" ");
        System.out.println("Dados atualizados do produto:" + produto);

        System.out.println(" ");
        System.out.print("Entre com o número de produtos para serem removidos ao estoque: ");
        quantidade = sc.nextInt();
        produto.removerProduto(quantidade);

        System.out.println(" ");
        System.out.println("Dados atualizados do produto:" + produto);

        sc.close();
    }
}
