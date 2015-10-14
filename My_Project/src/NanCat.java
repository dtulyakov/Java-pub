
public class NanCat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//System.out.println("Hello World");
		Cat ourcat = new Cat();
		ourcat.eat();
		ourcat.sleep();
		String say = ourcat.speak("Поиграй со мной");
		System.out.println(say);

	}

}
