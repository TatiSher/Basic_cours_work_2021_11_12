package skypro;

public class Main {

    public static void main(String[] args) {
        /// Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.

        Employee[] employeeInfo = new Employee[10];
        employeeInfo[0] = new Employee("Ivanov Ivan Ivanovich", 1, 32_000);
        employeeInfo[1] = new Employee("Ivanova Lyudmila Petrovna", 2, 21_654);
        employeeInfo[2] = new Employee("Petrov Petr Ivanovich", 3, 10_587);
        employeeInfo[3] = new Employee("Ivanov Dmitrii Ivanovich", 4, 43_787);
        employeeInfo[4] = new Employee("Demo Ekaterina Ivanovna", 5, 23_987);
        employeeInfo[5] = new Employee("Petrova Darina Ivanovna", 3, 45_070);
        employeeInfo[6] = new Employee("Shtilts Anna Petrovna", 5, 11_555);
        employeeInfo[7] = new Employee("Artemov Artem Petrovich", 2, 17_587);
        employeeInfo[8] = new Employee("Shmel Artur Ivanovich", 1, 57_777);
        employeeInfo[9] = new Employee("Lik Dmitrii Petrovich", 4, 73_987);

        /// Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).

        for (int i = 0; i < employeeInfo.length; i++) {
            System.out.println(employeeInfo[i]);
        }

        ///Посчитать сумму затрат на зарплаты в месяц.

        System.out.println("Salary sum: " + Employee.calculateSalarySum(employeeInfo) + " Rubles.");

        ///Найти сотрудника с минимальной зарплатой.

        System.out.println("Min salary: " + Employee.calculateMinSalary(employeeInfo) + " Rubles.");

        /// Найти сотрудника с максимальной зарплатой.

        System.out.println("Max salary: " + Employee.calculateMaxSalary(employeeInfo) + " Rubles.");


        /// Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).

        System.out.println("Average salary: " + Employee.calculateAverageValue(employeeInfo) + " Rubles.");


        ///Получить Ф. И. О. всех сотрудников (вывести в консоль).

        for (int i = 0; i < employeeInfo.length; i++) {
            System.out.println("Employee names: " + employeeInfo[i].getFullName());
        }
    }
}