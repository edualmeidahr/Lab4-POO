package LabEx1;
import java.util.Scanner;


public class App {
    public static void main(String[] args){
        float ladoA,ladoB,ladoC;
        
        Triangulo trianguloInicial = new Triangulo();
        Scanner scanner = new Scanner(System.in);
     
        System.out.format("Valor do lado 1:\n");
        ladoA = scanner.nextFloat();
        System.out.format("Valor do lado 2:\n");
        ladoB = scanner.nextFloat(); 
        System.out.format("Valor do lado 3:\n");
        ladoC = scanner.nextFloat();  

        
        if(trianguloInicial.verificaTriangulo(ladoA, ladoB, ladoC)){
        Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);
        triangulo.tipoDeTriangulo(ladoA, ladoB, ladoC);
    }
        scanner.close();
        System.out.format("\n%d Instâncias\n", Triangulo.contInstancia);

    }
}
