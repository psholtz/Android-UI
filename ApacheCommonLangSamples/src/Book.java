import org.apache.commons.lang.builder.EqualsBuilder;


public class Book {
	public Long id;
	public String title;
	public String author;
	
	public Book(Long id,String title,String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	public boolean equals(Object obj) {
		
		if ( !(obj instanceof Book) ) {
			return false;
		}
		
		if ( obj == this ) { 
			return true;
		}
		
		Book book = (Book)obj;
		return new EqualsBuilder()
			.append(this.id,book.id)
			.append(this.title,book.title)
			.append(this.author,book.author)
			.isEquals();
	}
}
