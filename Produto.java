package atividade1;

public class Produto {

	// atributos
	String nome;
	Double preco;
	int quantidade;
	int novoProduto;
	int compraProduto;

	// metodos
	public void exibirInformacoes() {
		System.out.println("Nome do produto: " + nome);
		System.out.println("Preço do produto: " + preco);
		System.out.println("Quantidade do produto: " + quantidade);
	}

	public void adicionarProduto(int qtd) {
		quantidade += qtd;

	}

	public void removerProduto(int qtd) {
		if (compraProduto <= quantidade) {
			quantidade -= compraProduto;
		} else {
			System.out.println("A quantidade desejada excede a quantidade disponível no estoque!!");
		}

	}

	public double valorEstoque() {
		return quantidade * preco;

	}

}
