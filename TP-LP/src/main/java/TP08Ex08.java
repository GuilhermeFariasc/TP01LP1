import java.util.Scanner;
/**EX8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta 
* e dois metros e que um quilômetro possui mil metros, fazer um programa para 
* converter milhas marítimas em quilômetros. 
* 
* @author Guilerme dos Santos Farias - CB3000362
* @author Igor Luiz - CB3000125
*/
public class TP08Ex08 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira uma valor em MILHAS MARITIMAS: ");
        int mM = ler.nextInt();


        double rKm = (mM/1.852)/1000;

        System.out.printf("%d milhas maritimae é igual a %.0f KM",mM,rKm);
    }
}
