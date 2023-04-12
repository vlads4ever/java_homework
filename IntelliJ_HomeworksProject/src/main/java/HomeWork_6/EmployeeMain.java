package HomeWork_6;

import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp_1 = new Employee("Василий", "Петров", 25, 75.0);
        Employee emp_2 = new Employee("Иван", "Сидоров", 35);
        Employee emp_3 = new Employee("Василий", "Петров", 27, 65.0);
        Employee emp_4 = new Employee();
        emp_4.changeFirstName("Анатолий");
        emp_4.changeLastName("Иванов");
        emp_4.setAge(19);
        emp_4.upgradeSalary(35.0);

        List<Employee> empList = new ArrayList<>(List.of(emp_1, emp_2, emp_3, emp_4));
        for (Employee worker: empList) {
            System.out.println(worker);
            System.out.println("Хэш сотрудника_" + worker.getEmpID() + ": " + worker.hashCode());
            System.out.println();
        }
        System.out.println("===============================");

        System.out.println("Сотрудник_" + emp_1.getEmpID() +
                " идентичен Сотруднику_" + emp_2.getEmpID() +
                " : " + emp_1.equals(emp_2));
        System.out.println("Сотрудник_" + emp_1.getEmpID() +
                " идентичен Сотруднику_" + emp_3.getEmpID() +
                " : " + emp_1.equals(emp_3));
        System.out.println();

        System.out.println("Полное имя сотрудника_" + emp_1.getEmpID() + ": " + emp_1.getFullName());
        System.out.println();

        System.out.println("Зарплата сотрудника_" + emp_1.getEmpID() + " до повышения: " + emp_1.getSalary());
        emp_1.upgradeSalary(10.0);
        System.out.println("Зарплата сотрудника_" + emp_1.getEmpID() + " после повышения: " + emp_1.getSalary());
        System.out.println();

        System.out.println("Старше ли сотрудник_" + emp_1.getEmpID() +
                " сотрудника_" + emp_2.getEmpID() +
                ": " + emp_1.olderThan(emp_2));
        System.out.println("Старше ли сотрудник_" + emp_2.getEmpID() +
                " сотрудника_" + emp_3.getEmpID() +
                ": " + emp_2.olderThan(emp_3));
        System.out.println();

        System.out.println("Полное имя сотрудника_" + emp_2.getEmpID() + " до смены фамилии: " + emp_2.getFullName());
        emp_2.changeLastName("Орлов");
        System.out.println("Полное имя сотрудника_" + emp_2.getEmpID() + " после смены фамилии: " + emp_2.getFullName());
        System.out.println();

        System.out.println("Возраст сотрудника_" + emp_3.getEmpID() + ": " + emp_3.getAge());
        System.out.println();


        // Для формирования TreeSet используем компаратор в классе
        EmployeeComparator empAgeDecreaseComparator = new EmployeeComparator();
        Set<Employee> empSetDec = new TreeSet<>(empAgeDecreaseComparator);
        empSetDec.addAll(empList);
        System.out.println("Вывод в порядке уменьшения возраста:");
        for (Employee worker: empSetDec) {
            System.out.println(worker);
        }
        System.out.println();

        // Для формирования TreeSet используем компаратор в функции
        Comparator<Employee> empAgeIncreaseComparator = (o1, o2) -> {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else if (o1.getAge() < o2.getAge()) {
                return -1;
            }
            return 0;
        };

        Set<Employee> empSetInc = new TreeSet<>(empAgeIncreaseComparator);
        empSetInc.addAll(empList);
        System.out.println("Вывод в порядке увеличения возраста:");
        for (Employee worker: empSetInc) {
            System.out.println(worker);
        }
        System.out.println();
    }
}
