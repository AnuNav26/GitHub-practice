package learnCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeList
{
    public static void main(String[] args) {
        List<EmployeeDet> employees = new ArrayList<EmployeeDet>();
        employees.add(new EmployeeDet(101, "Anita", 28, 600000));
        employees.add(new EmployeeDet(102, "Vikram", 35, 750000));
        employees.add(new EmployeeDet(103, "Divya", 30, 580000));
        employees.add(new EmployeeDet(104, "Rajesh", 32, 720000));
        employees.add(new EmployeeDet(105, "Sneha", 27, 640000));

        //Sort
       // Collections.sort(employees,(e1,e2)->e1.getName().compareTo(e2.getName()));
        //Collections.sort(employees,(e1,e2)->Integer.compare(e2.getAge(),e1.getAge()));
        //Collections.sort(employees,(e1,e2)->Long.compare(e1.getSalary(),e2.getSalary()));
        Collections.sort(employees,new MySort());
       // employees.sort(Comparator.comparing(EmployeeDet::getAge));
        /*for(EmployeeDet emp: employees)
        {
            System.out.println(emp.getEmpId()+" "+emp.getSalary()+" "+emp.getAge()+" "+emp.getName());
        }*/

        //created toString inEmpDet class
        for(EmployeeDet emp: employees)
        {
            System.out.println(emp);
        }
    }

    static class MySort implements Comparator<EmployeeDet> {

        @Override
        public int compare(EmployeeDet o1, EmployeeDet o2) {
            //return (int) (o1.getSalary()-o2.getSalary());
            return Long.compare(o1.getSalary(),o2.getSalary());
        }
    }
}
