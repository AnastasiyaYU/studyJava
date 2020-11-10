public class Day1 {
    public static void main(String[] args) {

        System.out.println("Задача 1:");
        int value = 0;
        while (value < 10) {
            System.out.print("Java ");
            value = value + 1;
        }
        System.out.println(" ");
        System.out.println("Задача 2:");
        for (int i = 0; i < 10; i++){
            System.out.println("Java ");
        }

        System.out.println("Задача 3:");
        int year = 1980;
        while (year <= 2020) {
            System.out.println("Олимпиада " + year + " года");
            year = year + 4;
        }

        System.out.println("Задача 4:");
        for (int year4 = 1980; year4 <= 2020; year4 = year4 + 4) {
            System.out.println("Олимпиада " + year4 + " года");
        }

        System.out.println("Задача 5:");
        int k = 5;
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " * " + k + " = " + k*i);
        }
    }
}
