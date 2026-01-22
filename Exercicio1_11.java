import java.util.Scanner;

public class Exercicio1_11 {
    public static void main(String[] args) {
        int area;
        int diagonalMaior;
        int diagonalMenor;

        Scanner scan = new Scanner( System.in );
        System.out.printf( "Digite o valor da diagonal maior: " );
        diagonalMaior = Integer.parseInt( scan.nextLine() );

        System.out.printf( "Digite o valor da diagonal menor: " );
        diagonalMenor = Integer.parseInt( scan.nextLine() );

        area = (diagonalMaior * diagonalMenor) / 2;
        System.out.printf( "O valor da área é: %d unidades de área.\n24", area );

        scan.close();
    }
}
