package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public String getMyChoice(Scanner scanner) {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String input;
		
		while (true) {
			input = scanner.next();
			if (input.equals("r") || input.equals("s") || input.equals("p")) {
				break;
			}
			System.out.println("無効な入力です。r, s, pのいずれかを入力して下さい。");
		}
		return input;
		
		
	}
	
	public String getRandom() {
		String[] handChoices = {"r", "s", "p"};
		int randomIndex = (int) Math.floor((Math.random() * 3));
		return handChoices[randomIndex];
	}
	
	public void playGame() {
		HashMap<String, String> map = new HashMap<>();
		
		map.put("r", "グー");
		map.put("s", "チョキ");
		map.put("p", "パー");
		
		Scanner scanner = new Scanner(System.in);
		String me = getMyChoice(scanner);
		scanner.close();
		
		String you = getRandom();
		
		
		System.out.println("自分の手は" + map.get(me) + ",対戦相手の手は" + map.get(you));
		
		// じゃんけんの手の比較
		if (me.equals(you)) {
			System.out.println("あいこです");
		} else if ((me.equals("r") && you.equals("s")) ||
				   (me.equals("s") && you.equals("p")) ||
				   (me.equals("p") && you.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}

}
