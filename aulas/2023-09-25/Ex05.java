import java.util.Scanner;

public class Ex05{
    public static void main(String[] args) {
        int n, maior, i, quantidade;
        Scanner teclado = new Scanner(System.in);
        maior = 0;
        i = 0;
        System.out.print("Digite quantos números você quer testar: ");
        quantidade = teclado.nextInt();
        while (i <= quantidade){
            System.out.print("Escreva um número: ");
            n = teclado.nextInt();
            if (n > maior) maior = n;
            i++;
        }
        System.out.println("O maior valor foi de : " + maior);
        teclado.close();
    }
}