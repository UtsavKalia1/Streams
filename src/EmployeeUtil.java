import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeUtil {
    public static List<String> getEmpNames(Function<List<Employee>, List<String>> func, List<Employee> empList) {
        return func.apply(empList);
    }

    public static List<Double> getEmpSalaries(Predicate<Employee> predicate, List<Employee> empList) {
        List<Double> salaries = new ArrayList<>();
        for (Employee emp : empList) {
            if (predicate.test(emp)) {
                salaries.add(emp.getSalary());
            }
        }
        return salaries;
    }
}



