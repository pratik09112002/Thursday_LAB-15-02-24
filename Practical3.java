/*3.  Create a arraylist of students name and remove name of students who start with ‘S’ using lambda expression.
 */

package Thursday_LAB_15_02_24;

import java.util.ArrayList;
import java.util.List;

public class Practical3 {
    public static void main(String[] args) 
    {
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Saurabh");
        studentNames.add("Mohit");
        studentNames.add("Sahil");
        studentNames.add("Akash");
        studentNames.add("Sayli");
        studentNames.add("Sachin");
        studentNames.add("Suraj");
        studentNames.add("Vikas");
        studentNames.add("Aadesh");
        studentNames.add("Akshay");
        studentNames.add("sayli");



        System.out.println("Student names before removal: " );
        System.out.println(studentNames);
        System.out.println();
        
        // Using lambda expression to remove names starting with 'S'
        studentNames.removeIf(name -> name.startsWith("S"));
        studentNames.removeIf(name -> name.startsWith("s"));

        System.out.println("Student names after removal: " );
        System.out.println(studentNames);
    }
}
