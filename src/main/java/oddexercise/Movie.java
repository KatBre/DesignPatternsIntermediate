package oddexercise;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
public class Movie {
    private String name;
    private MovieType movieType;
    private LocalDate date;
    private String author;

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", movieType=" + movieType +
                ", date=" + date +
                ", author='" + author + '\'' +
                '}';
    }
}
