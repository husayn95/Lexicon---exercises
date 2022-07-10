package LexiconJava.Exercises.Week6.InterfaceExercise;
//Practice
//: Employee management
//•
//Create a new class called Employee
//•
//Create two classes SystemDeveloper and SalesPerson that should inherit from employee
//•
//When hired each employee has a base salary of 25 000 a month
//•
//SystemDevelopers get 1000 extra for each certificate they have and 1500 extra for each
//programming language they work with
//•
//SalesPersons get 500 extra for each client they maintain and 1000 extra for each new client they
//have aquired
//•
//Create method calculateSalary () in Super class and override this method in its subclasses
//•
//Also make a toString implementation for SystemDevelopers and SalesPerson
//•
//Whenever they aquire new clients , certificates and languages the salary should update

public abstract class Employee {

    public static double baseSalary = 25_000;

    public abstract double calculateSalary();




}
