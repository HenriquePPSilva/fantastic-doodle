import java.util.Scanner;
public class numerosTriangulares {
    public static void main(String[] args) {
        int entrada, c = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual número da sequência triangular você quer? ");
        entrada = teclado.nextInt();
        for(int i = 0; i <= entrada; i++) c += i;
        System.out.println("O valor da saida referente a entrada é de: " + c);
        teclado.close();
    }
}

