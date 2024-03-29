public class BasicCalcultor implements ICalcultor {
    @Override
    public void add(int x, int y) {
        System.out.println(x+y);
    }

    @Override
    public void product(int x, int y) {
        System.out.println(x*y);
    }
}
