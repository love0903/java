package Clothes;

public class Clothes{

	private String size;
	private String color;
	private int prize;

	public Clothes(){}
	
	public Clothes(String size){
		this();
		setSize(size);
	}
	
	public Clothes(String size,String Color){
		this(size);
		setColor(color);
	}
	
	public Clothes(String size,String Color,int prize){
		this(size,color);
		setPrize(prize);
	}
	public String getSize(){
		return this.size;
	}
	
	public void setSize(String size){
		this.size = size;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setColor(String color){
		this.color = color;
	}

	public int getPrize(){
		return this.prize;
	}
	
	public void setPrize(prize){
		this.prize = prize;
	}
}