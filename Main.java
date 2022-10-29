import impl.Color;
import impl.ColorStore;

public class Main {

    public static void main(String[] args) {
        //new color
        System.out.println(Color.getColor(255,255,0));
        //white
        System.out.println(Color.getColor(255,255,255));
        //new color
        System.out.println(Color.getColor(240,255,1));
        //print all colors
        System.out.println(ColorStore.colors);

        System.out.println("-----------");
        //red
        Color.printColor(255,0,0);
        //blue
        Color.printColor(0,0,255);
        //not exits
        Color.printColor(240,255,1);
        //exits but not default
        Color.printColor(240,0,0);
    }
}
