package classprac;

public class Teacher {
    private String name;
    private int age;
    private String subject;

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

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void print() {
        System.out.println("이  름 : " + name + "   나 이 : " + age + " 담당과목 : " + subject);
    }
}
