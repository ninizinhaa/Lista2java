package Q4;
import java.util.Scanner;

public class Alunos {
	String nome;
	double nota1;
	double nota2;
	double nota3;

	public void setNota1(double nota) {
        while (nota < 0 || nota > 30) {
            System.out.println("Nota inválida para o primeiro trimestre. Deve estar entre 0 e 30.");
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a nota do primeiro trimestre novamente: ");
            nota = sc.nextDouble();
            sc.close();
        }
        
    }

    public void setNota2(double nota) {
        while (nota < 0 || nota > 35) {
            System.out.println("Nota inválida para o segundo trimestre. Deve estar entre 0 e 35.");
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a nota do segundo trimestre novamente: ");
            nota = sc.nextDouble();
            sc.close();
        }
        
    }

    public void setNota3(double nota) {
        while (nota < 0 || nota > 35) {
            System.out.println("Nota inválida para o terceiro trimestre. Deve estar entre 0 e 35.");
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a nota do terceiro trimestre novamente: ");
            nota = sc.nextDouble();
            sc.close();
        }
        
    }

    public double calcularNotaFinal() {
        return nota1 + nota2 + nota3;
    }

    public String verificarAprovacao() {
        double notaFinal = calcularNotaFinal();
        if (notaFinal >= 70) {
            return "Aprovado";
        } else {
            double pontosFaltando = 70 - notaFinal;
            return "Reprovado. Faltaram " + pontosFaltando + " pontos para a aprovação.";
        }
    }
  
}
