package LexiconAssignments.ToDoIT;

public class Person {

    //Fields:
    //• id (private) is an int representing each Person object.
    //• firstName (private) represents each person’s first name. Not allowed to be null
    //• lastName (private) represents each person’s last name. Not allowed to be null
    //• email (private) represents each person’s email. Not allowed to be null

    private  int id;
    private String firstName;
    private String  lastName;
    private String email;


    public Person(){

    }
    public Person(int id){
    this.id = id;
    }


    //get methods
    public int getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public  String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }

    public String getSummary(){
        String summary = "Summary: " + "id:" + Integer.toString(getId())+ "   Name:" + firstName + " " + lastName + "   and" + "   email:" + email;
        return summary;
    }



    //set methods
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setEmail(String email){
        this.email = email;
    }



}
