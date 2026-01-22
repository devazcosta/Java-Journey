import java.util.Scanner;

public class Exercicio1_10 {
    public static void main(String[] args) {
        int area;
        int baseMaior;
        int baseMenor;
        int altura;

        Scanner scan = new Scanner( System.in );
        System.out.printf( "Digite o valor da base maior: " );
        baseMaior = Integer.parseInt( scan.nextLine() );

        System.out.printf( "Digite o valor da base menor: " );
        baseMenor = Integer.parseInt( scan.nextLine() );

        System.out.printf( "Digite o valor da altura: " );
        altura = Integer.parseInt( scan.nextLine() );

        area = (( baseMaior + baseMenor ) * altura ) / 2;
        System.out.printf( "O valor da área é: %d unidades de área.\n", area );

        scan.close();

    }
}
