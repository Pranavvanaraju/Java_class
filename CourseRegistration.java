import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CourseRegistration {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        String courses[] = {"Java", "Python", "SQL", "Java", "C++", "Python"};

        for (String course : courses) {
            if (hashSet.add(course)) {
                linkedSet.add(course);
                treeSet.add(course);
            }
        }

        System.out.println("Registered Courses (Insertion Order): " + linkedSet);
        System.out.println("Sorted Courses: " + treeSet);
        System.out.println("Total Registered Courses: " + hashSet.size());
    }
}