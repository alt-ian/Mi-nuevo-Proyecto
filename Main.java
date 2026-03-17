
import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public void fechaHora() {
        LocalDateTime ahora = LocalDateTime.now();
        System.out.println("Fecha y hora actuales: " + ahora);
    }
}