public class TermoPro {

    private String modelo;
    private double temperatura, humedad;

    public TermoPro(String modelo, double temperatura){


        this.humedad = 76;
        this.modelo = modelo;
        this.temperatura = temperatura;

    }

    public void saludo(){

        System.out.println("Esta es la humedad: "+humedad+"Esta es el modelo: "+modelo+" Esta es la temperatura: "+temperatura);
    }


    public double getHumedad() {
        return humedad;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
