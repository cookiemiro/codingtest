package classprac;

public class Movie {
    private String title;
    private String genre;

    public void play() {
        System.out.println(title + "(" + genre + ")" + " 상영중입니다.");
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
