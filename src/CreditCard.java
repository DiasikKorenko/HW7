import java.util.Scanner;

public class CreditCard {
    int account_number;
    int current_sum;
    int sum_acc;
    int sum_with;
    public CreditCard(int account_number, int current_sum) {
        this.account_number = account_number;
        this.current_sum = current_sum;
    }
    public void accrual_sum(int sum_acc) {
        current_sum += sum_acc;
    }
    public void withdraw_sum(int sum_with) {
        current_sum -= sum_with;
    }
    public void printInfo() {
        System.out.println("Номер счета: №" + account_number + " Текущая сумма:" + current_sum);
    }
}
