import java.util.Scanner;

public class exercicioAula {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, par, somaImpar = 0, maior, numerosDigitados;
        maior = 0;
        System.out.print("Quantos números vai digitar? ");
        n = teclado.nextInt();
        for(int c = 0; c <= n; c++){
            numerosDigitados = teclado.nextInt();
            if(numerosDigitados % 2 == 0){
                par = numerosDigitados;
                if(par > maior) maior = par;
                
            }
            if(numerosDigitados % 2 == 1){
                somaImpar += numerosDigitados;
            }else System.out.println("Não foram encontrados números ímpares.");
            
        }
        System.out.println("O maior número foi par: " + maior);
        System.out.println("A soma dos números ímpares foi de: " + somaImpar);
    }
}
