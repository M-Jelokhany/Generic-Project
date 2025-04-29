package products;

public class Accessory extends Product{
    private String color;
    private static int anInt = 0;

    public Accessory(String title , double price , String color){
        super(title , price);
        this.color = color;
        super.setId(this.generateId());
        anInt += 1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return super.toString() + "color : " + this.color;
    }

    @Override
    protected String generateId(){
        return "3" +  String.format("%03d", anInt);
    }
}
