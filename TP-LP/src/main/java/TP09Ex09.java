import java.util.Scanner;
/**EX9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir 
* dos valores da resistência e corrente elétrica que serão digitados. Utilize a 
* lei de Ohm.
* 
* @author Guilerme dos Santos Farias - CB3000362
* @author Igor Luiz - CB3000125
*/
public class TP09Ex09 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        System.out.printf("Insira (I)Corrente Elétrica: ");
        double i = ler.nextDouble();

        System.out.printf("Insira (R)Resistência Elétrica: ");
        double r = ler.nextDouble();

        double v = i*r;

        System.out.printf("A (V)Tensão Elétrica é: %.0fV", v);
    }
}
