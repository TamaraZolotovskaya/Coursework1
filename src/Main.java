

public class Main {
   public static final Employee [] employeesList = new Employee [10];

    public static void main(String[] args) {
        employeesList[0]=new Employee("Иванов Петр Васильевич", 1, 55555);
        employeesList[1]=new Employee("Семенова Ольга Николаевна", 1, 44444);
        employeesList[2]=new Employee("Озерова Александра Игоревна", 2, 66666);
        employeesList[3]=new Employee("Подкатов Адександр Валерьевич", 2, 22222);
        employeesList[4]=new Employee("Золотовская Тамара Геннадьевна", 3, 99999);
        employeesList[5]=new Employee("Миненко Анастасия Андреевна", 3, 88888);
        employeesList[6]=new Employee("Сидаш Владислав Константинович", 4, 33333);
        employeesList[7]=new Employee("Петров Евгений Владимирович", 4, 11111);
       //employeesList[8]=new Employee("Кордюшева Татьяна Владимировна", 5, 22222);
       employeesList[9]=new Employee("Тютин Василий Андреевич", 5, 77777);

        employeesList[9].setDepartment(6);
        employeesList[9].setSalary(88888);
        System.out.println(employeesList[8]);
        //  System.out.println(employeesList[8].getDepartment());

        //Получить список всех сотрудников со всеми имеющимися по ним данными
        Employee.getlist();
        //Посчитать сумму затрат на зарплаты в месяц
        System.out.println("Cумма затрат на зарплаты в месяц "+Employee.sumSalary());
        //Подсчитать среднее значение зарплат
        System.out.printf("Среднее значение зарплат %.2f%n", Employee.averageSalary());
        //Найти сотрудника с минимальной зарплатой
        System.out.println("Сотрудник с минимальной зарплатой - "+Employee.minSalary());
        //Найти сотрудника с максимальной зарплатой
        System.out.println("Сотрудник с максимальной зарплатой - "+Employee.maxSalary());
        //Получить Ф. И. О. всех сотрудников (вывести в консоль)
        Employee.getlistNames();
        //Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %)
        Employee.indexSalary(10);
        Employee.getlist();
        //Получить в качестве параметра номер отдела (1–5) и найти cотрудника с минимальной зарплатой
        int department=2;
        System.out.println("Сотрудник с минимальной зарплатой в отделе "+department+" - "+Employee.minSalaryIndepartment(department));
        //Напечатать всех сотрудников отдела (все данные, кроме отдела)
        System.out.println("Сотрудники отдела "+department);
        Employee.getNamesInDepartment(department);
        //Получить в качестве параметра число и найти всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль)
        double line=Employee.averageSalary();
        System.out.println("Сотрудники с зарплатой меньше, чем "+line);
         Employee.getSalaryLessThan(line);

    }
}