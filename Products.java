class Product{

    private String itemNo;
    private String name;
    private double price;
    private int quantity;

    public String getItemNo()
        {
            return itemNo;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){

        return quantity;
    }

    public double getPrice(){
        return price;
    }


    public void setPrice(double p){
        price=p;
    }

    public void setQuantity(int q){
        quantity=q;
    }



    public Product(String itemno,String Name){
        itemNo=itemno;
        name=Name;
    }

    public Product(String itemno,String Name,double Price,int Quantity){

        itemNo=itemno;
        name=Name;
        price=Price;
        quantity=Quantity;
    }
}
public class Products {

    public static void main(String[] args) {

        Product nestle=new Product("5458A59","Maggi");
        Product nestle2=new Product("555A59","Kitkat",55.59,10);

        System.out.println(nestle2.getItemNo());
        System.out.println(nestle2.getName());
        System.out.println(nestle2.getPrice());
        System.out.println(nestle2.getQuantity());

    }

}
