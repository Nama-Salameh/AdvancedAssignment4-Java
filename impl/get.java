package impl;

import intf.ReturningColor;

public class get implements ReturningColor {
    public Color getColors(int red, int green, int blue) {
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
