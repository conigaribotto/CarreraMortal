
package carreramortal;


public class Rueda {
    private String marca;
    private double presion;

    public Rueda(String marca) {
        this.marca = marca;
        this.presion = 28.0;
    }

    public void inflar() {
        this.presion = 28.0;
    }

    public void pinchar() {
        this.presion = 0.0;
    }

    public void desinflar() {
        if (this.presion >= 0.5) {
            this.presion -= 0.5;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }
    
}
