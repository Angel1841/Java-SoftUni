import javax.persistence.Persistence;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Persistence.createEntityManagerFactory("soft_uni")
                .createEntityManager();
    }
}
