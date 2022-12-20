package Prac06;

public class Horse {
    private String name;
    private String color;
    private int birthYear;
    public Horse(String name, String color, int birthYear){
        setName(name);
        setColor(color);
        setBirthYear(birthYear);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }
    public int getBirthYear(){
        return this.birthYear;
    }

}
