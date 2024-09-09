package Q2;

import java.util.Scanner;

public class Mainfunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		Funcionario meuFuncionario = new Funcionario();
		
		
	System.out.println("Informe o nome do funcionário:");
	meuFuncionario.nome = sc.nextLine();
	
	System.out.println("Informe o salario do funcionário:");
	meuFuncionario.salario = sc.nextDouble();
	
	double recebe = meuFuncionario.salarioAntigo();
	double atualizar = meuFuncionario.calcularNovoSalario();
	
	System.out.printf("O valor do seu salário era de %.2f e agora é de %.2f !", recebe, atualizar);
	
