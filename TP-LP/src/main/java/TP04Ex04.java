import java.util.Scanner;
/**EX4. A partir dos valores da base e altura de um triângulo, calcular e exibir 
* sua área. 
* 
* @author Guilerme dos Santos Farias - CB3000362
* @author Igor Luiz - CB3000125
*/
public class TP04Ex04 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);
   				
	System.out.print("Insira a base do triângulo: ");
	int base = ler.nextInt();    
   
        System.out.print("Insira a altura do triângulo: ");
	int altura = ler.nextInt();
        
        double area = (base*altura)/2;

        System.out.println("A área do triangulo digitado é: "+ area + " cm²");
    }
}

