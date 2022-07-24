package AssistedProjects2;
import java.io.IOException; 
import java.nio.file.*;
public class CreateTest {
	
	public static void main(String[] args) 
    { 
        try
        { 
            Files.deleteIfExists(Paths.get("E:\\TestFile2.txt")); 
        } 
        catch(NoSuchFileException e) 
        { 
            System.out.println("No such file/directory Found"); 
        } 
        catch(DirectoryNotEmptyException e) 
        { 
            System.out.println("Directory is not Found."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Invalid Actions."); 
        } 
          
        System.out.println("Deletion is done successfully."); 
    } 

}
