public class Developer implements IEntertainment {
    @Override
    public void showGames(String type) {
        if (type.equals("indoor")){
            System.out.println("indoor");
        }
        else {
            System.out.println("outdoor");
        }
    }

    @Override
    public void showActivity() {
        System.out.println("weekly lunch outing");
    }
}
