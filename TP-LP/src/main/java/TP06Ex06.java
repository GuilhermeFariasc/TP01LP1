import java.util.Scanner;
/**EX6. Calcular e exibir a média aritmética de quatro valores quaisquer que 
* serão digitados.
* 
* @author Guilerme dos Santos Farias - CB3000362
* @author Igor Luiz - CB3000125
*/
public class TP06Ex06 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);
		
        int[] nums = new int[4];
        int media = 0;
        
        for(int i = 0; i<nums.length; i++){
            System.out.printf("Insira valor %d: ",i+1);
            nums[i] = ler.nextInt();
            media += nums[i];
        }
       
        float total = (float)media / nums.length;

        System.out.println("A média aritimetica é: "+total);
    }		                
}
