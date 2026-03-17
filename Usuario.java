import java.util.Scanner;

public class Usuario {
    public String nombre;
    public String apellidos;
    public String email;

    public Usuario() {
        
    }

    public Usuario(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    public String toString() {
        String usu = "Nombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nEmail: " + this.email;
        return usu;
    }

    public Usuario[] crearUsuarios(int numero) {
        Usuario[] usuarios = new Usuario[numero];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numero; i++) {
            System.out.println("Introduce los datos del usuario " + (i + 1));
                
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
                
            System.out.print("Apellidos: ");
            String apellidos = sc.nextLine();
                
            System.out.print("Email: ");
            String email = sc.nextLine();

            usuarios[i] = new Usuario(nombre, apellidos, email);
        }
        return usuarios;
    }
}