import java.util.Random;
import java.util.Scanner;
public class SorteioJava{
    public static void main(String[] args) {
        float segredo, palpite, tentativas;
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        segredo = r.nextInt(100) + 1;
        tentativas = 0;
        do{
            System.out.print("Digite o seu palpite: ");
            palpite = teclado.nextFloat();
            tentativas ++;
            if(palpite < segredo) System.out.println("O Segredo é maior");
            else System.out.println("O segredo é menor");
        } while (palpite != segredo);
        System.out.println("Você tentou " + tentativas + " vezes.");
        teclado.close();
    }
}