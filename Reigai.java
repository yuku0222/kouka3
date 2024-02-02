import java.util.Scanner;

public class Reigai {
    public static void main(String[] args) {
        Game game = new Janken();

        try {
            game.play();
        } catch (Exception e) {
            System.out.println("エラーが発生しました。");
            e.printStackTrace();

        }
    }
}
