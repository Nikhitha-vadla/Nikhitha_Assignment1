import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DisplayAllFilesAndFolders {

	public static void main(String[] args) {
		try {
            Path start = Paths.get("C:\\Trining\\Text_File(java)");
            Stream<Path> stream = Files.walk(start, Integer.MAX_VALUE);
            
            List<String> collect = stream.map(String::valueOf).sorted().collect(Collectors.toList());
            
            collect.forEach(System.out::println);
            
        }catch(IOException e) {
            System.out.println(e.getMessage());

	}

}
}
