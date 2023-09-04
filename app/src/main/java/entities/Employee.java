package entities;


public class Employee implements Comparable<Employee>{
    
    private String name;
    private Double salary;
    
    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        //retornar do maior salário para o menor
        //return -salary.compareTo(other.getSalary());
        //retortnar no menor parar o maior
        //return salary.compareTo(other.getSalary());
        // retonar em ordem alfabética (nome)
        return name.compareTo(other.getName());
    }
    
    
}
