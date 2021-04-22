import java.util.Scanner;
/**EX16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir
* as seguintes funções trigonométricas: seno, cosseno, tangente e secante deste
* ângulo. Lembre-se que uma função trigonométrica trabalha em radianos. 
* 
* @author Guilerme dos Santos Farias - CB3000362
* @author Igor Luiz - CB3000125
*/
public class TP16Ex16 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira um ângulo em graus: ");
        double ang = Math.toRadians(ler.nextDouble());

        double sen = Math.sin(ang);
        double cos = Math.cos(ang);
        double tan = Math.tan(ang);
        double sec = 1/cos;

        System.out.printf(" Seno = %f%n Cosseno = %f%n Tangente = %f%n "
                + "Secante = %f",sen,cos,tan,sec);
    }
}
