package basic.annotations.Example3;

public class Main {

    static void main(String[] args) {
        Category[] categoryAnnotation = Eagle.class.getAnnotationsByType(Category.class);
        for(Category category:categoryAnnotation) {
            System.out.println(category.name());
        }
    }
}
