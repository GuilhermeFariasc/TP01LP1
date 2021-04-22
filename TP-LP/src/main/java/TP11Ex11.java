import java.util.Scanner;
/**EX11. A partir do diâmetro de um círculo que será digitado, calcular e exibir
* sua área. 
* 
* @author Guilerme dos Santos Farias - CB3000362
* @author Igor Luiz - CB3000125
*/
public class TP11Ex11 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira o diametro do círculo: ");
        int diametro = ler.nextInt();

        int raio = diametro/2;

        double area = 3.14*Math.pow(raio,2);

        System.out.printf("A área do circulo digitado é: %.0f", area);
    }
}
