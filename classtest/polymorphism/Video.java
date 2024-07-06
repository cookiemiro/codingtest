package classtest.polymorphism;

public class Video extends Content {
    private String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Video(String title, String genre) {
        super(title);
        this.genre = genre;
    }

    @Override
    void totalPrice() {
        switch (this.genre) {
            case "new" -> super.setPrice(2000);
            case "comic" -> super.setPrice(1500);
            case "child" -> super.setPrice(1000);
            default -> super.setPrice(500);
        }
    }
}
