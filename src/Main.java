public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Задача 2");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Задача №3");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Задча №4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Задача №5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println("Год високосный " + i);
        }
        System.out.println("Задача №6");
        for (int i = 7; i <= 98; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Задача №7");
        for(int i = 1; i<=512;i=i*2){
            System.out.println(i);
        }
        System.out.println("задача №8");
        int deposit = 29000;
        int total = 0;
        for(int i = 1;i <= 12;i++){
            total = total+deposit;
            System.out.println("месяц "+i +" сумма накоплений равна "+ total);
        }
        System.out.println("задача №9");
        int deposit2 = 29000;
        int total2 = 0;
        for(int i = 1;i <= 12;i++){
            total2 = total2+total2/100;
            total2 = total2+deposit2;
            System.out.println("месяц "+i +" сумма накоплений равна "+ total2);
        }
    }
}