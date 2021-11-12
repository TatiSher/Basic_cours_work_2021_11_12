package skypro;

public class Employee {

    private String fullName;
    private int department;
    private int salary;
    private int id;
    public static int idCounter = 0;


    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;
    }

    /// Добавить возможность получать значения полей из Employee (геттеры) для всех полей.

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    /// Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }



    ///Посчитать сумму затрат на зарплаты в месяц.

//    public static int calculateSalarySum(Employee[] employeeInfo) { //
//        int sum = 0;
//        for (int i = 0; i < employeeInfo.length; i++) {
//            sum = sum + employeeInfo[i].getSalary();
//        }
//        return sum;
//    }

    /// or

    public static int calculateSalarySum(Employee[] employeeInfo) {
        int sum = 0;
        for (Employee salary : employeeInfo) {
            sum += salary.getSalary();
        }
        return sum;
    }


    ///Найти сотрудника с минимальной зарплатой.

    public static int calculateMinSalary(Employee[] employeeInfo) {
        int min = Integer.MAX_VALUE;
        for (Employee salary : employeeInfo) {
            min = Math.min(min, salary.getSalary());
        }
        return min;
    }

    /// Найти сотрудника с максимальной зарплатой.

    public static int calculateMaxSalary(Employee[] employeeInfo) {
        int max = Integer.MIN_VALUE;
        for (Employee salary : employeeInfo) {
            max = Math.max(max, salary.getSalary());
        }
        return max;
    }

    /// Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).

    public static int calculateAverageValue(Employee[] employeeInfo) {
        int sum = 0;
        for (Employee salary : employeeInfo) {
            sum += salary.getSalary();
        }
        int average = sum / employeeInfo.length;
        return average;
    }
}
