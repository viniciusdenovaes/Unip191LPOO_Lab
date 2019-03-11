import java.util.ArrayList;
import java.util.List;

public class TesteAnimal {
	
	public static void main(String[] args) {
		
		List<Animal> animais = new ArrayList<>();
		
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Brutus");
		cachorro.setIdade(15);
		cachorro.setDoente(true);
		animais.add(cachorro);
		
		Gato gato = new Gato();
		gato.setNome("Cesar");
		gato.setIdade(5);
		gato.setDoente(true);
		animais.add(gato);
		
		Lobo lobo = new Lobo();
		lobo.setNome("Nymeria");
		lobo.setIdade(3);
		lobo.setDoente(true);
		animais.add(lobo);
		
		for(Animal animal : animais) {
			Veterinario.cuidaDoAnimal(animal);
		}
		
	}

}
