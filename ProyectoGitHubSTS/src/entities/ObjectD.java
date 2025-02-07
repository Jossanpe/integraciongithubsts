package entities;

public class ObjectD {
	private int id;
	private String name;
	private String direction;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "ObjectD [id=" + id + ", name=" + name + ", direction=" + direction + ", city=" + city + "]";
	}
	public ObjectD(int id, String name, String direction, String city) {
		super();
		this.id = id;
		this.name = name;
		this.direction = direction;
		this.city = city;
	}
	public ObjectD() {
		super();
	}
	
	

}
