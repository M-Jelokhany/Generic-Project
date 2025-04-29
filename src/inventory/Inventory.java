package inventory;

import products.Product;

import java.util.ArrayList;

public class Inventory<T extends Product> {
    private ArrayList<T> items;

    public Inventory(){
        items = new ArrayList<>();
    }

    public ArrayList<T> getItems() {
        return items;
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public void applyDiscount (String productName, int discount){
        boolean notFound = true;
        for(T x : items){
            if(x.getTitle().equals(productName)){
                notFound = false;
                x.setPrice(x.getPrice() - (x.getPrice() * (discount/100)));
            }
        }

        if(notFound){
            System.out.println("product not found");
        }
    }

    public void addItems (T product){
        items.add(product);
    }

    public void removeItemsById(String id){
        boolean notFound = true;
        for(T x : items){
            if(x.getId().equals(id)){
                notFound = false;
                items.remove(x);
                break;
            }
        }

        if(notFound){
            System.out.println("product not found");
        }
    }

    public T findItemsById(String id){
        for(T x : items){
            if(x.getId().equals(id)){
                return x;
            }
        }

        System.out.println("product not found");
        return null;
    }

    public void displayAll(){
        for(T x : items){
            System.out.println(x.toString());
            System.out.println();
        }
    }
}