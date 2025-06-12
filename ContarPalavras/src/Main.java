import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")){

            contarPalavra();

            System.out.println("Deseja continuar? (s/n)");

            continuar = teclado.nextLine();


        }
        System.out.println("Sistema encerrado!");

        teclado.close();


    }
    public static void contarPalavra(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma frase: ");

        String frase = teclado.nextLine();
        String[] palavras = frase.trim().split("\\s+");

        int numeroPalavras = palavras.length;
        System.out.println("A frase contem " + numeroPalavras + " palavras!");


    }
}