package ar.edu.utn.dds.auto;

public class Auto {
    //tanque
    private boolean encendido;     //encendido
    private double temperatura =0;
    //temperatura
    //kmsRecorridos

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }


}
