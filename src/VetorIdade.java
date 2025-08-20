import java.util.Scanner;

public class VetorIdade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Digite a idade " + (i+1) + ": ");
            idades[i] = sc.nextInt();
        }

        System.out.println("Idades maiores que 18:");
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 18) {
                System.out.println(idades[i]);
            }
        }

        sc.close();
    }
}
