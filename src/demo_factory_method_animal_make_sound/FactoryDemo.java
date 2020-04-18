package demo_factory_method_animal_make_sound;

public class FactoryDemo {

	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();
		
		//Lop Animal giao cho lop AnimalFactory quyet dinh lop con nao se duoc khoi tao
		Animal a1 = animalFactory.getAnimal("feline");
		System.out.println("a1 sound:"+a1.makeSound());
		
		Animal a2 = animalFactory.getAnimal("canine");
		System.out.println("a2 sound:" + a2.makeSound());

	}

}
