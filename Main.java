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
        Color.printColor(255,0,0);
        Color.printColor(0,0,255);
        Color.printColor(240,255,1);
        Color.printColor(240,0,0);
    }
}
