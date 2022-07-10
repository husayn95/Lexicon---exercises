package LexiconJava.Exercises.Week6.InterfaceExercise;

public class SystemDeveloper  extends  Employee{

    private static int certificatesSequencer;
    private static int languagesSequencer;
    private String[] languages;

    public SystemDeveloper(String name, String[] languages, String[] certificates){
        languagesSequencer = languages.length;
        certificatesSequencer = certificates.length;
    }

    public int amountLanguages(){
//        for (int i = 0; i < languages.length; i++){
//
//        }

        return languagesSequencer;
    }

    public int amountCertificates(){
        return certificatesSequencer;

    }

    @Override
    public double calculateSalary() {
        double languageBonus = 1500;
        double certificateBonus = 1000;

        double developerTotalSalary = Employee.baseSalary + (amountCertificates() * certificateBonus) + (amountLanguages() * languageBonus);
        return developerTotalSalary;
    }
}
