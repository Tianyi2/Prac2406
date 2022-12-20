package Prac06;

public class RaceHorse extends Horse{
    private int numberRace;
    public RaceHorse(String name, String color, int birthYear, int numberRace){
        super(name, color, birthYear);
        setNumberRace(numberRace);
    }

    public void setNumberRace(int numberRace){
        this.numberRace = numberRace;
    }
    public int getNumberRace(){
        return this.numberRace;
    }
}
