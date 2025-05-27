import java.util.*;
public class LambdaExpressions {
    public static void main(String[] args){
    List<String> arr=new ArrayList<>();
    arr.add("harika");
    arr.add("neeraja");
    arr.add("mounya");
    arr.add("ramya");
    arr.add("yajna");

    Collections.sort(arr,(a,b)->a.compareToIgnoreCase(b));

    for(String s:arr){
    System.out.println(s);
    }
}
    
}
