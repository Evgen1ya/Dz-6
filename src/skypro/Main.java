package skypro;

public class Main {

    public static void main(String[] args) {
        //Задача 1
        System.out.println("\n Задача 1");
        String firstName = "Ivan";
        String midddleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + midddleName;
        System.out.println("ФИО сотрудника - " + fullName + ".");

        //Задача 2
        System.out.println("\n Задача 2");
        String upperFullName = fullName.toUpperCase();
        System.out.println("”Данные ФИО сотрудника для заполнения отчета — " + upperFullName+".");

        //Задача 3
        System.out.println("\n Задача 3");
        fullName = fullName.replace( " ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName+".");

        //Задача 4
        System.out.println("\n Задача 4");
        String fullNames = "Иванов Сёмен Семёнович";
        fullNames = fullNames.replace( "ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullNames);
    }
}
