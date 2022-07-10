package LexiconJava.Exercises.Week6.InterfaceExercise;

public class Main {

    public static void main(String[] args) {

    SystemDeveloper Husayn = new SystemDeveloper("Husayn the Pro", new String[] {"Java", "JavaScript", "Python", "C#", "C+"},
        new String[]{"Lexicon certificate", "Oracle Java certificate"});

    Husayn.amountLanguages();
    SalesPerson salesPerson = new SalesPerson(new String[]{}, new String[]{});
    salesPerson.setNewClients(new String[]{"Microsoft", "Apple", "Samsung"});
    salesPerson.setAquiredClients(new String[]{"Sony", "Nokia"});
        System.out.println(salesPerson.toString());
        System.out.println(salesPerson.getAquiredClients());


        System.out.println("Husayn works with: " + Husayn.amountLanguages() + " languages");
        System.out.println("Husayn has: "+Husayn.amountCertificates() +" certificates");
        System.out.println("Husayn's salary is: "+ Husayn.calculateSalary() + "SEK");

        System.out.println("Sales person has: " + salesPerson.calculateSalary()+ " SEK in salary");


}
}
