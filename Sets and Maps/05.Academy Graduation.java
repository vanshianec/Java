import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        TreeMap<String,double[]> graduationList = new TreeMap<>();
        for (int i=0;i<N;i++){
            String studentName=scanner.nextLine();
            String studentGradesInput=scanner.nextLine();
            double studentGrades[]= Arrays.stream(studentGradesInput.split(" ")).
                    mapToDouble(Double::parseDouble).toArray();

            graduationList.put(studentName,studentGrades);


        }
        for (Map.Entry<String, double[]> entry : graduationList.entrySet()) {
            double average=0;
            for (int i=0;i<entry.getValue().length;i++){
                average+=entry.getValue()[i];
            }
            average/=entry.getValue().length;
            System.out.printf("%s is graduated with %s%n",entry.getKey(),average);


        }




    }
}
