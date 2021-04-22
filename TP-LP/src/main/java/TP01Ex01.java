import java.util.Scanner;
/**EX1. Entrar via teclado com a base e a altura de um retângulo, calcular e 
* exibir sua área.  
* 
* @author Guilerme dos Santos Farias - CB3000362
* @author Igor Luiz - CB3000125
*/
public class TP01Ex01 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira a base do retângulo: ");
        int base = ler.nextInt();

        System.out.print("Insira a altura do retângulo: ");
        int altura = ler.nextInt();

        int area = base*altura;

        System.out.print("A área do retângulo digitado é "+ area);
    }
}
