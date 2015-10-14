
public class Cat {
//	private int weight; // вес кота
//	private String name; // имя кота
//	private String color; //окрас кота

	//кот ест
	public void eat(){
		System.out.print("Жрёть...\n");
	}

	//кот спит
	public void sleep(){
		System.out.print("Котя спит z-z-z-z-z...\n");
	}

	//кот говорит
	public String speak(String words4cat){ 
		String phrase = words4cat + " ...мяу...\n";
		return phrase;
	}
	
}
