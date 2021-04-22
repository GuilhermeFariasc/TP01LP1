import java.util.Scanner;
/**EX7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
* digitados.
* 
* @author Guilerme dos Santos Farias - CB3000362
* @author Igor Luiz - CB3000125
*/
public class TP07Ex07 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);
		
        int[] nums = new int[2];
        
        for(int i = 0; i<nums.length; i++){
            System.out.printf("Insira valor %d: ",i+1);
            nums[i] = ler.nextInt();
        }
        
        double media = Math.sqrt((nums[0]*nums[1]));

        System.out.printf("A média geometrica é: %.2f",media);
    }
}
