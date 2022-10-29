package intf;

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

    public Color(Color color) {
        this.red = color.red;
        this.green = color.green;
        this.blue = color.blue;
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
        return String.valueOf(red) + "-" + String.valueOf(green) + "-" + String.valueOf(blue);
    }

    //2 & 3
    public static Color getColor(int red, int green, int blue) {
        String colorstr = Color.convert(red, green, blue);
        if (!ColorStore.colors.containsKey(colorstr)) {
            Color color = new Color(red, green, blue);
            ColorStore.colors.put(colorstr, color);
            System.out.print("This color is defined now : ");
            return color;
        } else {
            System.out.print("This color already exists : ");
            return ColorStore.getCopy(colorstr);
        }
    }
}