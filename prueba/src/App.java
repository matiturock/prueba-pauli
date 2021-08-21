public class App {
    public static void main(String[] args) {
        String nombre = "Pauli";
        int edad = 30;
        float salario = 70_000f;
        boolean carnet = true;

        System.out.println(
                String.format("Nombre: %s - Edad: %d - Salario: %.2f - Carnet: %b\n", nombre, edad, salario, carnet));
    }
}
