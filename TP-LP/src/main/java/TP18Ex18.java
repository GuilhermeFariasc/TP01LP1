import java.util.Scanner;
/**EX18. Entrar via teclado com o valor de cinco produtos. Após as entradas, 
* digitar um valor referente ao pagamento da somatória destes valores. Calcular
* e exibir o troco que deverá ser devolvido. 
* 
* @author Guilerme dos Santos Farias - CB3000362
* @author Igor Luiz - CB3000125
*/
public class TP18Ex18 {
    public static void main(String [] args){
	Scanner ler = new Scanner(System.in);
		
        double[] nums = new double[5];
	double soma = 0.00;
        
        for(int i = 0; i<nums.length; i++){
            System.out.printf("Insert valor do produto %d R$",i+1);
            nums[i] = ler.nextInt();
            soma += nums[i];
        }
        
        System.out.printf("Insert valor pago: R$ ");
        double vP = ler.nextDouble();
        
        double troco = vP-soma;
        
        System.out.printf("Troco R$%.2f ",troco);
    }
}
