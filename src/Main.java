public class Main {
    public static void main(String[] args) {
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
       int[] ints = generateRandomArray();
       int sum = 0;
        for (int salary : ints) {
            sum += salary;
        }
        System.out.println("Зарплата " + sum);
    }
}


