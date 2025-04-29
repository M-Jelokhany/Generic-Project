package products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;

    public Product(String title , double price){
        this.title = title;
        this.price = price;
    }

    public String getTitle(){
        return this.title;
    }

    public Double getPrice(){
        return this.price;
    }

    public String getId(){
        return this.id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public void setId(String id){
        this.id = id;
    }

    public String toString(){
        return "id : " + this.id + "\n" + "title : " + this.title + "\n" + "price : " + this.price + "\n";
    }

    protected abstract String generateId();
}
