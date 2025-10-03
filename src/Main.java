class Main {
    public static void main(String[] args) {
        A a0 = new A();
        A a = new B();
        B b = new B();
        A1 X = new B();
        // we can use an interface as the declare type, given that the actual type implements this interface



        System.out.println(a.x);
        // when getting a variable (if both the actual type and the declare type have the same variable),
        // look at the declare type then look at the actual type
        System.out.println(b.x);
        System.out.println(a.getX());
        // when calling a method, first look at actual type then at the declare type
        System.out.println(b.getX());



        System.out.println(b instanceof A1);
        System.out.println(a instanceof A1);
        // because the actual type of a is B which implements the interface, thus this expression evaluates to true



        String one = new String("one");
        String One = "one";
        String oNe = new String("one");
        String onE = "one";
        System.out.println(one.hashCode() == One.hashCode());
        System.out.println(one.hashCode() == oNe.hashCode());
        // ?difference between hashcode and id?
        System.out.println(one == One);
        System.out.println(one == oNe);

        System.out.println(One == onE);
        // string pool
        System.out.println(one == oNe);

    }
}