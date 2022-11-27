import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class A{
    public static List<String> show(String name,List<String> courses)
    {
    	List<String>x = new ArrayList<>();
      Map<String,List>map = new HashMap<>();
      map.put(name,courses);
     x=(map.get(name));
      return x;
    }
}
public class courses{
    public static void main(String[] args)throws NoSuchAlgorithmException { 
    	
        List<String>courses = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String courseName = sc.nextLine();
        while(!courseName.equals(""))
        {
            System.out.println("enter your coursename");
            courses.add(courseName);
            courseName = sc.nextLine();   
        }
       List<String>y = new ArrayList<>();
       y = A.show(name,courses);
       System.out.println(y);
        
      
    }
}