import org.jetbrains.annotations.NotNull;
import java.io.IOException;
import java.util.ArrayList;

public class LibraryFactory {
    private ArrayList<Library> libraries;

    public LibraryFactory() {
        libraries = new ArrayList<>();
    }

    public void addLibrary(@NotNull String path) throws IOException {
        libraries.add(new Library(path));
    }

    public Library getLibrary(int number) {
        return libraries.get(number - 1);
    }
}