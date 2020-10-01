import com.google.gson.Gson;
import org.jetbrains.annotations.NotNull;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books;
    public Gson gson;

    public Library(@NotNull String filePath) throws IOException {
        books = new ArrayList<>();
        gson = new Gson();

        FileReader reader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String textLine = bufferedReader.readLine();

        while (textLine != null) {
            String[] str = textLine.split(" - ");
            books.add(new Book(str[1], new Author(str[0])));
            textLine = bufferedReader.readLine();
        }
    }

    public void printJsonSerializedClass(Author author) {
        for (Book book : books)
            if (book.getAuthor().getName().equals(author.getName()))
                System.out.println(gson.toJson(book));
    }
}