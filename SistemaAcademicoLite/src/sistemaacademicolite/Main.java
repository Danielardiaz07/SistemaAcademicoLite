package sistemaacademicolite;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    static void registrarAsignatura() {
        System.out.println("=== Registrar Asignatura ===");

        System.out.print("Ingrese el código: ");
        String codigo = scanner.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese los créditos: ");
        int creditos = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el docente: ");
        String docente = scanner.nextLine();

        Asignatura asignatura = new Asignatura(codigo, nombre, creditos, docente);
        listaAsignaturas.add(asignatura);

        System.out.println("\n✅ Asignatura registrada exitosamente.");
        System.out.println(asignatura);
    }
    
}
