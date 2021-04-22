import java.util.Scanner;
/**EX12. Calcular e exibir o volume de um cone a partir dos valores da altura e 
* do raio da base que serão digitados.
* 
* @author Guilerme dos Santos Farias - CB3000362
* @author Igor Luiz - CB3000125
*/
public class TP12Ex12 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira a altura do cone: ");
        int h = ler.nextInt();

        System.out.print("Insira o raio da base do cone: ");
        int rB = ler.nextInt();

        double area = (3.14*Math.pow(rB,2)*h)/3;

        System.out.printf("O volume do cone digitado é: %.0f", area);
    }
}
