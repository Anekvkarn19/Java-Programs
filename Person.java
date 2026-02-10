public class Person
{
    // Instance variables
    String name;
    int age;
    // Constructor
    public Person(String n, int a)
    {
        name = n;
        age = a;
    }
    public void display()
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args)
    {
        Person p = new Person("Alice", 30);
        p.display();
    }
}