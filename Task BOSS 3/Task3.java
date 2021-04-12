import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of strings
        System.out.print("Количество строк: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Невалидные входные данные.");
            return;
        }

        // Arrays of lines
        String[] lines = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            lines[i] = scanner.next();
        }

        // Index of the line with the maximum number of unique letters
        int maxIndex = 0;

        // Number of the unique chars in this line
        int maxCharsCount = 0;

        for (int i = 0; i < lines.length; i++) {
            int charsCount = 0; // number of the unique charsCount in the lines[i]

            for (int j = 0; j < lines[i].length(); j++) {
                char c = lines[j].charAt(j);
                boolean isUnique = true; // whether we found char or not

                for (int k = 0; k < lines[i].length(); k++) {
                    if (k == j) {
                        continue;
                    }

                    if (c == lines[i].charAt(k)) {
                        isUnique = false;
                        break;
                    }
                }

                // We didn't find current character, increment number of unique characters
                if (isUnique) {
                    charsCount++;
                }
            }

            if (charsCount > maxCharsCount) {
                maxCharsCount = charsCount;
                maxIndex = i;
            }
        }

        System.out.println("Ответ: " + lines[maxIndex]);
    }
}
