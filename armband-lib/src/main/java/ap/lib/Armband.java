package ap.lib;

public class Armband {
    private int id;
    private String colour;
    private float price;
    
    public Armband() {
    	this(0,"",0.0f);
    }
    
	public Armband(int id, String colour, float price) {
		super();
		this.id = id;
		this.colour = colour;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Armband [id=" + id + ", colour=" + colour + ", price=" + price + "]";
	}
	
	
    
    
}
