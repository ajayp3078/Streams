package Codes;

import Helper.Employee;

import java.util.Arrays;
import java.util.List;

public class IncreaseSalBy10Per {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("oggy", 18, 20000),
                new Employee("bob", 20, 21000),
                new Employee("smith", 22, 25000)
        );

        // increase sal by 10% all and whose age is >22 raise by 30%
        employees.forEach(emp ->{
            if(emp.getAge()>22){
                emp.setSalary((int)(emp.getSalary()*1.30));
            }
            else{
                emp.setSalary((int)(emp.getSalary()*1.10));
            }
        });
        System.out.println("Increased Salary List: "+employees);

        double newSal = 0;
        for(int i=0;i<employees.size();i++){
            newSal = employees.get(i).getSalary()*1.10;
            employees.get(i).setSalary((int)newSal);
        }

        System.out.println(employees);

    }
}
