package LabEx1;
public class Triangulo {

    private float ladoA, ladoB, ladoC, subtração;
    static public int contInstancia=0; 
    public Triangulo(){
        ladoA =1;
        ladoB =1;
        ladoC =1;
        contInstancia++;
    }


    public Triangulo(float ladoA, float ladoB, float ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        contInstancia ++;

    }

    public float getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public float getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public float getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }


    public float moduloSubtração(float a, float b){
        if(a-b>=0){
            subtração = (a-b);
        }else if(a-b<0){
            subtração = (a-b)*(-1);
        }    
        return subtração;
    }

     public  boolean verificaTriangulo(float a, float b, float c){
        if (moduloSubtração(b, c) < a && a< b+c && moduloSubtração(a, c) < b && b < a+c 
        && moduloSubtração(a, b) < c && c < a+b){
            System.out.println("É um triângulo");
            return true;
        }else{
            System.out.println("Não é um triangulo");
            return false;
        }
    }

     public void tipoDeTriangulo(float a, float b, float c){
        if ((a==b && a != c) || (a==c && a!=b) || (b==c && b!=a)){
            System.out.println("O triangulo é Isosceles!\n");
        } else if (a==b && a==c)
        {
            System.out.println("O triangulo é Equilátero");
    }else{
        System.out.println("O triangulo é Escaleno");
    }



}
}
