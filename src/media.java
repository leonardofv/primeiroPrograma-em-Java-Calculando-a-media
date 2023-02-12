import java.util.Scanner;
public class media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float nota1;
        float nota2;

        System.out.println("Digite sua primeira nota: ");
        nota1 = scan.nextFloat();
        System.out.println("Digite a segunda nota: ");
        nota2 = scan.nextFloat();

        float media = mediaFinal(nota1, nota2);

        if(media <= 5) {
            System.out.println("Sua média é de " + media + " você está Reprovado.");
        }else if(media >= 7) {
            System.out.println("Sua média é de " + media + " você está Aprovado.");
        }else {
            System.out.println("Sua média é de " + media + " você está de Reposição.");
        }
    }
    public static float mediaFinal(float nota1, float nota2) {
        return (nota1 + nota2) / 2;
    }
}

