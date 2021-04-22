import java.util.Scanner;
/**EX10. Entrar via teclado com o valor de uma temperatura em graus Celsius, 
* calcular e exibir sua temperatura equivalente em Fahrenheit. 
* 
* @author Guilerme dos Santos Farias - CB3000362
* @author Igor Luiz - CB3000125
*/
public class TP10Ex10 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira um valor em ºC: ");
        int c = ler.nextInt();

        double f = (c*9/5)+32;

        System.out.printf("%d ºC é igual a %.0f ºF ", c, f);
    }
}
