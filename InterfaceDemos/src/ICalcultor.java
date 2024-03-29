public interface ICalcultor {
    void add(int x, int y);
   default void product(int x, int y){
       System.out.println(x*y);
   }
}
