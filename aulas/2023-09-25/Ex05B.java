import java.util.Scanner;

public class Ex05B{
    public static void main(String[] args) {
        int n, maior;
        maior = 0;
        Scanner teclado = new Scanner(System.in);
        do{
           System.out.print("Digite um valor: ");
            n = teclado.nextInt();
            if (n > maior) maior = n; 
        } while (n != 0);
        System.out.println("O maior valor foi de : " + maior);
        teclado.close();
    }
}