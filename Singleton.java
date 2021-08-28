class Demo{

    private float coffeeQty;
    private float milkQty;
    private float WaterQty;
    private float SugarQty;

    static private Demo my=null;

    private Demo(){
        coffeeQty=1;
        milkQty=1;
        WaterQty=1;
        SugarQty=1;
    }

    public float getCoffee(){
        return 0.10f;
    }

    static Demo getInstance(){
        if(my==null){
            my=new Demo();
        }
        return my;
    }
}

public class Singleton {

    public static void main(String[] args) {

        Demo m=Demo.getInstance();
        System.out.println(m.getCoffee());
    }


}
