
/**
 * Write a description of class ArrayListP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
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
        for(int g = 0; g <= numbers.size(); g++){
            for(int i = 0; i < numbers.size() -1; i++){
                if(numbers.get(i) < numbers.get(i+1)){
                    smaller = numbers.get(i); bigger = numbers.get(i+1);
                    numbers.set(i, bigger); numbers.set(i+1, smaller);
                }
            }
        }

    }
    // 9 
    public ArrayList<String> copyArrayList(){
        ArrayList<String> colorsCopy;
        colorsCopy = new ArrayList<String>();
        for(String str : colors){
            colorsCopy.add(str);
        }
        return colorsCopy;
    }
    // 10
    public void shuffleArrayList(){    
        String second;
        String first;
        for(int i = 0; i < colors.size(); i++){
            int randIndex = (int)(Math.random()*colors.size());
            second = colors.get(randIndex);
            first = colors.get(i);
            colors.set(i,second);
            colors.set(randIndex, first);
        }
    }
    // 11
    public void reverseElements(){
        int counter = 0;
        int size = colors.size()-1;
        String second; 
        String first;
        for(int i = 0; i < colors.size()/2; i++){
            first = colors.get(i);
            second = colors.get(i+size-counter);
            colors.set(i,second);
            colors.set(i+size-counter, first);
            counter += 2;
        }

    }
    // 14
    public void swap2Colors(int firstIndex, int secondIndex){
        String first = colors.get(firstIndex); 
        String second = colors.get(secondIndex);
        colors.set(firstIndex, second);
        colors.set(secondIndex, first);
    }
}
