import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a idade em anos:");
            int anos = scanner.nextInt();

            System.out.println("Digite a idade em meses:");
            int meses = scanner.nextInt();

            System.out.println("Digite a idade em dias:");
            int dias = scanner.nextInt();

            int idadeEmDias = calcularIdadeEmDias(anos, meses, dias);

            System.out.println("A idade em dias é: " + idadeEmDias);
        }
    }

    public static int calcularIdadeEmDias(int anos, int meses, int dias) {
        int totalDias = anos * 365 + meses * 30 + dias;
        return totalDias;
    }
}
    