import java.util.Scanner;
/**EX3. Calcular e exibir a área de um quadrado a partir do valor de sua 
* diagonal que será digitado. 
* 
* @author Guilerme dos Santos Farias - CB3000362
* @author Igor Luiz - CB3000125
*/
public class TP03Ex03 {
    public static void main(String [] args){
	Scanner ler = new Scanner(System.in);
				
	System.out.print("Insira a diagonal do quadrado em cm: ");
	int diagonal = ler.nextInt();
        
        double area = (Math.pow(diagonal,2))/2;
        
	System.out.printf("A área do quadrado digitado é: %.0fcm²",area);
    }    
}
