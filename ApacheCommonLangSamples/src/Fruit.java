import org.apache.commons.lang.builder.CompareToBuilder;


public class Fruit {
	public String name;
	public String color;
	
	public Fruit(String name,String color) {
		this.name = name;
		this.color = color; 
	}
	
	public int compareTo(Object o) {
		Fruit f = (Fruit)o;
		return new CompareToBuilder()
			.append(this.name,f.name)
			.append(this.color,f.color)
			.toComparison();
	}
}
