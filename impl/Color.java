package impl;

import intf.Converting;
import intf.Printing;
import intf.ReturningColor;

public class Color implements Cloneable {
    private final int red;
    private final int green;
    private final int blue;

    static {
        System.out.println("I am scaning Color class");
    }

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public String toString() {
        return " " + this.red + "-" + this.green + "-" + this.blue + " ";
    }

    @Override
    public Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println(e.getMessage());
        }
        return object;

    }

    public static String convert(int red, int green, int blue) {
        Converting converting = new Convert();
        return converting.convert(red,green,blue);
    }

    //2 & 3
    public static Color getColor(int red, int green, int blue) {
        ReturningColor getcolor = new get();
        return getcolor.getColors(red,green,blue);
    }


    public static void printColor(int red, int green, int blue){
        Printing print = new Printcolor();
        print.printColor(red,green,blue);
    }
}