
/**
 * Write a description of class ArrayListP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;
public class ArrayListP
{
    ArrayList<String> colors;
    // 1
    public ArrayListP(){
        colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Mahogany");
        for(String str : colors){
            System.out.println(str);
        }
    }
    // 2
    public void iterate(){
        for(int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }
    }
    // 3
    public void insertFirst(String x){
        colors.add(0, x);
    }
    // 4
    public String retrieve(int index){
        return colors.get(index);
    }
    // 5
    public void updateElement(String element, int index){
        colors.set(index, element);
    }
    // 6
    public void removeThird(){
        colors.remove(2);
    }
    // 7
    public int search(){
        int index = 0;
        return index;
    }
}
