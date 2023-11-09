import java.util.Scanner;
public class fat {
    public static void main(String[] args) {
        double n, fat;
        Scanner teclado = new Scanner(System.in);
        fat = 1;
        System.out.println("Digite um valor ");
        n = teclado.nextDouble();
        while(n > 1){
            fat = fat * n;
            n = n - 1;
        }
        System.out.println("O valor do fatorial de é: " + fat);
        teclado.close();
    }
}
