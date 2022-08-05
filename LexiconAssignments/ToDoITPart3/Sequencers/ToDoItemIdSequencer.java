package LexiconAssignments.ToDoIT.Sequencers;

public class ToDoItemIdSequencer {

    private static int currentId;

    public static int nextId(){
        currentId++;
        return currentId;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        ToDoItemIdSequencer.currentId = currentId;
    }
}
