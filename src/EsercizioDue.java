import java.util.Scanner;

public class EsercizioDue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserire prima parola");
        String prima = scanner.nextLine();
        System.out.println("inserire seconda parola");
        String seconda = scanner.nextLine();
        System.out.println("inserire terza parola");
        String terza = scanner.nextLine();
        System.out.println(prima +" "+ seconda +" "+terza);
        System.out.println(terza +" "+ seconda +" "+prima);
    }
}
