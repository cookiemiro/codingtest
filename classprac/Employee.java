package classprac;

public class Employee {
    private String name;
    private int age;
    private String dept;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void print() {
        System.out.println("이  름 : " + name + "   나 이 : " + age + " 부  서 : " + dept);
    }
}
