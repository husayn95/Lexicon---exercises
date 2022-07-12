package LexiconAssignments.ToDoIT;

public class TodoItemTask {
//Fields:
//• id (private) is an int representing each TodoItemTask object
//• assigned (private) set to true if assignee is not null
//• todoItem (private) represent the details what assignee should do before deadline. Not null
//• assignee (private) is the Person being assigned to do the Task.

    private static int idSequencer = 100;
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public TodoItemTask(){
        this.id = ++idSequencer;
    }


    public int getId(){
        return  id;
    }

    public boolean isAssigned(){
        return  assigned;
    }

    public void setAssigned(boolean assigned){
        this.assigned = assigned;
    }

    public TodoItem getTodoItem(){
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem){
        this.todoItem = todoItem;
    }

    public Person getAssignee(){
        return assignee;
    }

    public void setAssignee(Person assignee){
        this.assignee = assignee;
    }

    public String getSummary(){
        String summary = "ToDoItemTask Id: "+getId()+ "   What is the task?: "+getTodoItem().getTitle()+ "   Is it assigned?: "+isAssigned()+"   Who is the assignee?: "+getAssignee().getFirstName();
        return summary;
    }

}
