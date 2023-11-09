import java.util.Scanner;
import java.lang.Math;

class Cilindro2{
    public static void main(String[] args){
        double raio, altura;
        double volume, area;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com o seu raio: ");
        raio = teclado.nextDouble();
        System.out.print("Entre com a sua altura: ");
        altura = teclado.nextDouble();
        volume = Math.PI * raio * raio * altura;
        area = 2 * Math.PI * raio * (altura + raio);
        System.out.println("O valor do seu volume é de :" + volume);
        System.out.println("O valor da sua area é de :" + area);
        teclado.close();
    }
}