import java.util.Scanner;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Ввід даних
        System.out.print("Введіть ціле число: ");
        int integerNum = sc.nextInt();

        System.out.print("Введіть число з плаваючою точкою: ");
        double floatNum = sc.nextDouble();

        sc.nextLine(); // очищення буфера після nextDouble
        System.out.print("Введіть рядок: ");
        String strVal = sc.nextLine();

        System.out.print("Введіть логічне значення (true/false): ");
        boolean boolVal = sc.nextBoolean();

        System.out.println("\n=== Форматований вивід даних ===");

        // --- 1. Звичайний вивід (конкатенація)
        System.out.println("1. Конкатенація: int = " + integerNum + ", float = " + floatNum + ", str = " + strVal + ", bool = " + boolVal);

        // --- 2. printf з різними форматами
        System.out.printf("2. printf: int = %d, float = %.2f, str = %s, bool = %b%n", integerNum, floatNum, strVal, boolVal);

        // --- 3. Шістнадцяткова та вісімкова системи
        System.out.printf("3. int у різних системах: десяткова = %d, вісімкова = %o, шістнадцяткова = %x%n", integerNum, integerNum, integerNum);

        // --- 4. Вирівнювання та ширина поля
        System.out.printf("4. Вирівнювання: |%-10s| |%10s|%n", strVal, strVal);

        // --- 5. Форматування з фіксованою шириною та точністю
        System.out.printf("5. Float з точністю: %.3f, %.1e (експоненційно)%n", floatNum, floatNum);

        // --- 6. Використання String.format()
        String formatted = String.format("6. String.format(): int=%d, float=%.2f, str='%s', bool=%b", integerNum, floatNum, strVal, boolVal);
        System.out.println(formatted);

        // --- 7. Використання вирівнювання по центру (через форматування)
        System.out.printf("7. Центрований рядок (умовно): |%15s|%n", strVal);

        // --- 8. Форматування з заповненням нулями
        System.out.printf("8. Заповнення нулями: int = %05d, float = %08.2f%n", integerNum, floatNum);

        // --- 9. Форматування булевого значення
        System.out.printf("9. Bool як рядок: %-10b | Інверсія: %-10b%n", boolVal, !boolVal);

        // --- 10. Комбінований приклад
        System.out.printf("10. Комбінований вивід:%n%-10s | %5d | %08.3f | %-6b%n", strVal, integerNum, floatNum, boolVal);

        sc.close();
    }

