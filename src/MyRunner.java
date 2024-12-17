import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyRunner {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "/Users/villysiu/Documents/Coding/JAVA Projects/GLAB-303.13.1-Reading a Delimited File//CourseData.csv";
        try{
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            ArrayList<Course> data = new ArrayList<>();
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] lineData = line.split(",");
                Course course = new Course(lineData[0], lineData[1], lineData[2]);
                data.add(course);
            }
            scanner.close();
            for (Course c : data) {
                System.out.println(c.getCode() + " | " + c.getCourse_name() + "|" + c.getInstructor_name());
                System.out.println("===============================");
            }

        } catch(FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }


    }
}
