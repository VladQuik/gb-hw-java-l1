package HW5;

public class Person {
    private String name;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person() {
    }

    public Person(String _name, String _post, String _email, String _phone, int _salary, int _age) {
        name = _name;
        post = _post;
        email = _email;
        phone = _phone;
        salary = _salary;
        age = _age;
    }

    void print() {
        System.out.println("Name: " + name + "\n" + "Post: " + post + "\n" + "Email: " + email + "\n" + "Phone: " + phone + "\n" + "Salary: " + salary + "\n" + "Age: " + age + "\n");
    }

    int getAge() {
        return age;
    }
}
