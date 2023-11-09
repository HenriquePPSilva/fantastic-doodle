public class metodoDesenhaRetangulo {

    public static void DesenhaRetangulo(int altura, int largura, String caractere){
        for(int i = 0; i < altura; i++){
            for(int j = 0; j < largura; j++){
                System.out.print(caractere);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        System.out.println("Vou desenhar um retangulo . . .");
        DesenhaRetangulo(10,20, "J");
        System.out.println("Vou desenhar outro retangulo . . .");
        DesenhaRetangulo(10,20, "J");
    }
}       
