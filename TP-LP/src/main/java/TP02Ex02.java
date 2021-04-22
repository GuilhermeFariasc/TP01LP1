import java.util.Scanner;
/**EX2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta
* que será digitado. 
* 
* @author Guilerme dos Santos Farias - CB3000362
* @author Igor Luiz - CB3000125
*/
public class TP02Ex02 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira a aresta do quadrado: ");
        int aresta = ler.nextInt();

        double area = Math.pow(aresta, 2);

        System.out.printf("A área do quadrado digitado é: %.0f", area);
    }
}
