package Prac06;

public class DebugVacation
{
    int days;
    public DebugVacation()
    {
        this.days = 10;
    }
    public int getDays()
    {
        return this.days;
    }

    public static void main(String[] args){
        DebugVacation vacation = new DebugVacation();
        int days = vacation.getDays();
        System.out.println(days);
    }
}