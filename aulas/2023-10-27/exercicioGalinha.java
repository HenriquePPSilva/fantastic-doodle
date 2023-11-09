public class exercicioGalinha {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("1 elefante incomoda muita gente");
        for(int i = 2; i <= 10; i++){
            System.out.print(i + " elefantes");
            if(i%2==0){
                for(int j = 1; j<=i; j++){
                    System.out.print(" incomodam muito mais!");
                }
            }
            System.out.println(" muita gente");
        }
        System.out.println("");
        for(int i = 10; i >= 2; i--){
            System.out.print(i + " elefantes");
            if(i%2==1){
                for(int j = 1; j <= i; j++){
                    System.out.print(" incomodam");
                }
            }
            System.out.println(" muita gente");
        }
        System.out.println("1 elefante incomoda muita gente");
    }
}
