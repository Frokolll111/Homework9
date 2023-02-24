public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1 () {
        int[] arr = generateRandomArray();
        System.out.println("Задача 1");
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println("Сумма трат за месяц составила "+ sum + " рублей");
    }

    public static void task2 () {
        int[] arr = generateRandomArray();
        System.out.println("Задача 2");
        int maxWaste = 0;
        int minWaste = arr[0];
        for (int j : arr) {
            if (j > maxWaste) {
                maxWaste = j;
            }
        }
        for (int j : arr) {
            if (j < minWaste) {
                minWaste = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+ minWaste +" рублей. Максимальная сумма трат за день составила "+maxWaste+" рублей");
    }
    public static void task3 () {
        int[] arr = generateRandomArray();
        System.out.println("Задача 3");
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        System.out.print("Средняя сумма трат за месяц составила "+ sum / arr.length + "  рублей");
        System.out.println();
    }
    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i>=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}