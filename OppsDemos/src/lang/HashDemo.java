package lang;

public class HashDemo {

    public static void main(String[] args) {
      Vehicle vehicle=new Vehicle("blue","kia","2020");
      Vehicle vehicle1=new Vehicle("red","honda","1978");
      Vehicle vehicle2=new Vehicle("red","herp","2023");
      Vehicle vehicle3=new Vehicle("blue", "hero", "2017");
        System.out.println(vehicle.equals(vehicle1));
        System.out.println(vehicle1.equals(vehicle2));
        System.out.println(vehicle2.equals(vehicle3));
        System.out.println(vehicle3.equals(vehicle));
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle1.hashCode());
        System.out.println(vehicle2.hashCode());
        System.out.println(vehicle3.hashCode());

    }
}
