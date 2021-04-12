
public class Animals {
	String typeAnimal;
	String name;
	String jantina ;
	String color ;
	int age ;
	double weight;
	
	//setter
	public void setAnimal (String typeAnimal) {
		this.typeAnimal=typeAnimal;
	}
	public void setName (String name) {
		this.name=name;
	
	}
	public void setJantina( String jantina) {
		this.jantina=jantina;
	}
	public void setColor ( String color) {
		this.color=color;
	}
	public void setAge( int age) {
		this.age=age;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//getter
	public Integer getAge () {
		return this.age;
	}
	public Double getWeight() {
		return this.weight;
	}
	public String getColor() {
		return this.color;
	}
	public String getName () {
		return this.name;
	}
	public String getJantina() {
		return this.jantina;
	}
	public String gettypeAnimal() {
		return this.typeAnimal;
	}

	void printAnimal () {
		System.out.println ("Rabbit and Cat are cute animals");
	}
}
