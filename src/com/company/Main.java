package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static com.company.Methods.deserealize;
import static com.company.Methods.serialize;

public class Main {

    /**
     * @author andri
     * @since 1.8
     * @see Employee,Methods */

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        File file = new File("serialize.txt");
        Employee employee = new Employee("Andrian",0,2000);
        System.out.println(employee);

        //Помітити поле salary модифікатором transient і провести серіалізацію і десеріалізацію. Результат вивести на екран.
        serialize(file,employee);
        Employee employee1 = (Employee) deserealize(file);
        System.out.println(employee1);

        System.out.println();

        //Створити колекцію об’єктів Employee, провести серіалізацію та десеріалізацю колекції.
        System.out.println("Output serialize and deserealize with ArrayList: ");
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Andrew",2 ,10000));
        list.add(new Employee("Olya",3 ,30000));
        list.add(new Employee("Bogdan",4 ,105000));
        list.add(new Employee("Mihael",5 ,50000));

        serialize(file,list);

        ArrayList<Employee> arrayList = (ArrayList<Employee>) deserealize(file);
        for (Employee emp: arrayList) {
            System.out.println(emp);
        }
    }
}
