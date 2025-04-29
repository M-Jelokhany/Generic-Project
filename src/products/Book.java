package products;

public class Book extends Product{
    private String author;
    private String publication;
    private String genre;
    private static int anInt = 0;

    public Book (String title , double price , String author , String publication , String genre){
        super(title , price);
        this.author = author;
        this.publication = publication;
        this.genre = genre;
        super.setId(this.generateId());
        anInt += 1;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublication() {
        return publication;
    }

    public String getGenre() {
        return genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString(){
        return super.toString() + "author : " + this.author + "\n" + "publication : " + this.publication + "\n" + "genre : " + this.genre;
    }

    @Override
    protected String generateId(){
        return "1" +  String.format("%03d", anInt);
    }
}
