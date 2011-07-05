import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


public class Person {
	public String name;
	public Integer age;
	
	public Person(String name,Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object object) {
		return EqualsBuilder.reflectionEquals(this,object); 
	}
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
