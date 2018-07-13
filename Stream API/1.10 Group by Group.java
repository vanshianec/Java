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
        List<Person> personList = new ArrayList<>();
        while(!input.equals("END")){
            String personName =input.split(" ")[0]+" "+input.split(" ")[1];
            int personGroup = Integer.parseInt(input.split(" ")[2]);
            Person person = new Person(personName,personGroup);
            personList.add(person);
            input=reader.readLine();
        }
        Map<Integer,List<String>> students = personList.stream().collect(Collectors.groupingBy(Person::getGroup,
                Collectors.mapping(Person::getName,Collectors.toList())));
        students.entrySet().stream().forEach(kv -> System.out.println(kv.getKey()+" - "+String.join(", ",kv.getValue())));








    }
}

class Person {
    private String name;
    private Integer group;

    public Person(String name, Integer group) {
        this.name = name;
        this.group = group;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return this.group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }


}
