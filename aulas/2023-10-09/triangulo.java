import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        int altura, margem, largura;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual é a altura do quadrado? ");
        altura = teclado.nextInt();
        System.out.print("Qual é a margem do quadrado? ");
        margem = teclado.nextInt();
        System.out.print("Qual é a largura do quadrado? ");
        largura = teclado.nextInt();
        for(int i = 1; i <= margem; i++){
            System.out.print("...");
        }
        for(int i = 1; i <= largura; i++){
            System.out.print("x");
        }
        for(int j = 1; i <= altura - 2; i++){
            for(int i = 1; i <= margem; i++) System.out.print(".");
            System.out.print("x");
            for(int i = 1; i <= largura; i++) System.out.print("x");
            for(int i = 1; i <= largura - 2; i++) System.out.print(" ");
            for(int i = 1; i <= margem; i++) System.out.print(".");
        }
    }
}
