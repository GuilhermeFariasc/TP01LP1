import java.util.Scanner;
/**EX15. Entrar via teclado com o valor da cotação do dólar e uma certa 
* quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).
* 
* @author Guilerme dos Santos Farias - CB3000362
* @author Igor Luiz - CB3000125
*/
public class TP15Ex15 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira um valor em US$(dólar americano): ");
        double dA = ler.nextDouble();

        System.out.println("Insira a cotação do dolar: ");
        double cD = ler.nextDouble();

        double emReais = dA*cD;

        System.out.printf("US$ %.2f é igual a R$ %.2f = ",dA,emReais);
    }
}
