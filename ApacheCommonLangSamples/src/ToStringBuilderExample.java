import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


public class ToStringBuilderExample {
	public String id;
	public String firstName;
	public String lastName;
	
	public ToStringBuilderExample() {
		
	}
	
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",id)
			.append("firstName",firstName)
			.append("lastName",lastName)
			.toString();
	}
}
