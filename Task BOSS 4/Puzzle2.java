public class Puzzle {
    public static void main(String[] args) {
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("If you need the hint, enter \"Подсказка\"");

        String textCorrectAnswer = "Заархивированный вирус";
        String queryHint = "Подсказка";

        String textHint = "It's not onion! Enter you answer: ";
        String textWrongAnswer = "No.. Mb on another time";
        String textNoMoreHint = "You don't have the hint. Enter your answer";
        String textTryAgain = "No.. Try again! Attempts left: ";
        String textCongratulations = "Win!!";

        Scanner scan = new Scanner(System.in);

        int attempts = 3;

        for (int attempt = 1; attempt <= attempts; attempt++) {
            String line = scan.nextLine();

            if (line.equals(queryHint)) {
                // Подсказка доступна только на первой попытке
                if (attempt == 1) {
                    System.out.println(textHint);
                } else {
                    System.out.println(textNoMoreHint);
                }
            }

            if (line.equals(textCorrectAnswer)) {
                System.out.println(textCongratulations);
                break;
            }

            // последняя попытка
            if (attempt == attempts) {
                System.out.println(textWrongAnswer);
            } else {
                System.out.println(textTryAgain + (attempts - attempt));
            }
        }
    }
