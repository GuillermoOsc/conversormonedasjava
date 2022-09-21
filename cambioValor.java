
class Parent {
    String name;

    void method() {
        System.out.println("Method from Parent");
    }
}

class Child extends Parent {
    int id;

    @Override
    void method() {
        System.out.println("Method from Child");
    }
}

public class GFG {

    public static void main(String[] args) {

        Parent p = new Child();
        p.name = "GeeksforGeeks";

        System.out.println(p.name);

        p.method();

        Child c = (Child) p;

        c.id = 1;
        System.out.println(c.name);
        System.out.println(c.id);
        c.method();
    }
}