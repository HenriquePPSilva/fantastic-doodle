import java.util.Scanner;

public class prova2P1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double r1, p1, r2, p2, r3, p3, freq, resultadoFinal;
        System.out.print("Entre com p1 e r1");
        p1 = teclado.nextDouble();
        r1 = teclado.nextDouble();
        System.out.print("Entre com p2 e r2");
        p2 = teclado.nextDouble();
        r2 = teclado.nextDouble();
        System.out.print("Entre com p3 e r3");
        p3 = teclado.nextDouble();
        r3 = teclado.nextDouble();
        if (r1 > p1) p1 = r1;
        if (r2 > p2) p2 = r2;
        if (r3 > p3) p3 = r3;
        if (freq >= 75) resultadoFinal = Math.round(p1 + p2 + p3) / 3;
        else resultadoFinal = 0;

        System.out.println("Resultado final: " + (int) resultadoFinal);
        if(resultadoFinal >= 6) System.out.println("Aprovado");
        else System.out.print("Reprovado");

        teclado.close();
    }   
}
