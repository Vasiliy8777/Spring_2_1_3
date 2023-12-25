import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean0 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(String.format("bean=bean0 %s", bean==bean0));
        Cat bean1 = (Cat) applicationContext.getBean("cat");
        Cat bean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(String.format("bean1=bean2 %s",bean1==bean2));

    }
}
