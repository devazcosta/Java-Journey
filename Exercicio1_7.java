import java.util.Scanner;

public class Exercicio1_7 {

    public static void main(String[] args) {
        int lado;
        int perimetro;
        int area;

        /* 
        Queremos receber o valor da área de um quadrado 
        e calcular seu perímetro e sua área. 
        */

        Scanner scan = new Scanner( System.in );
        System.out.printf( "Digite o valor do lado: " );
        lado = Integer.parseInt( scan.nextLine() );

        perimetro = 4 * lado;
        area = lado * lado;

        System.out.printf( "O valor do perímetro é: %d\n", perimetro );
        System.out.printf( "O valor da área do quadrado é: %d\n", area );

        scan.close();

    }
    
}
