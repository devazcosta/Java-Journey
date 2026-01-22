import java.util.Scanner;

public class Exercicio1_9 {
    public static void main(String[] args) {
        int area;
        int base;
        int altura;

        /* 
        Queremos receber os valores da base e da altura de um
        triângulo em uma unidade arbitrária. Em seguida, 
        calcularemos o valor da área desse triângulo.
        */

        Scanner scan = new Scanner( System.in );
        System.out.printf( "Digite o valor da base: " );
        base = Integer.parseInt( scan.nextLine() );

        System.out.printf( "Digite o valor da altura: " );
        altura = Integer.parseInt( scan.nextLine() );

        area = ( base * altura ) / 2;
        System.out.printf( "Valor da área = %d unidades de medida.\n", area );

        scan.close();

    }

}
