package Prac03;

public class DebugBox
{
    private final int width;
    private final int length;
    private final int height;
    public DebugBox()
    {
        length = 1;
        width = 1;
        height = 1;
    }
    public DebugBox(int width, int length, int height)
    {
        this.width = width;
        this.length = length;
        this.height = height;
    }
    public void showData()
    {
        System.out.println("Width: "  + this.width + "  Length: " +
                this.length + "  Height: " + this.height);
    }
    public double getVolume()
    {
        return length * width * height;
    }
}