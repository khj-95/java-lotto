package lotto;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Lottery lottery = new Lottery();
        try{
            lottery.start();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
