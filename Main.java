import intf.Color;
import intf.ColorStore;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi");
        //Deep copy
        Color deeplCopyRed = ColorStore.getCopy("255-0-0");
        System.out.println("red " + ColorStore.colors.get("255-0-0"));//255,0,0
        System.out.println("copy " + deeplCopyRed);//255,0,0

        System.out.println("red " + ColorStore.colors.get("255-0-0"));//255,0,0 ?
        System.out.println("copy " + deeplCopyRed);//255,1,1 ok

        //ColorStore.colors.get("255-0-0").setRed(240);

        System.out.println("red " + ColorStore.colors.get("255-0-0"));//240,1,1 ?
        System.out.println("copy " + deeplCopyRed);//240,1,1 ok

        System.out.println("hhh " + ColorStore.colors.get("240-5-5"));
        System.out.println(ColorStore.colors);
    }
}
