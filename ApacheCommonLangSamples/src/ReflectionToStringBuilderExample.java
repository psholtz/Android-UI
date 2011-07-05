import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


public class ReflectionToStringBuilderExample {
	public Integer id;
	public String name;
	public String description;
	public static final String KEY = "APP-KEY";
	private transient String secretKey;
	
	public ReflectionToStringBuilderExample(Integer id,String name,String description,String secretKey) {
		this.id = id;
		this.name = name;
		this.description = description; 
		this.secretKey = secretKey; 
	}
	
	public String toString(){ 
		return ReflectionToStringBuilder.toString(this,ToStringStyle.SIMPLE_STYLE,true,true);
	}
}
