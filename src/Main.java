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
        int salary = 100000;
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
        sum = sum + arr [i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2 () {
        int[] arr = generateRandomArray();
        int maxPayment = arr [0];
        int minPayment = arr [0];
        for (final int current : arr) {
            if (current > maxPayment) {
                maxPayment = current;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr [i] < minPayment) {
                minPayment = arr [i];
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + minPayment + " рублей." +
                " Максимальная сумма трат за день составила " + maxPayment + " рублей");
    }

    public static void task3 () {
        int[] arr = generateRandomArray();
        int salary = 100000;
        int sum = 0;
        int month = 30;
        double mediumSum = 0d;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr [i];
            mediumSum = sum / month;
        }
        System.out.println("Средняя сумма трат за месяц составила " + mediumSum + " рублей");
    }
    public static void task4 () {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}