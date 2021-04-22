import java.util.Scanner;
/**EX17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e 
* exibir o cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln. 
* 
* @author Guilerme dos Santos Farias - CB3000362
* @author Igor Luiz - CB3000125
*/
public class TP17Ex17 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o valor de X: ");
        int x = ler.nextInt();

        System.out.println("Insira o valor de Y: ");
        int y = ler.nextInt();

        double result = Math.pow(x, y);

        System.out.printf("(X=%d) elevado (Y=%d) = %.2f", x, y, result);
    }
}
