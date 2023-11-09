import java.util.Scanner;
import java.lang.Math;

class hipot{
    public static void main(String[] args){
        double cat1, cat2, hipotenusa, raiz;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o cateto adjacente: ");
        cat1 = teclado.nextDouble();
        System.out.print("Digite o cateto oposto: ");
        cat2 = teclado.nextDouble();
        hipotenusa = (cat1 * cat1) + (cat2 * cat2);
        raiz = Math.sqrt(hipotenusa);
        System.out.println("O valor da hipotenusa é: " + raiz);
        teclado.close();
    }
}