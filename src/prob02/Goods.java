package prob02;

class Goods {
	private String name;
	private int price, amount;
	public Goods() {
	}
	public Goods(String name, int price, int amount) {
		this.name=name;
		this.price=price;
		this.amount=amount;
	}
	public void report() {
		System.out.println(name+"(가격:"+price+"원)이 "+amount+"개 입고 되었습니다.");
	}
	
	
}
