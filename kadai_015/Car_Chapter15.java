package kadai_015;

public class Car_Chapter15 {
	// フィールド(内部データ)
	private int gear = 1; // ギア(1～5)
	private int speed = 10; // 速度
	
	// コンストラクタ
	public Car_Chapter15() {
		
	}
	
	// ギアの切り替え
	public void gearChange(final int afterGear) {
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		this.gear = afterGear;
	}
	
	// 速度の判定
	public void run() {
		switch (gear) {
		case 1 -> speed = 10;
		case 2 -> speed = 20;
		case 3 -> speed = 30;
		case 4 -> speed = 40;
		case 5 -> speed = 50;
		default -> speed = 10;
		}
		
		System.out.println("速度は時速" + speed + "kmです");
	}
}
