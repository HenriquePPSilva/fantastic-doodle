import java.util.Scanner;
class sinal{
    public static void main(String[] args) {
        double n;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor para verificar: ");
        n = teclado.nextDouble();
        if(n > 0) System.out.println(n + " É positivo");
        else if(n < 0) System.out.println(n + " É negativo");
        else System.out.println(n + " É zero");
        teclado.close();
    }
}