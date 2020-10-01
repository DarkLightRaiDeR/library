import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {
        LibraryFactory libraryFactory = new LibraryFactory();
        libraryFactory.addLibrary("libraries/library.txt");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String author = bufferedReader.readLine();

        libraryFactory.getLibrary(1).printJsonSerializedClass(new Author(author));
    }
}
