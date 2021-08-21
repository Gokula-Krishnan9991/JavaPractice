
class Animal{

    private int teeth;
    private int ear;
    private int nose;
    private String name;

    public Animal(){
        System.out.println("Hello this is an animal");
    }

    public Animal(String color){
        System.out.println("Color varies between animals");
    }

}
class Cat extends Animal{

    public void sounds(){
        System.out.println("Meow Meow");
    }

    public Cat(){
        System.out.println("Hello Im cat");
    }

    public Cat(String color,int legs){
        super(color);
        System.out.println("I will be mostly "+legs+" legs");
    }
}

public class parameter {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.sounds();
        Cat d=new Cat("blue",4);


    }
}
