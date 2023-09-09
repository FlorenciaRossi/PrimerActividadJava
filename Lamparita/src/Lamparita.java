public class Lamparita {

    private boolean estado;

    public Lamparita() {
        this.estado = false;
    }
    public void encender(){
        this.estado = true;
    }
    public void apagar(){
        this.estado = false;
    }
    public boolean estaEncendida(){
        return estado;
    }

    public static void main(String[] args) throws Exception {
        
        System.out.println("Vamos a programar una lamparita! ");

        Lamparita lampara1 = new Lamparita();

        System.out.println("La lámpara está encendida: " + lampara1.estaEncendida());

        lampara1.encender();

        System.out.println("La lámpara está encendida: " + lampara1.estaEncendida());

        lampara1.apagar();

        System.out.println("La lámpara está encendida: " + lampara1.estaEncendida());
    }
}


