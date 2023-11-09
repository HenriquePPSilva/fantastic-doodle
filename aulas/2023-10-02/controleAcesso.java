import java.util.Scanner;

public class controleAcesso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuario, senha;
        int n = 0;
        int tt = 0;
        do {
            System.out.print("Digite o usuário ai parceiro: ");
            usuario = teclado.nextLine();
            System.out.print("Digite a senha ai mané: ");
            senha = teclado.nextLine();
            if (!usuario.equals("thiago") || (!senha.equals("123456"))) System.out.println("Usuário ou senha incorretos!");
            tt++;
            if ((usuario.equals("thiago")) && (!senha.equals("123456"))){
                while(n < 3){
                    System.out.print("Digite a senha ai mané: ");
                    senha = teclado.nextLine();
                    if(n == 3) tt = 5;
                    n++;
                }
            }
            if((senha.equals("123456")) && (!usuario.equals("thiago"))){
                while(n < 3){
                    System.out.print("Digite o usuário ai mané: ");
                    usuario = teclado.nextLine();
                    if(n == 3) tt = 5;
                    n++;
                }
            }
            if (tt >= 5)System.out.println("SISTEMA BLOQUEADO!");
        } while (((!senha.equals("123456")) || (!usuario.equals("thiago"))) && (tt < 5));
        if (tt <= 5) System.out.print("ACESSO BLOQUEADO!");
        else System.out.println("Parabéns você conseguiu passar, agora você tem acesso!");
        teclado.close();
    }
}
//RESOLVER PROBLEMA DE LÓGICA NÃO ESTÁ COMPLETO