import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie rozmiaru tablicy
        System.out.print("Podaj rozmiar tablicy: ");
        int n = scanner.nextInt();

        // Utworzenie tablicy
        int[] tablica = new int[n];

        // Wczytanie liczb do tablicy
        System.out.println("Wprowadź " + n + " liczb:");
        for (int i = 0; i < n; i++) {
            System.out.print("Liczba " + (i + 1) + ": ");
            tablica[i] = scanner.nextInt();
        }

        // Sortowanie przez wybór
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Indeks najmniejszego elementu
            for (int j = i + 1; j < n; j++) {
                if (tablica[j] < tablica[minIndex]) {
                    minIndex = j; // Znalezienie indeksu mniejszego elementu
                }
            }
            // Zamiana elementów
            int temp = tablica[minIndex];
            tablica[minIndex] = tablica[i];
            tablica[i] = temp;
        }

        // Wyświetlenie posortowanej tablicy
        System.out.print("Posortowana tablica: ");
        for (int liczba : tablica) {
            System.out.print(liczba + " ");
        }

        scanner.close();
    }
}