import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(7);
        nums.add(4);
        nums.add(9);

        //foreach
        System.out.println("forEach()");
        nums.stream().forEach((n)-> System.out.println(n));

        //map
        System.out.println("map()");
        ArrayList<Integer> numsIncremented = nums.stream().map((n)-> n+1).collect(Collectors.toCollection(ArrayList::new));
        numsIncremented.forEach(n->System.out.println(n));

        // use map to convert list of ids to matching employees
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);

        EmployeeRepository eRepo = new EmployeeRepository();
        List<Employee> employees = ids.stream().map(eRepo::findEmployee).collect(Collectors.toList());
        employees.forEach((e) -> System.out.println(e.getId()));

        //filter
        System.out.println("filter()");
        ArrayList<Integer> oddNumbers = nums.stream().filter((n)->(n % 2) == 0).collect(Collectors.toCollection(ArrayList::new));
        oddNumbers.forEach((n)-> System.out.println(n));

        List<Employee> bankEmployees = new ArrayList<>();
        Employee e1 = new Employee(1);
        e1.credit(8);
        Employee e2 = new Employee(2);
        e2.credit(7);
        Employee e3 = new Employee(3);
        e3.credit(11);
        Employee e4 = new Employee(4);
        e4.credit(12);

        bankEmployees.add(e1);
        bankEmployees.add(e2);
        bankEmployees.add(e3);
        bankEmployees.add(e4);

        List<Employee> evenIdANDEvenBalance = bankEmployees.stream().filter((e)-> e.getId()%2 == 0).filter((e)-> e.getBalance() > 10).collect(Collectors.toList());
        System.out.println(evenIdANDEvenBalance);
        
        //Stream.of
        String[] words = {"a","b","c"};
        Stream<String> wordStream = Stream.of(words);
        wordStream.forEach((w) -> System.out.println(w));

        //findfirst
        Optional<Employee> optionalE = bankEmployees.stream().filter((e) -> e.getBalance() > 30).findFirst();
        System.out.println("employee with balance > 30 is " + optionalE.isPresent());
        
        //peek
        bankEmployees.stream().filter((e)-> e.getId()%2 == 0).peek((e)->System.out.println("peeking after filtering even ids " + e.getId())).filter((e)-> e.getBalance() > 10).collect(Collectors.toList());
        List<String> lowerCaseWords = new ArrayList<>();
        lowerCaseWords.add("cody");
        lowerCaseWords.add("benson");
        lowerCaseWords.add("hello");

        //flatmaptoint
        List<String> numbersAsString = List.of("1","2","4");
        IntStream numbersAsInt = numbersAsString.stream().mapToInt(Integer::parseInt);
        numbersAsString.forEach((n) -> System.out.println(n));
    }
}