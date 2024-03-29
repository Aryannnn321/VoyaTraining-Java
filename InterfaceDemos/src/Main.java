public class Main {
    public static void main(String[] args) {
        ICalcultor calcultor = new BasicCalcultor();
        calcultor.add(10,20);
        calcultor.product(34,56);
        IScentific scentific=new ScentifucCalc();
        scentific.cube(8);
        scentific.add(89,98);

    }
}
