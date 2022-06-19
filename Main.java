public class Main {
    public static void main(String[] args) {
        int initialAccount = 300;
        int payment = 1200;
        int bonus = 0;
        int account = 0;
        if (payment > 1000) {
            bonus = payment / 100;
            account = initialAccount + payment + bonus;
        } else {
            account = initialAccount + payment;
        }
        System.out.println("Сумма бонуса " + bonus);
        System.out.println("Сумма на счете " + account);

    }
}
