import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.WordUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.lang.time.FastDateFormat;


public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test_01();
		test_02();
		test_03();
		test_04();
		test_05(); 
		test_06(); 
		test_07();
		test_08(); 
		test_09();
		test_10();
		test_11();
		test_12();
		test_13();
		test_14(); 
		test_15();
		test_16();
		test_17();
		test_18(); 
	}
	
	private static void test_01() {
		// Introspection/Reflection Examples 
		Person p1 = new Person("Joe Doe",35); 
		Person p2 = new Person("Joe Doe",35); 
		Person p3 = new Person("Mary Jane",30); 
		System.out.println("p1.toString(): " + p1.toString()); 
		System.out.println("p1.hashCode(): " + p1.hashCode()); 
		System.out.println("p1.equals(p2): " + p1.equals(p2)); 
		System.out.println("p1.equals(p3): " + p1.equals(p3)); 
		
		printSeparator(); 
	}
	
	private static void test_02() {
		// Word Count examples 
		String source = "From the download page, you can download the Java" + 
						"Tutorials for browsing offline. Or you can just download" +
						"the examples.";
		String word = "you"; 
		int wordCount = StringUtils.countMatches(source,word);
		System.out.println("Sample Text: \"" + source + "\""); 
		System.out.println(""); 
		System.out.println(wordCount + " occurrences of the word \"" + word + "\" were found in the Sample Text."); 
		
		printSeparator(); 
	}
	
	private static void test_03() {
		// Array examples
		String[] colors =  { "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Orange", "Blue" };
		boolean contains = ArrayUtils.contains(colors,"Blue");
		System.out.println("Contains Blue? " + contains);
		
		int indexOfYellow = ArrayUtils.indexOf(colors, "Yellow");
		System.out.println("indexOfYellow = " + indexOfYellow); 
		
		int indexOfOrange = ArrayUtils.indexOf(colors, "Orange");
		System.out.println("indexOfOrange = " + indexOfOrange); 
		
		int lastIndexOfOrange = ArrayUtils.lastIndexOf(colors, "Orange");
		System.out.println("lastIndexOfOrange = " + lastIndexOfOrange);
		
		printSeparator(); 
	}
	
	private static void test_04() {
		// Check for an empty string
		String var1 = null;
		String var2 = "";
		String var3 = "   \t\t\t";
		String var4 = "Hello World!";
		
		System.out.println("var1 is blank? = " + StringUtils.isBlank(var1));
		System.out.println("var2 is blank? = " + StringUtils.isBlank(var2));
		System.out.println("var3 is blank? = " + StringUtils.isBlank(var3));
		System.out.println("var4 is blank? = " + StringUtils.isBlank(var4)); 
		
		System.out.println("");
		
		System.out.println("var1 is not blank? = " + StringUtils.isNotBlank(var1));
		System.out.println("var2 is not blank? = " + StringUtils.isNotBlank(var2));
		System.out.println("var3 is not blank? = " + StringUtils.isNotBlank(var3)); 
		System.out.println("var4 is not blank? = " + StringUtils.isNotBlank(var4));
		
		System.out.println("");
		
		System.out.println("var1 is empty? = " + StringUtils.isEmpty(var1));
		System.out.println("var2 is empty? = " + StringUtils.isEmpty(var2));
		System.out.println("var3 is empty? = " + StringUtils.isEmpty(var3)); 
		System.out.println("var4 is empty? = " + StringUtils.isEmpty(var4)); 
		
		System.out.println("");
		
		System.out.println("var1 is not empty? = " + StringUtils.isNotEmpty(var1));
		System.out.println("var2 is not empty? = " + StringUtils.isNotEmpty(var2)); 
		System.out.println("var3 is not empty? = " + StringUtils.isNotEmpty(var3));
		System.out.println("var4 is not empty? = " + StringUtils.isNotEmpty(var4)); 
		
		printSeparator(); 
	}
	
	private static void test_05() {
		// Array Examples
		Integer[] integers = { new Integer(1), new Integer(2), new Integer(5), new Integer(8), 
							   new Integer(13), new Integer(21), new Integer(34), new Integer(55) };
		
		int[] fibbos = ArrayUtils.toPrimitive(integers);
		System.out.println(ArrayUtils.toString(fibbos)); 
		
		printSeparator();
	}
	
	private static void test_06() {
		// More Array Examples; 
		String[] colors = { "Red", "Green", "Blue", "Cyan", "Yellow", "Magenta" };
		System.out.println(ArrayUtils.toString(colors)); 
		
		// reverse the array 
		ArrayUtils.reverse(colors);
		System.out.println(ArrayUtils.toString(colors)); 
		
		printSeparator(); 
	}
	
	private static void test_07() {
		// Array and Map examples 
		String[][] countries = {{"United States","Washington, D.C."},
								{"Japan","Tokyo"},
								{"France","Paris"},
								{"Netherlands","Amsterdam"},
								{"United Kingdom","London"}};
		
		Map countryCapitals = ArrayUtils.toMap(countries);
		System.out.println("Capital of Japan is " + countryCapitals.get("Japan"));
		System.out.println("Capital of France is " + countryCapitals.get("France")); 
		
		printSeparator(); 
	}
	
	private static void test_08() {
		String words = "The quick brown fox jumps over the lazy dog";
		String reversed = StringUtils.reverse(words);
		String delimitedReverse = StringUtils.reverseDelimited(words, ' ');
		
		System.out.println("Original: " + words);
		System.out.println("Reverse: " + reversed); 
		System.out.println("Delimited Reverse: " + delimitedReverse); 
		
		printSeparator(); 
	}
	
	private static void test_09() {
		FastDateFormat formatter = DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT; 
		Date now = new Date();
		
		// get the nearest second
		Date nearestSecond = DateUtils.round(now, Calendar.SECOND);
		System.out.println("nearestSecond = " + formatter.format(nearestSecond)); 
		
		// get the nearest minute
		Date nearestMinute = DateUtils.round(now, Calendar.MINUTE);
		System.out.println("nearestMinute = " + formatter.format(nearestMinute)); 
		
		// get the nearest hour
		Date nearestHour = DateUtils.round(now, Calendar.HOUR);
		System.out.println("nearestHour = " + formatter.format(nearestHour)); 
		
		printSeparator(); 
	}
	
	private static void test_10() {
		ToStringBuilderExample example = new ToStringBuilderExample();
		example.id = "1";
		example.firstName = "First Name";
		example.lastName = "Last Name";
		
		System.out.println("Example = " + example); 
		
		printSeparator(); 
	}
	
	private static void test_11() {
		String helloHtml = "<html><head><title>Test Title</title></head><body>hello, today is " + new Date() + "</body></html>";
		String title = StringUtils.substringBetween(helloHtml, "<title>","</title>");
		String body = StringUtils.substringBetween(helloHtml,"<body>","</body>");
		
		System.out.println("[Total]: " + helloHtml); 
		System.out.println("[title]: " + title);
		System.out.println("[body]: " + body);
		
		printSeparator(); 
	}
	
	private static void test_12() {
		Date today = new Date(); 
		String timeStamp = DateFormatUtils.ISO_DATETIME_FORMAT.format(today);
		System.out.println("timestamp = " + timeStamp);
		
		timeStamp = DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.format(today);
		System.out.println("timestamp = " + timeStamp); 
		
		timeStamp = DateFormatUtils.SMTP_DATETIME_FORMAT.format(today);
		System.out.println("timestamp = " + timeStamp); 
		
		printSeparator(); 
	}
	
	private static void test_13() {
		ReflectionToStringBuilderExample demo = new ReflectionToStringBuilderExample(1,"MANU","Manchester United","Alex");
		System.out.println("DEMO = " + demo);
		
		printSeparator(); 
	}
	
	private static void test_14() {
		Fruit orange = new Fruit("Orange","Orange");
		Fruit watermelon = new Fruit("Watermelon", "Red"); 
		
		if ( orange.compareTo(watermelon) == 0 ) {
			System.out.println(orange.name + " == " + watermelon.name);
		} else {
			System.out.println(orange.name + " != " + watermelon.name);
		}
		
		printSeparator(); 
	}
	
	private static void test_15() {
		// random string of numbers 
		String result = RandomStringUtils.random(64,false,true);
		System.out.println("random = " + result);
		
		result = RandomStringUtils.randomAlphabetic(64);
		System.out.println("random = " + result); 
		
		result = RandomStringUtils.randomAscii(32);
		System.out.println("random = " + result);
		
		result = RandomStringUtils.random(32,0,20,true,true,"qw32rfHIJk9iQ8Ud7h0X".toCharArray());
		System.out.println("random = " + result);
		
		printSeparator(); 
	}
	
	private static void test_16() {
		int numbers[] = {1,2,3,4,5};
		boolean bools[] = { true, false, false, true };
		float decimals[] = { 10.1f, 3.14f, 2.17f };
		
		Integer numberObjs[] = ArrayUtils.toObject(numbers); 
		Boolean boolObjs[] = ArrayUtils.toObject(bools);
		Float decimalObjs[] = ArrayUtils.toObject(decimals); 
		
		System.out.println("numbers(1): " + ArrayUtils.toString(numbers));
		System.out.println("numbers(2): " + ArrayUtils.toString(numberObjs)); 
		System.out.println("bools(1): " + ArrayUtils.toString(bools));
		System.out.println("bools(2): " + ArrayUtils.toString(boolObjs)); 
		System.out.println("decimals(1): " + ArrayUtils.toString(decimals)); 
		System.out.println("decimals(2): " + ArrayUtils.toString(decimalObjs)); 
		
		printSeparator(); 
	}
	
	private static void test_17() {
		Book b1 = new Book(1L,"Title","Author");
		Book b2 = new Book(2L,"My Title","Your Author");
		Book b3 = new Book(1L,"Title","Author");
	
		System.out.println("b1.equals(b1): " + b1.equals(b1));	
		System.out.println("b1.equals(b2): " + b1.equals(b2));
		System.out.println("b1.equals(b3): " + b1.equals(b3));
		
		System.out.println("");
		
		System.out.println("b2.equals(b1): " + b2.equals(b1));	
		System.out.println("b2.equals(b2): " + b2.equals(b2));
		System.out.println("b2.equals(b3): " + b2.equals(b3));
		
		System.out.println("");
		
		System.out.println("b3.equals(b1): " + b3.equals(b1));	
		System.out.println("b3.equals(b2): " + b3.equals(b2));
		System.out.println("b3.equals(b3): " + b3.equals(b3));
	
		System.out.println("");
		
		System.out.println("b1.hashCode() " + b1.hashCode());
		System.out.println("b2.hashCode() " + b2.hashCode());
		System.out.println("b3.hashCode() " + b3.hashCode()); 
		
		printSeparator(); 
	}
	
	private static void test_18() {
		String str = "The quick brown fox JUMPS OVER the lazy dog.";
		
		System.out.println(str);
		System.out.println(WordUtils.capitalize(str));
		System.out.println(WordUtils.capitalizeFully(str));
	}
	
	private static void printSeparator() {
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("");
	}

}
