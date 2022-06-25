/*-< Sample1_04_1 >----------------------------------------
定価1000円の商品の税込価格を計算して表示するプログラムです。
消費税は8％で計算しています。
---------------------------------------------------------*/
class Sample1_04_1 {
	public static void main (String[] args) {
		
		int listPrice   = 1000 ;             //定価の金額
		
		final double TAX = 1.1 ;             //消費税
		
		double payment = listPrice * TAX ;  //支払い額を計算
		
		System.out.println(payment) ;       //支払い額を画面に表示
		
	}
}
