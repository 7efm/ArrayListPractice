
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
    ArrayList<Integer> numbers;
    // 1
    public ArrayListP(){
        colors = new ArrayList<String>();
        numbers = new ArrayList<Integer>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Mahogany");
        for(String str : colors){
            System.out.println(str);
        }
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        for(int str : numbers){
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
    public int search(String searchElement){
        int index = 0;
        for(String str : colors){
            if(str.equals(searchElement)){
                return index;
            }
            index++;
        }
        return -1;
    }
    // 8
    public void sortByLengthD(){
        int bigger;
        int smaller;
        for(int i = 0; i <= numbers.size(); i++){
            if(numbers.get(i) < numbers.get(i+1)){
                smaller = numbers.get(i); bigger = numbers.get(i+1);
                numbers.set(i, bigger); numbers.set(i+1, smaller);
            }
        }

    }
}
