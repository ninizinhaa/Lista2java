package atividade1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		//instanciar objeto
		Produto meuProduto1 = new Produto();
		
		
		//utilizar atributos 
		System.out.println("Informe o nome do produto");
		meuProduto1.nome = sc.nextLine();
		
		System.out.println("Digite o preço do seu produto");
		meuProduto1.preco = sc.nextDouble();
		
		System.out.println("Digite a quantidade do seu produto");
		meuProduto1.quantidade = sc.nextInt();
		
		
		//adicionar ou remover produtos
		System.out.println("Informe a quantidade que deseja adicionar");
		int quantidadeAdicionar;
		quantidadeAdicionar = sc.nextInt();
		meuProduto1.adicionarProduto(quantidadeAdicionar);
		
		System.out.println("Informe a quantidade que deseja remover");
		int quantidadeRemover;
		quantidadeRemover = sc.nextInt();
		meuProduto1.removerProduto(quantidadeRemover);
		
		
		//atualizar estoque e valor
		double atualizar = meuProduto1.valorEstoque();
		
		System.out.printf("O valor do seu estoque atual é de: %.2f\n", atualizar);
		
		
		
   sc.close();
	}

}
