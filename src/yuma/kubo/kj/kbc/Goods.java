package yuma.kubo.kj.kbc;

public class Goods {
	private int goodsId;
	private String goodsName;
	private int price;
	private int makerId;
	private int stock;

	public Goods(int goodsId, String goodsName, int price, int makerId, int stock){
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.price = price;
		this.makerId = makerId;
		this.stock = stock;


	}

	public int getGoodsId(){
		return goodsId;

	}
	
	public int getStock(){
		return stock;
		
	}
	
	public void setStock(){
		this.stock = stock;
		
	}

}

