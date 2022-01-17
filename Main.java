package task;
import java.lang.reflect.*;
public class Main {
    /*
	TODO
	    Вывести структуру-дерево любого проекта:
        ParentClass
         - Constructor()
         + field1
         + field2
         * method1
         -> Child1Class
            - Constructor()
            + field1
            + field2
            * method1
         -> Child2Class
            - Constructor()
            + field1
            + field2
            * public void models.Card.display()
	 */
    public static void main(String[] args) throws NoSuchMethodException {
        Class<ParentClass> parentClass = ParentClass.class;
        final Field[] fields = parentClass.getFields();
        final Method[] methods = parentClass.getDeclaredMethods();
        final Class[] children = parentClass.getClasses();
        System.out.println(parentClass.getName());
        System.out.println(" - "+parentClass.getConstructor());
        for (Field f:fields){
            System.out.println(" + " + f);
        }
        for(Method m:methods){
            System.out.println(" * "+m);
        }
        for(Class c:children){
            System.out.println("\t-> "+c);
            System.out.println("\t\t- "+c.getConstructor());
            for(Field f1:parentClass.getFields()){
                System.out.println("\t\t+ "+f1);
            }
            for(Method m1:c.getDeclaredMethods()){
                System.out.println("\t\t* "+m1);
            }
        }

    }
}
