// Prova2Parte2.java
// Aluno: Henrique Patricio de Souza da Silva - ADS

import java.util.Scanner;
class Prova2Parte2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int totalAlunos, n1, n2, n3, n4;
        double media = 0, soma;

        System.out.print("Entre com a quantidade de alunos: ");
        totalAlunos = teclado.nextInt();
        for(int i = 1; i <= totalAlunos; i++){
            System.out.print("Entre com as notas de cada parte, para o aluno " + i + ":");
            n1 = teclado.nextInt();
            n2 = teclado.nextInt();
            n3 = teclado.nextInt();
            n4 = teclado.nextInt();
            if(n1 < n2 && n1 < n3 && n1 < n4){
                soma = n2 + n3 + n4;
                media = Math.round(soma / 3);
                System.out.println("A nota da avaliação é: " + media);
            }else if(n2 < n1 && n2 < n3 && n2 < n4){
                soma = n1 + n3 + n4;
                media = Math.round(soma / 3);
                System.out.println("A nota da avaliação é: " + media);
            }else if(n3 < n1 && n3 < n2 && n3 < n4){
                soma = n1 + n2 + n4;
                media = Math.round(soma / 3);
                System.out.println("A nota da avaliação é: " + media);
            }else if(n4 < n1 && n4 < n2 && n4 < n3){
                soma = n1 + n3 + n2;
                media = Math.round(soma / 3);
                System.out.println("A nota da avaliação é: " + media);
            }
            if(n1 == n2 && n1 == n3 && n1 == n4){
                soma = n1 + n2 + n3;
                media = Math.round(soma / 3);
                System.out.println("A nota da avaliação é: " + media);
            }
        }
        teclado.close();
    }
}