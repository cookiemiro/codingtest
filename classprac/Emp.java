package classprac;

public class Emp {
    private String id;
    private String name;
    private int baseSalary;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBaseSalry(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public double getSalary(double bonus) {
        double salary = baseSalary * (1 + bonus);
        return salary;
    }

    public String toString() {
        return name + "(" + id + ") 사원을 기본급은 " + baseSalary + "원 입니다.";
    }
}
