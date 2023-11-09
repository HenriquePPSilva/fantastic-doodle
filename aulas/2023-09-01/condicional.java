import java.util.Scanner;
class condicional {
    public static void main(String[] args) {
        double horas, pagamento;
        System.out.print("Quantas horas você trabalhou? ");
        Scanner teclado = new Scanner(System.in);
        horas = teclado.nextDouble();
        pagamento = 50 * horas;
        if (horas > 8) pagamento = pagamento + 25 * (horas - 8);
        System.out.println("O valor do pagamento foi de: R$" + pagamento);
        teclado.close();
 
    }
}