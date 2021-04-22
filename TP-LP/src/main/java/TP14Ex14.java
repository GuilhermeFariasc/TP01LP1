import java.util.Scanner;
/**EX14. Calcular e exibir o volume livre de um ambiente que contém uma esfera 
* de raio “r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e 
* “a” serão digitados.
* 
* @author Guilerme dos Santos Farias - CB3000362
* @author Igor Luiz - CB3000125
*/
public class TP14Ex14 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira a aresta do cubo: ");
        int a = ler.nextInt();

        System.out.print("Insira o raio da esfera: ");
        int r = ler.nextInt();

        double volumeCubo = Math.pow(a, 3);

        double volumeEsfera =  4*3.14*Math.pow(r, 3)/3;

        double volumeLivre = volumeCubo - volumeEsfera;
        System.out.printf("O Volume Livre é %.0f", volumeLivre);
    }
}
