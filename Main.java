
import java.time.LocalDateTime;
import java.util.Scanner;


public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Usuario u = new Usuario();
        System.out.println("Hello world!");
        System.out.print("Introduce la cantidad de usuarios: ");
        int cantidad = Integer.parseInt(sc.nextLine().trim());

        Usuario[] usuarios = u.crearUsuarios(cantidad);

        System.out.println("\n--- Lista de usuarios ---");
        for (int i = 0; i < usuarios.length; i++) {
            System.out.println(usuarios[i]);
        }

    }

    public void fechaHora() {
        LocalDateTime ahora = LocalDateTime.now();
        System.out.println("Fecha y hora actuales: " + ahora);
    }
    
}