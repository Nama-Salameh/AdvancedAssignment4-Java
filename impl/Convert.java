package impl;

import intf.Converting;

public class Convert implements Converting {
    @Override
    public String convert(int red, int green, int blue) {
        return String.valueOf(red) + "-" + String.valueOf(green) + "-" + String.valueOf(blue);
    }
}
