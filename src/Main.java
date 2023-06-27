import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("John", "Doe", 45000));
        empList.add(new Employee("Jane", "Smith", 55000));
        empList.add(new Employee("Alex", "Johnson", 60000));

        List<String> empNames = EmployeeUtil.getEmpNames(emplist -> {
            List<String> names = new ArrayList<>();
            for (Employee emp : emplist) {
                names.add(emp.getFirstName() + " " + emp.getLastName());
            }
            return names;
        }, empList);

        System.out.println("Employee Names:");
        for (String name : empNames) {
            System.out.println(name);
        }

        System.out.println();
        List<Double> empSalaries = EmployeeUtil.getEmpSalaries(emp -> emp.getSalary() > 50000, empList);

        System.out.println("Employee Salaries:");
        for (double salary : empSalaries) {
            System.out.println(salary);
//    Work w = new Work();
//
//    //this is how it is done if methos is
//        //non static
//
//    Utility u = new Utility();
//    w.doWork(u::nameUtil);

 //   w.doWork(Utility::nameUtil);
// this works if method is static
    // this is called method reference
    }
}}