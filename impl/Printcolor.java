package impl;

import intf.Printing;

public class Printcolor implements Printing {

    @Override
    public void printColor(int red, int green, int blue) {
        String color = Color.convert(red,green,blue);
        if(ColorStore.colors.containsKey(color)){
            if(red == 255 && green == 0 && blue == 0)
                System.out.println("It's Red");
            else if(red == 0 && green == 0 && blue == 255)
                System.out.println("It's Blue");
            else if(red == 0 && green == 255 && blue == 0)
                System.out.println("It's Green");
            else if(red == 255 && green == 255 && blue == 255)
                System.out.println("It's White");
            else if(red == 0 && green == 0 && blue == 0)
                System.out.println("It's Black");
            else{
                System.out.println(color);
            }
        }else System.out.println("It's Not exists in our colors");
    }
}
