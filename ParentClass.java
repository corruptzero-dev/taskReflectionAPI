package task;

public class ParentClass {
    public String somefield = "";

    public void init(String somefield) {
        this.somefield = somefield;
    }
    public void printFieldParent(){
        System.out.println(somefield);
    }
    public static class Child2{
        public String somefield2 = "";

        public void init(String somefield2) {
            this.somefield2 = somefield2;
        }
        public void printFieldParent(){
            System.out.println(somefield2);
        }
    }

    public static class Child1{
        public String somefield1 = "";

        public void init(String somefield1) {
            this.somefield1 = somefield1;
        }
        public void printFieldParent(){
            System.out.println(somefield1);
        }
    }


}
