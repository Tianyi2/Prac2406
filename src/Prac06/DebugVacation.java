package Prac06;

public class DebugVacation
{
    private final int days;
    public DebugVacation()
    {
        days = 10;
    }
    public int getDays()
    {
        return days;
    }

    public static void main(String[] args){
        DebugVacation vacation = new DebugVacation();
        int days = vacation.getDays();
        System.out.println(days);
    }
}