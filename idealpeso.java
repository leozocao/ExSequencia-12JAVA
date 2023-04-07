import java.util.Scanner;

public class idealpeso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double altura, pesoideal;

        System.out.print("Digite sua altura: ");
        altura = teclado.nextDouble();

        pesoideal = (72.7 * altura) - 58;

        System.out.print("Segundo a fórmula: peso ideal = (72,7 x altura) - 58 \nO peso ideal para sua altura é de: " + pesoideal);

        teclado.close();      
    }
}