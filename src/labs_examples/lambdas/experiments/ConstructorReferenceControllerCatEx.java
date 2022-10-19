package labs_examples.lambdas.experiments;

public class ConstructorReferenceControllerCatEx {
    public static void main(String[] args) {

        // Modify the line below to use a constructor reference rather than a lambda expression

        //CatInterface catCreator = (name, color) -> {
        //    return new Cat(name, color);
        //};
        CatInterface catCreator = Cat::new;

        Cat kitten = catCreator.createCat("Lucy", "Orange");
        System.out.println(kitten.toString());
    }
}
