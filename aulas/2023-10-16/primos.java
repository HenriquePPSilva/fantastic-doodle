import java.util.Scanner;
public class primos{
    public static void main(String[] args) {
        int n;
        boolean ehPrimo;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com um inteiro positivo: ");
        n = teclado.nextInt();
        ehPrimo = true;
        for(int i = 2; i <= n -1 ; i++){
            if(n % i == 0){
                ehPrimo = false;
                System.out.print("Ele não é primo, pois é divisível por : " + i);
                break;
            } 
        }
        if(n > 1 && ehPrimo) System.out.println("É primo");
        else System.out.println("Não é primo"); 
        teclado.close();
    }
}