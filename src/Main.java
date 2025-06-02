import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");
        int[] spends = new int[5];
        int sum = 0;
        spends[0] = 1500;
        spends[1] = 2300;
        spends[2] = 1800;
        spends[3] = 1700;
        spends[4] = 3100;
        System.out.println(Arrays.toString(spends));

        for (int i =0; i < spends.length; i++) {
            sum += spends[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum);
        System.out.println();

        //Task 2
        System.out.println("Task 2 с помощью метода Arrays.sort");

        Arrays.sort(spends);
        System.out.println(Arrays.toString(spends));
        System.out.println("Минимальная сумма трат за месяц составила " + spends[0] + " рублей.");
        System.out.println("Максимальная сумма трат за месяц составила " + spends[spends.length -1] + " рублей.");

        System.out.println("Task 2 с помощью циклов");
        int maxSpend = 0;
        int minSpend = 500_000;
        for (int i = 0; i < spends.length; i++) {
            if (spends[i]>maxSpend){
                maxSpend=spends[i];
            }
            if (spends[i] < minSpend){
                minSpend = spends[i];
            }
        }
        System.out.println("Максимальная сумма трат за месяц составила " + maxSpend + " рублей.");
        System.out.println("Минимальная сумма трат за месяц составила " + minSpend + " рублей.");

        System.out.println();

        //Task 3
        System.out.println("Task 3");

        double [] spends1 = {1700,2500,1650,3700,2770};
        double sum1 = 0;
        double averageCosts = 0;
        for (int i = 0; i < spends1.length; i++) {
            sum1 += spends1[i];
            averageCosts = sum1 / spends1.length;
        }
        System.out.println("Общая сумма трат за месяц составила " + sum1 + " рублей.");
        System.out.println("Средняя сумма трат за месяц составила " + averageCosts + " рублей.");

        System.out.println();

        //Task 4
        System.out.println("Task 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1 ; i>=0 ; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}