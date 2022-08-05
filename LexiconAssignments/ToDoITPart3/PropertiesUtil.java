package LexiconAssignments.ToDoIT;

import LexiconAssignments.ToDoIT.Sequencers.PersonIdSequencer;
import LexiconAssignments.ToDoIT.Sequencers.ToDoItemIdSequencer;
import LexiconAssignments.ToDoIT.Sequencers.ToDoItemTaskIdSequencer;

import java.io.*;
import java.util.Properties;

public class PropertiesUtil {

    public static void writeToPropertiesFile() throws IOException {
        Properties properties = new Properties();
        OutputStream outputStream = new FileOutputStream("subsequencers.properties");
        properties.setProperty("currentPersonId: ", String.valueOf(PersonIdSequencer.nextId()));
        properties.setProperty("currentToDoItemId: ", String.valueOf(ToDoItemIdSequencer.getCurrentId()));
        properties.setProperty("currentToDoItemTaskId: ", String.valueOf(ToDoItemTaskIdSequencer.getCurrentId()));

        try{
        properties.store(outputStream,null);}
        catch(IOException ex) {
            ex.getMessage();
        }


    }

    public static void readFromPropertiesFile() throws IOException {
        Properties p = new Properties();
        InputStream in = new FileInputStream("subsequencers.properties");

        try {
            p.load(in);
            p.list(System.out);
        }
        catch (IOException e){
            e.getMessage();
        }
    }
}
