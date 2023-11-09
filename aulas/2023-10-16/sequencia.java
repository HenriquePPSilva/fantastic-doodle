import java.util.Scanner;
public class sequencia {
    public static void main(String[] args) {
        int n = 1, maior = 0, vz = 0;
        Scanner teclado = new Scanner(System.in);
        while (n != 0){
            System.out.print("Entre com um número: ");
            n = teclado.nextInt();
            if(n > maior) {
                maior = n;
                vz = vz + 1;
            } 
        }
        System.out.println("O maior inteiro foi de " + maior + "que ocorreu " + vz + "vezes");
    }
}
