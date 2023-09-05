package LabEx2;
import java.util.Scanner;



public class App {
    public static void main(String[] args){
    String tensao = "127v";
    String modelo = "LED";
    boolean estadoLampada = false;
    Lampada lampada = new Lampada(tensao,modelo,estadoLampada);
    int op=0;

   
    Scanner scanner = new Scanner(System.in);
    do{
    System.out.println("------------APAGADOR--------\n");
    System.out.println("1)Acender\n");
    System.out.println("2)Apagar\n");
    System.out.println("3)Ver estado da Lâmpada\n");
    System.out.println("4)Sair do programa");
    op = scanner.nextInt();
        switch (op){
            case 1:{
            lampada.acenderLampada();
            break;
            }
            case 2:{
            lampada.apagarLampada();
            break;
            }
             case 3:{
            lampada.mostrarEstadoLampada();
            break;
            }
        }
    } while (op!=4);
    scanner.close();
}
}
