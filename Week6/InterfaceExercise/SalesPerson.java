package LexiconJava.Exercises.Week6.InterfaceExercise;

import java.util.Arrays;

public class SalesPerson extends  Employee {

    private static int newClientsSequencer;
    private static int aquiredClientsSequencer;

    private String[] newClients;

    private String[] aquiredClients;


    public SalesPerson(String[] newClients, String[] aquiredClients){
        newClientsSequencer = newClients.length;
        aquiredClientsSequencer = aquiredClients.length;
    }


    public String[] getNewClients() {
        return newClients;
    }

    public void setNewClients(String[] newClients) {
        this.newClients = newClients;
        newClientsSequencer = newClients.length;
    }

    public String getAquiredClients() {
        return Arrays.toString(aquiredClients);
    }

    public void setAquiredClients(String[] aquiredClients) {
        this.aquiredClients = aquiredClients;
        aquiredClientsSequencer = aquiredClients.length;
    }

    @Override
    public String toString() {
        return "new clients: " + Arrays.toString(newClients);
    }

    @Override
    public double calculateSalary() {
        double clientBonus = 500;
        double aquiredClientBonus = 1000;

        double totalSalesPersonSalary = Employee.baseSalary + (clientBonus * newClientsSequencer) + (aquiredClientBonus * aquiredClientsSequencer);
        return totalSalesPersonSalary;
    }
}
