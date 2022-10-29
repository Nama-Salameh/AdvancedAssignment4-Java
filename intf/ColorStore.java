package intf;
import java.util.HashMap;

public class ColorStore{


    public final static HashMap<String, Color> colors = new HashMap<>();

    static {
        System.out.println("I am being run at static block");
        colors.put(Color.convert(255,0,0), new Color(255,0,0));
        colors.put(Color.convert(0,255,0), new Color(0,255,0));
        colors.put(Color.convert(0,0,255), new Color(0,0,255));
        colors.put(Color.convert(0,0,0), new Color(0,0,0));
        colors.put(Color.convert(255,255,255), new Color(255,255,255));
    }


    public static Color getCopy(String color){
        //Color original = colors.get(color);// prototype
        Color copy =  (Color)colors.get(color).clone();// copy from prototype
        return copy;
    }


}