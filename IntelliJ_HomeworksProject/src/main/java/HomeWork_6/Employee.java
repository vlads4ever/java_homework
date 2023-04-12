package HomeWork_6;

import java.util.Objects;

public class Employee {
    private static int counter = 0;
    private int empID;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    /**
     * @param firstName  Имя
     * @param lastName  Фамилия
     * @param age  Возраст
     * @param salary  Зарплата
     */
    public Employee(String firstName, String lastName, int age, double salary) {
        this.empID = ++counter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    /**
     * @param firstName  Имя
     * @param lastName  Фамилия
     * @param age  Возраст
     */
    public Employee(String firstName, String lastName, int age) {
        this (firstName, lastName, age, 50.0);
    }

    /**
     * Имя - Неизвестно
     * Фамилия - Неизвестно
     * Возраст - 0
     * Зарплата - 0.0
     */
    public Employee() {
        this ("Неизвестно", "Неизвестно", 0, 0.0);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getEmpID() {
        return empID;
    }

    public void changeFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void changeLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void upgradeSalary (double salary) {
        this.salary += salary;
    }

    public double getSalary() {
        return salary;
    }

    public boolean olderThan(Employee e) {
        return age > e.age;
    }

    @Override
    public String toString() {
        return empID + ": " + getFullName() + "    Возраст: " + age + "    Зарплата: " + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee employee) {
            return firstName.equals(employee.firstName) &&
                    lastName.equals(employee.lastName) &&
                     age == employee.age;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}

/**
 * Создать класс Сотрудник (Employee).
 * У класса должны быть следующие поля:
 * 1. Возраст (int)
 * 2. Имя (String)
 * 3. Фамилия (String)
 * 4. Зарплата (double)
 * 5. ... можно придумать свои поля
 *
 * У класса должно быть 2 конструктора:
 * 1. Конструктор, который принимает все аргументы
 * 2. Констуктор, который принимает все аргументы КРОМЕ зарплаты; значение зарплаты должно быть задано значением по умолчанию (50.0)
 *
 * Переопределить:
 * 1. Методы equals и hashCode (поля, которые должны там участвовать, нужно определить самостоятельно)
 * 2. Метод toString (в любом формате)
 *
 * * Реализовать методы:
 * 1. String getFullName() - возвращает полное имя сотрудника
 * 2. boolean olderThan(Employee e) - возвращает true, если текущий сотрудник старше чем тот, который передали в метод.
 * 3. void upgrade(double salary) - повышает зарплату сотрудника НА salary единиц.
 * Пример: Было 50.0, upgrade(20.0) -> стало 70.0
 */