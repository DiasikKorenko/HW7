import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Пункт 1.
        System.out.println("Пункт 1");
        CreditCard creditCard = new CreditCard(1021845, 100);
        System.out.println("Текущий счет без изменений:");
        creditCard.printInfo();
        System.out.println("Текущий счет после начисления:");
        creditCard.accrual_sum(5);
        creditCard.printInfo();
        System.out.println("Текущий счет после списания:");
        creditCard.withdraw_sum(7);
        creditCard.printInfo();
// Пункт 2.
        System.out.println();
        System.out.println("Пункт 2");
        CreditCard creditCard_1 = new CreditCard(1021845, 100);
        CreditCard creditCard_2 = new CreditCard(1021889, 100);
        CreditCard creditCard_3 = new CreditCard(1021823, 100);
        System.out.println("Текущий счет после начисления на карту1:");
        creditCard_1.accrual_sum(5);
        creditCard_1.printInfo();
        System.out.println("Текущий счет после начисления на карту2:");
        creditCard_2.accrual_sum(255);
        creditCard_2.printInfo();

        System.out.println("Текущий счет после снятия на карту3:");
        creditCard_3.withdraw_sum(55);
        creditCard_3.printInfo();


    }
}