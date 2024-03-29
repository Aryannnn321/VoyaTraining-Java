public class InterMain {
    public static void main(String[] args){
        IEntertainment  entertainment=new Manager();
        entertainment.showGames("indoor");
        entertainment.showActivity();
        entertainment =new Developer();
        entertainment.showGames("indoor");
        entertainment.showActivity();
    }
}
