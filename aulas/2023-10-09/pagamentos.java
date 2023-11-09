import java.util.Scanner;

public class pagamentos {
    public static void main(String[] args) {
        double sal, hrs, pag;
        int tot;
        Scanner teclado = new Scanner(System.in);
        tot = 0;
        for(int i = 1; i <= 3; i++){
            System.out.print("Escreva o sálario do funcionario: R$ ");
            sal = teclado.nextDouble();
            System.out.print("Escreva as horas trabalhadas: " + " h");
            hrs = teclado.nextDouble();
            pag = hrs * sal;
            System.out.println("O valor do pagamento foi de: " + pag);
            tot += pag;
        }
        System.out.println("O total do pagamento foi de: " + tot);
        teclado.close();
    }
    
}