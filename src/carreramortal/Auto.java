
package carreramortal;


public class Auto {
    private String color;
    private String patente;
    private double combustible;
    private Rueda[] ruedas;

    public Auto(String color, String patente) {
        this.color = color;
        this.patente = patente;
        this.combustible = 50.0;
        this.ruedas = new Rueda[4];
        for (int i = 0; i < 4; i++) {
            this.ruedas[i] = new Rueda("Rueda " + (i + 1));
        }
    }

    public void avanzar(int metros) {
        double consumo = metros / 10.0;
        if (this.combustible >= consumo) {
            this.combustible -= consumo;
            System.out.println("Avanzando " + metros + " metros.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar.");
        }
    }

    public void retroceder(int metros) {
        double consumo = metros / 10.0;
        if (this.combustible >= consumo) {
            this.combustible -= consumo;
            System.out.println("Retrocediendo " + metros + " metros.");
        } else {
            System.out.println("No hay suficiente combustible para retroceder.");
        }
        
    }public void llenarTanque() {
        this.combustible = 50.0;
        System.out.println("Tanque llenado con 50 litros de combustible.");
    }

    public void inflarRuedas() {
        for (Rueda rueda : ruedas) {
            rueda.inflar();
        }
    }

    public void desinflarRuedas() {
        for (Rueda rueda : ruedas) {
            rueda.desinflar();
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }
}
