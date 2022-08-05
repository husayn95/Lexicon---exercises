package LexiconAssignments.ToDoIT;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonUtil {
    ObjectMapper objectMapper = new ObjectMapper();
    ObjectWriter writer = objectMapper.writer(new DefaultPrettyPrinter());

    public  void serializeListOfAppuser(List<AppUser> objects, File file) {
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            writer.writeValue(file, objects);
            System.out.println("Operation is Done");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
                public void deserializeAppUser(File fileName) {
                    try {
                        // create object mapper instance
                        ObjectMapper mapper = new ObjectMapper();

                        List<AppUser> objects = mapper.readValue(fileName, new TypeReference<>() {
                        });
                        objects.forEach(System.out::println);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

//    public <T> T deSerializeListOfObjects(String fileName) {
//        try {
//            InputStream inputStream = new FileInputStream(fileName);
//            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
//        return (T) objectInputStream.readObject();
//    }catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        } return null;
//    }
}
