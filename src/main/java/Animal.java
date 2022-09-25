public class Animal {
    private String especie;
    private String nombre;
    private boolean esMacho;
    private int edad;
    private boolean estaDurmiendo;

    public Animal(String especie, String nombre,boolean esMacho, int edad) {
        this.especie = especie;
        this.nombre = nombre;
        this.esMacho = esMacho;
        this.edad = edad;
    }

    public void cumplirAños(){
        this.edad++;
    }
    public boolean estaDespierto() {
        return estaDurmiendo;
    }
    public void dormir(){
        this.estaDurmiendo = true;
    }
    public void despertar(){
        this.estaDurmiendo = false;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", nombre='" + nombre + '\'' +
                ", esMacho=" + esMacho +
                ", edad=" + edad +
                ", estaDurmiendo=" + estaDurmiendo +
                '}';
    }
}