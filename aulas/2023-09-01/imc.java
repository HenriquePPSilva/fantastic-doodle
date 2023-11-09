import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        double altura, peso, imc;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a sua altura: ");
        altura = teclado.nextDouble();
        System.out.print("Digite o seu peso: ");
        peso = teclado.nextDouble();
        imc = peso / altura * altura;
        if(imc < 18.5) System.out.println("Abaixo do peso"); 
        else if(imc >= 18.5 && imc < 24.9) System.out.println("Peso normal");
        else if(imc >= 25 && imc < 29.9 ) System.out.println("Sobrepeso");
        else System.out.println("Obesidade");
        teclado.close();
    }
    
}
