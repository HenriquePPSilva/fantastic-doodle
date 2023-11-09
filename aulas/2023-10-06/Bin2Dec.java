import java.util.Scanner;

class Bin2Dec{
    public static void main(String[] args) {
        int n, i;
        int bit, num = 0;
        Scanner teclado = new Scanner(System.in);
        n = teclado.nextInt();
        i = n - 1;
        while (i>= 0){
            bit = teclado.nextInt();
            num += bit * (1 << i);
            i--;
        }
        System.out.println(num);
        teclado.close();
    }
}