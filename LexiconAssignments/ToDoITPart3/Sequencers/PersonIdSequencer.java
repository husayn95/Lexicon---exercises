package LexiconAssignments.ToDoIT.Sequencers;

public class PersonIdSequencer {

    private static int currentId = 0;

    public static int nextId(){
        return ++currentId;
    }




    //Singeletion class pattern
//    private static  PersonIdSequencer instance = new PersonIdSequencer();
//
//    private  PersonIdSequencer(){}
//
//    public  static PersonIdSequencer getInstance(){
//        return instance;
//    }
}
