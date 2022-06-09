import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class FolderSize {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\angel\\Documents\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");
        Deque<File> files = new ArrayDeque<>();
        files.offer(folder);
        int totalSize = 0;
        while(!files.isEmpty()){
            File currentFile = files.poll();
            File[] nestedFiles = currentFile.listFiles();
            for (File file : nestedFiles) {
                if(file.isDirectory()){
                    files.offer(file);
                } else {
                    totalSize+= file.length();
                }
            }
        }
        System.out.printf("Folder size: %d",totalSize);
    }
}
