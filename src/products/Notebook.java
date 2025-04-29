package products;

public class Notebook extends Product{
    private int pageCount;
    private boolean isHardCover;
    private static int anInt = 0;

    public Notebook(String title , double price , int pageCount , boolean isHardCover){
        super(title , price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
        super.setId(this.generateId());
        anInt += 1;
    }

    public int getPageCount() {
        return pageCount;
    }

    public boolean getIsHardCover() {
        return isHardCover;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

    @Override
    public String toString(){
        return super.toString() + "page count : " + this.pageCount + "\n" + "hard cover : " + this.isHardCover;
    }

    @Override
    protected String generateId(){
        return "2" +  String.format("%03d", anInt);
    }
}
