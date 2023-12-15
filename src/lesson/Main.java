package lesson;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Andy", "Ivanov");
        Employee emp2 = new Employee("Andrey", "Petrov", 32);
        Employee emp3 = new Employee("Mihail", "Koltsov", 32, 15000);
        Employee emp4 = new Employee("Andrey", "Petrov", 32);
//        System.out.println(emp1);
//        System.out.println(emp2);
//        System.out.println(emp3);

        System.out.println(emp1.getFirstName());
        System.out.println();
        System.out.println(emp1.getLasttName());
        System.out.println();
        System.out.println(emp1.getFullName());
        System.out.println();
        System.out.println(emp1.getAge());
        System.out.println();
        System.out.println(emp1.getSalary());
        System.out.println();

        System.out.println(emp4.equals(emp2));
        System.out.println(emp4.equals(emp3));
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());

        System.out.println();
    }
}