## Solution AAssignment4
### Color Class

The Color Class implements Colneable interface and having 3 final (to keep it don't modefied) integer values (red, green, blue) . then having constructor takes 3 integer values. and this class Override toSting function to change the shape of the values, also Override clone function to keep creating only onr copy for each color.
Then create convert function that takes 3 integer values and return String that contains these 3 integers like this ("red-green-blue"), this fuction having an object(depends on interface) and from this object called the convert function.
```java
public static String convert(int red, int green, int blue) {
        Converting converting = new Convert();
        return converting.convert(red,green,blue);
    }
```

And create getColor function thats having an object (also depends on interface) takes 3  integers and return object with color type , this function first called convert function and stored the result in string, then check if this string exists in Hashmap return the copy of this color, but if this color don't exists in the hashmap added it.
```java
public static Color getColor(int red, int green, int blue) {
        ReturningColor getcolor = new get();
        return getcolor.getColors(red,green,blue);
    }
```
And finally created printColor function that take 3 integers and check if this color in the default colors print its name else if the color in the hashmap in the colorstore print the value of this color else print it's no exsits in the Hashmap.
```java
 public static void printColor(int red, int green, int blue){
        Printing print = new Printcolor();
        print.printColor(red,green,blue);
    }
```

### ColorStore Class

The next class is ColorStore that contains a HashMap<String, Color> 
and added the defualt colors in static block (red,green,blue,white,black) the key is the string containt the integer value ("red-green-blue") and the value is Color object. and also created getCopy function to get a copy of color and modefied it rather than modefied on the original color
```java

    public final static HashMap<String, Color> colors = new HashMap<>();

    static {
        colors.put(Color.convert(255,0,0), new Color(255,0,0));
        colors.put(Color.convert(0,255,0), new Color(0,255,0));
        colors.put(Color.convert(0,0,255), new Color(0,0,255));
        colors.put(Color.convert(0,0,0), new Color(0,0,0));
        colors.put(Color.convert(255,255,255), new Color(255,255,255));
    }
```
### Main

in main 
- write code to get a 
1 new color--> the code added it into HashMap and return the value of the color.
2 existing color --> only return it's value.
3 also new color.
- Then pirnts all colors in the HashMap--> printing the default colors and the 2 colors that added recently.
- write code to print <br />
1 red that is in defualt colors--> it's Red.<br />
2 blue that is in defualt colors --> it's Blue.<br />
3 color dosn't exists in HashMap--> it's not exsixs . <br />
4 color the added recently in the HaskMap (not a defualt color) --> the value of this color.
 

 ![AAsaignment4 drawio](https://user-images.githubusercontent.com/92352860/198851696-f5930df1-b841-4a45-9dcb-df8df82f7c3e.png)
