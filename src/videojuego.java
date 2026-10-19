public class videojuego {

    public String nombre;
    public String genero;
    String version;
    boolean activo;

    public void mostrarInformacion(){
        System.out.println("Nombre de videojuego: " + nombre);
        System.out.println("Genero: " + genero);
        System.out.println("Version: " + version);
        System.out.println("Activo: " + activo);
    }

    public void iniciar(){
        activo = true;
        System.out.println("Se ha iniciado:" + nombre);

    }

    void cerrar (){
        activo = false;
        System.out.println("Se ha cerrado: " + nombre);
    }

    void mostrarVersion(){
        System.out.println("La version de: " + nombre + ": " + version);
    }



}
