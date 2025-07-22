public class Finca {
    private String vereda;
    private String NombreParcela;
    private String nombrePersona;
    private String cultivo;
    private int hectareas;
    private int cargas;
    private boolean abono;
    private int lluvia;

    public Finca(String vereda, String NombreParcela, String nombrePersona,
                 String cultivo, int hectareas, int cargas, boolean abono, int lluvia) {
        this.vereda = vereda;
        this.NombreParcela = NombreParcela;
        this.nombrePersona = nombrePersona;
        this.cultivo = cultivo;
        this.hectareas = hectareas;
        this.cargas = cargas;
        this.abono = abono;
        this.lluvia = lluvia;
    }

    public boolean requiereAbono() {
        if (!abono) {
            System.out.println("La parcela " + NombreParcela + " necesita abono.");
            return true;
        }
        return false;
    }

    public void clasificarLluvia() {
        System.out.println("Lluvia registrada: " + lluvia + " mm");
        if (lluvia < 30) {
            System.out.println("Clasificación: Lluvia ligera");
        } else if (lluvia < 70) {
            System.out.println("Clasificación: Lluvia moderada");
        } else {
            System.out.println("Clasificación: Lluvia fuerte");
        }
    }

    public boolean esLluviaFuerte() {
        return lluvia >= 70;
    }

    public void setLluvia(int nuevaLluvia) {
        this.lluvia = nuevaLluvia;
    }

    public int getLluvia() {
        return lluvia;
    }

    public String getNombreParcela() {
        return NombreParcela;
    }

    public void mostrarHectareasDetalle() {
        System.out.println("Detalle de hectáreas cultivadas en " + NombreParcela + ":");
        for (int i = 1; i <= hectareas; i++) {
            System.out.println(" - Hectárea " + i + " cultivada con " + cultivo);
        }
    }

    public void mostrarInformacion() {
        System.out.println("Vereda: " + vereda);
        System.out.println("Parcela: " + NombreParcela);
        System.out.println("Propietario: " + nombrePersona);
        System.out.println("Cultivo: " + cultivo);
        System.out.println("Hectáreas: " + hectareas);
        System.out.println("Cargas: " + cargas);
        System.out.println("¿Abonada?: " + abono);
        System.out.println("Lluvia: " + lluvia + " mm");
        System.out.println();
    }

    public void aplicarAbono() {
        abono = true;
        System.out.println("Se aplicó abono a la parcela " + NombreParcela);
    }
}
