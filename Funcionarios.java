package Q2;

public class Funcionario {
 String nome;
 double salario;
 double novoSalario;
 
 public double salarioAntigo(){
	 return salario;
 }
 
 public double calcularNovoSalario() {
     if (salario >= 1 && salario <= 1000) {
         novoSalario = salario * 1.15; 
     } else if (salario >= 1001 && salario <= 1500) {
         novoSalario = salario * 1.10; 
     } else if (salario >= 1501 && salario <= 2000) {
         novoSalario = salario * 1.05;
     } else {
         novoSalario = salario; 
     }
     return novoSalario;
 }
}
