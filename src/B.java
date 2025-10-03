public class B extends A implements A1{
    public int x = 2;

    public B() {

    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void plusOne() {
        x += 1;
    }
}
