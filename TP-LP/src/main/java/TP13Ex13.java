import java.util.Scanner;
/**EX13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir 
* dos valores da velocidade inicial (em m/s), da aceleração (m/s²) e do tempo 
* de percurso (em s) que serão digitados.
* 
* @author Guilerme dos Santos Farias - CB3000362
* @author Igor Luiz - CB3000125
*/
public class TP13Ex13 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira a velocidade inicial em m/s: ");
        int vI = ler.nextInt();

        System.out.println("Insira a aceleração em m/s²: ");
        int a = ler.nextInt();

        System.out.println("Insira tempo de percurso em s: ");
        int t = ler.nextInt();

        double vF = (vI+a*t)*3.6;

        System.out.printf("A velocidade final(VF) é: %.0f km/h ", vF);
    }
}
