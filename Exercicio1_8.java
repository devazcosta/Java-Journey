import java.util.Scanner;

public class Exercicio1_8 {
    
    public static void main( String[] args ){
        
        int perimetro;
        int area;
        int altura;
        int largura;

        /* 
        Queremos receber os valores da largura e da altura de um
        retângulo em uma unidade arbitrária. Em seguida, 
        calcularemos os valores da área e perímetro desse retângulo.
        */
        
        Scanner scan = new Scanner( System.in );
        System.out.printf( "Digite o valor da largura: " );
        largura = Integer.parseInt( scan.nextLine() );

        System.out.printf( "Digite o valor da altura: " );
        altura = Integer.parseInt( scan.nextLine() );

        perimetro = (2 * largura) + (2 * altura);
        area = largura * altura;

        System.out.printf( "O perímetro do retângulo é: %d unidades de medida.\n", perimetro );
        System.out.printf( "A área do retângulo é: %d unidades de medida.\n", area );

        scan.close();

    }
}
