
package carreramortal;

public class CarreraMortal {

    public static void main(String[] args) {
         Auto auto = new Auto("Rojo", "MCG199");
        System.out.println("Auto creado: Color " + auto.getColor() + ", Patente " + auto.getPatente());

        auto.inflarRuedas();
        System.out.println("Ruedas infladas.");

        auto.avanzar(30);
        auto.retroceder(20);
        auto.llenarTanque();
        auto.desinflarRuedas();
        System.out.println("Ruedas desinfladas.");
    }
    
}
