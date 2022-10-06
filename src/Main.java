public class Main {
    public static void main(String[] args) {
        int balance = 800;
        int add = 1130;
        if (add >= 1000) {
            balance = balance + add + (add / 100);
            System.out.println("Итоговый счёт: " + balance);
            System.out.println("Бонусные баллы: " + add / 100);
        } else {
            balance = balance + add;
            System.out.println("Итоговый счёт: " + balance);
        }

    }
}