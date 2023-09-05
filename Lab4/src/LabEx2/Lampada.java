package LabEx2;
public class Lampada {
    //Construtores
    public Lampada(String tensao, String modelo, boolean estadoLampada) {
        this.tensao = tensao;
        this.modelo = modelo;
        this.estadoLampada = estadoLampada;
        contInstancia ++;
    }
    public Lampada(){
        contInstancia++;
    }
    //Atributos
    private int contInstancia=0;
    private String tensao;
    private String modelo;
    private boolean estadoLampada = false;

    //getters and setters
    public String getTensao() {
        return tensao;
    }
    public void setTensao(String tensao) {
        this.tensao = tensao;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public boolean isEstadoLampada() {
        return estadoLampada;
    }
    public void setEstadoLampada(boolean estadoLampada) {
        this.estadoLampada = estadoLampada;
    }
    //Outros métodos
    void acenderLampada(){
        if(estadoLampada == true){
            System.out.println("A lampada já está acesa!\n");
        }else{
        this.estadoLampada = true;
        System.out.println("LÂMPADA ACESA!\n");
        }
    }

    void apagarLampada(){
        if (estadoLampada == false){
            System.out.println("A lâmpada já está apagada!\n");
        }else{
        this.estadoLampada = false;
        System.out.println("LÂMPADA APAGADA!\n");
        }
    }

    void mostrarEstadoLampada(){
        if (estadoLampada == true){
            System.out.println("A lâmpada está acesa!\n");
            return;
        }else {
            System.out.println("A lâmpada está apagada!\n");
            return;
        }
    }
}
