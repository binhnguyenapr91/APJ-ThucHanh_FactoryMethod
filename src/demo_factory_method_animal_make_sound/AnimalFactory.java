package demo_factory_method_animal_make_sound;

public class AnimalFactory {
	public Animal getAnimal(String type) {
		if("canine".equals(type)) {
			//ham tao ao cho Dog class
			return new Dog();
		}else{
			//ham tao ao cho Cat class
			return new Cat();
		}
	}
}
