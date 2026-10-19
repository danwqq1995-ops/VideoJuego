import javax.swing.plaf.synth.SynthOptionPaneUI;

void main() {

    videojuego v1 = new videojuego();
    videojuego v2 = new videojuego();
    videojuego v3 = new videojuego();

    v1.nombre = "Minecraft";
    v1.genero = "SandBox";
    v1.version = "1.12.2";
    v1.activo = true;

    v2.nombre = "Valorant";
    v2.genero = "Competitivo";
    v2.version = "13.06";
    v2.activo = false;

    v3.nombre = "OSU!";
    v3.genero = "ritmico";
    v3.version = "2026.1005.0";
    v3.activo = true;

    System.out.println("---VideoJuego 1---");
    v1.mostrarInformacion();
    System.out.println("---VideoJuego 2---");
    v2.mostrarInformacion();
    System.out.println("---VideoJuego 3---");
    v3.mostrarInformacion();

    System.out.println("--INICIADOS--");
    v1.iniciar();
    v2.iniciar();

    System.out.println("---VideoJuego 1---");
    v1.mostrarInformacion();
    System.out.println("---VideoJuego 2---");
    v2.mostrarInformacion();
    System.out.println("---VideoJuego 3---");
    v3.mostrarInformacion();

    System.out.println("--CERRADOS--");
    v1.cerrar();

    System.out.println("--MostrarVersion---");
    v1.mostrarVersion();
    v2.mostrarVersion();
    v3.mostrarVersion();


}
