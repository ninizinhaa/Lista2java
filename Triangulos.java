package Q3;

public class Triangulos {
  double lado1;
  double lado2;
  double lado3;
  double lado4;
  double lado5;
  double lado6;
 
  
  public double calcularArea() {
	  double s = (lado1 + lado2 + lado3);
	  return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
	  
  }
  
  public double calcularArea2() {
	  double s = (lado4 + lado5 + lado6);
	  return Math.sqrt(s * (s - lado4) * (s - lado5) * (s - lado6));
	  
  }
  
}
