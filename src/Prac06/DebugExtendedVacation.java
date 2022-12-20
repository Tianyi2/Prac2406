package Prac06;

public class DebugExtendedVacation extends DebugVacation {
    int days;

    public DebugExtendedVacation() {
        this.days = 30;
    }

    public static void main(String[] args) {
        DebugExtendedVacation vacation = new DebugExtendedVacation();
        System.out.println(vacation.days);
    }
}
