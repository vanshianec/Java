import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programming {
    public static void main(String[] args) {
        
         Course defaultCourse = new Course();
         Course myCourse= new Course("Ninjas",542); 
         
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\java\\course.ser"));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\java\\course.ser"));
            PrintWriter printWriter = new PrintWriter("D:\\java\\output.txt")){

            objectOutputStream.writeObject(defaultCourse);
            objectOutputStream.writeObject(myCourse);
             Course currentDefaultCourse=(Course)objectInputStream.readObject();
             Course currentMyCourse=(Course)objectInputStream.readObject();
             printWriter.printf("Course name: %s%n",currentDefaultCourse.getName());
             printWriter.printf("Number of students: %d%n",currentDefaultCourse.getStudentsCount());
             printWriter.printf("Course name: %s%n",currentMyCourse.getName());
             printWriter.printf("Number of students: %d%n",currentMyCourse.getStudentsCount());

        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
           e.printStackTrace();
        }


    }
}

class Course implements Serializable{
    private String name;
    private int studentsCount;

    public Course(){
        name="DefaultName";
        studentsCount=9999;
    }
    public Course(String name,int studentsCount){
       this.name=name;
       this.studentsCount=studentsCount;

    }

    public String getName(){
        return name;
    }
    public int getStudentsCount(){
        return studentsCount;
    }


}

