package Prac06;

public class DemoHorses {
    public static void main(String[] args) {
        Horse normalHorse = new Horse("Tom", "red", 2020);
        String normalHorseName = normalHorse.getName();
        String normalHorseColor = normalHorse.getColor();
        int normalHorseBirthYear = normalHorse.getBirthYear();

        RaceHorse raceHorse = new RaceHorse("Jerry", "black", 2019, 10);
        String raceHorseName = raceHorse.getName();
        String raceHorseColor = raceHorse.getColor();
        int raceHorseBirthYear = raceHorse.getBirthYear();
        int raceHorseNumberRace = raceHorse.getNumberRace();

        System.out.println("The normal horse name is " + normalHorseName + " color is " + normalHorseColor + " and birth in " + normalHorseBirthYear);
        System.out.println("The race horse name is " + raceHorseName + " color is " + raceHorseColor + " and birth in " + raceHorseBirthYear + " have completed " + raceHorseNumberRace + " races");
    }


}


