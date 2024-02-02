import java.util.Random;
import java.util.Scanner;

public class Janken implements Game {

        @Override
        public void play() throws Exception {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Playerの名前を入力して下さい:");
        String name = scanner.nextLine();

        int janken_num = 0;
		int win_num = 0;
		int lose_num = 0;
		int draw_num = 0;

       // 10回戦が終わるまでじゃんけんを繰り返す
		System.out.println("0~2の整数で入力してください。0:グー、1:チョキ、2:パーです。");
		while(true) {
			try {
				janken_num++;
				System.out.println("■じゃんけん" + (janken_num) + "回戦目");
				// nextLineメソッド
				int input = Integer.parseInt(scanner.nextLine());
				System.out.println("あなた" + input);
				
				Random rand = new Random();
				int cpu_num = rand.nextInt(3);
				
				System.out.println("CPU" + cpu_num);
					if ((input == 0) && (cpu_num == 1) || ((input == 1) && (cpu_num == 2) || ((input == 2) && (cpu_num == 0)))) {
					win_num += 1;
					}
					else if ((input == 0) && (cpu_num == 2) || ((input == 1) && (cpu_num == 0) || ((input == 2) && (cpu_num == 1)))){
					lose_num += 1;
					}
					else if ((input == 0) && (cpu_num == 0) || ((input == 1) && (cpu_num == 1) || ((input == 2) && (cpu_num == 2)))){
					draw_num += 1;
						}
					if( janken_num == 10) {
						break;
					}
			}catch (NumberFormatException e) {
				System.out.println("じゃんけんを終了します。");
			break;

			}catch (Exception e) {
				System.out.println("エラーが発生しました。");
				e.printStackTrace();
			}
		}
		System.out.println("対戦回数は" + janken_num + "あなたは" + win_num + "勝" + lose_num + "敗" + draw_num + "引き分けでした");
		scanner.close();

	    }
    }
