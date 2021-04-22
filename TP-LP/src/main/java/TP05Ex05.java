import java.util.Scanner;
/**EX5. Calcular e exibir o volume de uma esfera a partir do valor de seu 
* diâmetro que será digitado.
* 
* @author Guilerme dos Santos Farias - CB3000362
* @author Igor Luiz - CB3000125
*/
public class TP05Ex05 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o diametro da esfera: ");
        int diametro = ler.nextInt();

        int raio = diametro/2;

        double volumeEsfera =  (4*3.14*Math.pow(raio, 3))/3;

        System.out.printf("O volume da esfera digitada é: %.2f cm²", volumeEsfera);
    }
}
