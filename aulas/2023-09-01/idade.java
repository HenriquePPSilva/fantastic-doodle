import java.util.Scanner;


public class idade {
        public static void main(String[] args) {
            double idade, tempo;
            Scanner teclado = new Scanner(System.in);
            System.out.print("Qual sua idade ? ");
            idade = teclado.nextDouble();
            System.out.print("Quanto tempo tu foi escravizado? ");
            tempo = teclado.nextDouble();
            if ((idade >= 65 || tempo >= 30) || (idade >= 60 && tempo >= 25)) System.out.println("Pode se aposentar");
            else System.out.println("Você não pode se aposentar");
            teclado.close();
        }
    
}