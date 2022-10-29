import intf.Color;
import intf.ColorStore;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi");
        //Deep copy
        /**Color deeplCopyRed = ColorStore.getCopy("255-0-0");
        System.out.println("red " + ColorStore.colors.get("255-0-0"));//255,0,0
        System.out.println("copy " + deeplCopyRed);//255,0,0

        System.out.println("red " + ColorStore.colors.get("255-0-0"));//255,0,0 ?
        System.out.println("copy " + deeplCopyRed);//255,1,1 ok

        System.out.println("red " + ColorStore.colors.get("255-0-0"));//240,1,1 ?
        System.out.println("copy " + deeplCopyRed);//240,1,1 ok
**/
        System.out.println(Color.getColor(255,255,0));
        System.out.println(Color.getColor(255,255,255));
        System.out.println(Color.getColor(240,255,1));
        System.out.println(ColorStore.colors);
    }
}
