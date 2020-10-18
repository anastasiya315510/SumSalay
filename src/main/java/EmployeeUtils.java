import java.util.List;

import static java.util.Arrays.asList;

public class EmployeeUtils {
    public static void main(String[] args) {

        List<Employee> list = asList(new Employee(10),new Employee(20),new Employee(30),new Employee(40),new Employee(50));

        System.out.println("Salary sum is: "+ salarySum(list));

    }

    private static int salarySum(List<Employee>list) {
        int sum;
        sum = list.stream().mapToInt(e-> e.salary).sum();
        return sum;
    }
}
