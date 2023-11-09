import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        int dia, mes, ano;
        String mesExtenso, sufixoOrdinal;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a DD/MM/AAAA");
        dia = teclado.nextInt();
        mes = teclado.nextInt();
        ano = teclado.nextInt();
        switch(mes){
            case 1: mesExtenso = "January"; break;
            case 2: mesExtenso = "February"; break;
            case 3: mesExtenso = "March"; break;
            case 4: mesExtenso = ""
        }
        
    }
}
