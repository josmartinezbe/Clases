import java.util.Scanner;

public class PrincipalFincas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Finca finca1 = new Finca("Vereda La Vega", "Parcela Norte", "Ana García", "Café", 5, 30, false, 80);
        Finca finca2 = new Finca("Vereda El Roble", "Parcela Sur", "Luis Torres", "Cacao", 4, 25, false, 50);
        Finca finca3 = new Finca("Vereda San Juan", "Parcela Central", "Marta Ríos", "Plátano", 6, 40, false, 90);

        finca2.requiereAbono();
        finca1.requiereAbono();
        finca3.requiereAbono();

        finca1.clasificarLluvia();
        finca2.clasificarLluvia();
        finca3.clasificarLluvia();

        finca1.mostrarHectareasDetalle();

        while (finca3.esLluviaFuerte()) {
            System.out.println("No se puede aplicar abono a " + finca3.getNombreParcela() + " porque la lluvia es fuerte (" + finca3.getLluvia() + " mm).");
            System.out.print("Ingrese un nuevo valor de lluvia (mm): ");
            int nuevaLluvia = scanner.nextInt();
            finca3.setLluvia(nuevaLluvia);
            finca3.clasificarLluvia();
        }

        finca3.aplicarAbono();

        scanner.close();
    }
}
