package learnCollections;

public class EmployeeDet
{
    private int empId;
    private String name;
    private int age;
    private long salary;

    public EmployeeDet(int empId, String name, int age, long salary) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
   public String toString(){
    return "EmployeeDet{"+"ID :" + empId + ", name: " + name + ", age: " + age + ", salary: " + salary+'}';
    }
    //git check change

}
