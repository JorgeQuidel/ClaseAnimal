public class Main {
    public static void main(String[] args) {
        Animal canela = new Animal("perro", "canela",false,1);
        System.out.println(canela.toString());
        canela.cumplirAños();
        canela.despertar();
        System.out.println(canela.toString());
        canela.dormir();
        System.out.println(canela.toString());
    }
}