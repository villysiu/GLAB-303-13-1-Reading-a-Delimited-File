import javax.lang.model.type.ArrayType;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScanDelimiterdFile {
    public static void main(String[] args) throws FileNotFoundException {

        try{
            String path = "/Users/villysiu/Documents/Coding/JAVA Projects/GLAB-303.13.1-Reading a Delimited File//cars.csv";
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            ArrayList<String []> data = new ArrayList<String []>();
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                data.add(line.split(","));

            }
            scanner.close();
            for(String[] line : data){
                System.out.println("Car Name :" + line[0] );
                System.out.println("MPG :" + line[1] );
                System.out.println("Cylinder :" + line[2] );
                System.out.println("Displacement :" + line[3]);
                System.out.println("Horsepower :" + line[4]);
                System.out.println("Weight :" + line[5]);
                System.out.println("Acceleration :" + line[6]);
                System.out.println("Model :" + line[7]);
                System.out.println("Origin :" + line[8]);
                System.out.println("===============================");

            }


        } catch(FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }

    }
}
