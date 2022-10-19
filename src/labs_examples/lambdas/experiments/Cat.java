package labs_examples.lambdas.experiments;

public class Cat {
    String name;
    String color;

    public Cat(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString(){
        return name + " the cat is " + color;
    }
}
