package mx.com.ghg.movies.db.entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "review")
public class ReviewEntity {

    @PrimaryKey @NonNull
    private String id;
    private int movieId;
    private String author;
    private String content;
    private String url;

    public ReviewEntity(
            String id,
            int movieId,
            String author,
            String content,
            String url
    ) {
        this.id = id;
        this.movieId = movieId;
        this.author = author;
        this.content = content;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
