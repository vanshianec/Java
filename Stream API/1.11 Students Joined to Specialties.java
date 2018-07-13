import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programming {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        List<StudentSpeciality> specialities = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        while (!input.equals("Students:")) {
            String tokens[] = input.split(" ");
            String specialityName = tokens[0] + " " + tokens[1];
            int facultyNumber = Integer.parseInt(tokens[2]);
            StudentSpeciality studentSpeciality = new StudentSpeciality(specialityName, facultyNumber);
            specialities.add(studentSpeciality);
            input = reader.readLine();
        }

        input = reader.readLine();

        while (!input.equals("END")) {
            String tokens[] = input.split(" ");
            String studentName = tokens[1] + " " + tokens[2];
            int facultyNumber = Integer.parseInt(tokens[0]);
            Student student = new Student(studentName, facultyNumber);
            students.add(student);
            input = reader.readLine();
        }
        students.stream().sorted((s1, s2) -> s1.getStudentName().compareTo(s2.getStudentName()))
                .forEach(student -> {
                    specialities.stream().filter(spec -> spec.getFacultyNumber() == student.getFacultyNumber())
                            .forEach(spec -> {
                                System.out.printf("%s %d %s%n",student.getStudentName(),student.getFacultyNumber(),spec.getSpecialityName());
                                    }

                            );

                });


    }
}

class StudentSpeciality {
    private String specialityName;
    private int facultyNumber;

    public StudentSpeciality(String specialityName, int facultyNumber) {
        this.specialityName = specialityName;
        this.facultyNumber = facultyNumber;
    }

    public String getSpecialityName() {
        return specialityName;
    }

    public void setSpecialityName(String name) {
        this.specialityName = specialityName;
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(int facultyNumber) {
        this.facultyNumber = facultyNumber;
    }
}

class Student {
    private String studentName;
    private int facultyNumber;

    public Student(String specialityName, int facultyNumber) {
        this.studentName = specialityName;
        this.facultyNumber = facultyNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        this.studentName = studentName;
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(int facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

}





