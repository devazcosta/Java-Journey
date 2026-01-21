import java.util.Scanner;

public class Exercicio1_6 {
    
    public static void main( String[] args ){

        double n1;
        double n2;
        double soma;
        double subtracao;
        double multiplicacao;
        double divisao;

        /* 
        Queremos receber dois números do usuário 
        e executar operações matemáticas básicas com ele. 
        */

        Scanner scan = new Scanner( System.in );
        System.out.printf( "Digite um número: " );
        n1 = Double.parseDouble( scan.nextLine() );

        System.out.printf( "Digite outro número: " );
        n2 = Double.parseDouble( scan.nextLine() );

        soma = n1 + n2;
        subtracao = n1 - n2;
        multiplicacao = n1 * n2; 
        divisao = n1 / n2;

        System.out.printf( "%.2f + %.2f = %.2f\n", n1, n2, soma );
        System.out.printf( "%.2f - %.2f = %.2f\n", n1, n2, subtracao );
        System.out.printf( "%.2f * %.2f = %.2f\n", n1, n2, multiplicacao );
        System.out.printf( "%.2f / %.2f = %.2f\n", n1, n2, divisao );

        scan.close();

    }
}
