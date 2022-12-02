public class Employee {
    private final String name;
    private int department;
    private int salary;
    private static int counter;
    private final int id;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter + 1;
        counter++;
    }

    public String getName() {
        return name;
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

    public void setDepartment(int department) {
        if (department < 1 || department > 5) {
            System.out.println("Такого отдела не существует");
        } else {
            this.department = department;
        }
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        {
            return id + ". ФИО: " + name + ", отдел: " + department + ", зарплата: " + salary;
        }
    }

    //Получить список всех сотрудников со всеми имеющимися по ним данными
    public static void getlist() {
        for (Employee list : Main.employeesList) {
            if (list != null) {
                System.out.println(list);
            }
        }
    }

    //Посчитать сумму затрат на зарплаты в месяц
    public static int sumSalary() {
        int sum = 0;
        for (Employee list : Main.employeesList) {
            if (list != null) {
                sum = sum + list.getSalary();
            }
        }
        return sum;
    }

    //Подсчитать среднее значение зарплат
    public static double averageSalary() {
        int number = 0;
        for (Employee list : Main.employeesList) //ищем сколько сотрудников в списке, на случай, если какой-то элемент пропущен (сотрудник был, но удалили)
        {
            if (list != null) {
                number++;
            }
        }
        if (number != 0) {
            return (double) sumSalary() / number;
        } else return 0;
    }

    //Найти сотрудника с минимальной зарплатой
    public static Employee minSalary() {
        int min = Integer.MAX_VALUE;
        Employee MinSalaryEmploer = null;
        for (Employee list : Main.employeesList) {
            if (list != null && list.getSalary() < min) {
                min = list.getSalary();
                MinSalaryEmploer = list;
            }
        }
        return MinSalaryEmploer;
    }

    //Найти сотрудника с максимальной зарплатой
    public static Employee maxSalary() {
        int max = 0;
        Employee MaxSalaryEmploer = null;
        for (Employee list : Main.employeesList) {
            if (list != null && list.getSalary() > max) {
                max = list.getSalary();
                MaxSalaryEmploer = list;
            }
        }
        return MaxSalaryEmploer;
    }

    //Получить Ф. И. О. всех сотрудников (вывести в консоль)
    public static void getlistNames() {
        for (Employee list : Main.employeesList) {
            if (list != null) {
                System.out.println(list.getName());
            }
        }
    }

    //Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников нa величину аргумента в %)
    public static void indexSalary(int percentChange) {
        for (Employee list : Main.employeesList) {
            if (list != null) {
                double newSalary = list.getSalary() * (1 + percentChange * 0.01);
                int newSalaryInt = (int) newSalary;
                list.setSalary(newSalaryInt);
            }
        }
    }

    //Получить в качестве параметра номер отдела (1–5) и найти cотрудника с минимальной зарплатой
    public static Employee minSalaryIndepartment(int department) {
        int min = Integer.MAX_VALUE;
        Employee MinSalaryEmploer = null;
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого отдела не существует");
        }
        for (Employee list : Main.employeesList) {
            if (list != null && list.getSalary() < min && list.getDepartment() == department) {
                min = list.getSalary();
                MinSalaryEmploer = list;
            }
        }
        return MinSalaryEmploer;
    }

    //Напечатать всех сотрудников отдела (все данные, кроме отдела)
    public static void getNamesInDepartment(int department) {
        for (Employee list : Main.employeesList) {
            if (list != null && list.getDepartment() == department) {
                System.out.println("id: " + list.getId() + ", ФИО: " + list.getName() + ", зарплата: " + list.getSalary());
            }
        }
    }

    //Получить в качестве параметра число и найти всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль)
    public static void getSalaryLessThan(double line) {
        for (Employee list : Main.employeesList) {
            if (list != null && list.getSalary() < line) {
                System.out.println("id: " + list.getId() + ", ФИО: " + list.getName() + ", зарплата: " + list.getSalary());
            }
        }
    }


}


