public class PrincipalFincas {

    public static void main(String[] args) {
        Finca finca1 = new Finca("Vereda La Vega", "Parcela Norte", "Ana García", "Café", 5, 30, false, 80);
        Finca finca2 = new Finca("Vereda El Roble", "Parcela Sur", "Luis Torres", "Cacao", 4, 25, false, 50);
        Finca finca3 = new Finca("Vereda San Juan", "Parcela Central", "Marta Ríos", "Plátano", 6, 40, false, 60); 

        finca2.requiereAbono();
        finca1.requiereAbono(); 
        finca3.requiereAbono();         
        finca3.simularLluvia(2);
        finca3.simularLluvia(5);         
        finca1.mostrarHectareasDetalle();
        finca3.aumentarCargas(10);
        finca3.aplicarAbono(); 
        

        System.out.println("Producción/ha finca 1: " + finca1.produccionPorHectarea());
        System.out.println("Producción/ha finca 3: " + finca3.produccionPorHectarea());
    }     
}       