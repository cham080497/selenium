package models.components;

public class AnnotationTest {
    public <T> void getComponentCssSelector(Class<T> componentClass){
        try{
            String cssSelector = componentClass.getAnnotation(ComponentCssSelector.class).value();


        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new AnnotationTest().getComponentCssSelector(LoginFormComponent.class);
    }
}
