public class Finca{
    String vereda;
    String NombreParcela;
    String nombrePersona;
    String cultivo;
    int hectareas; 
    int cargas;
    boolean abono;
    int lluvia;
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
    public void simularLluvia(int mmPorDia) {
    if (lluvia >= 100) {
        System.out.println("Ya hay suficiente lluvia: " + lluvia + " mm.");
        return;
    }

    int dias = 0;
    int lluviaTotal = lluvia;
    while (lluviaTotal < 100) {
        lluviaTotal += mmPorDia;
        dias++;
    }
    lluvia = lluviaTotal;
    System.out.println("Lluvia simulada por " + dias + " días hasta alcanzar " + lluvia + " mm.");
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

    public void aumentarCargas(int adicionales) {
        cargas += adicionales;
    }

    public double produccionPorHectarea() {
        if (hectareas == 0) return 0;
        return (double) cargas / hectareas;
    }

    public boolean hayExcesoLluvia() {
        return lluvia > 100;
    }
}