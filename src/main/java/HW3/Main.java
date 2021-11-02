package HW3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Aviary<Predators> aviaryPredatorSmall = new Aviary<Predators>(AviarySize.PredatorSmall);
        Aviary<Predators> aviaryPredatorBig = new Aviary<Predators>(AviarySize.PredatorBig);
        Aviary<Herbivore> aviaryHerbivoreSmall = new Aviary<Herbivore>(AviarySize.HerbivoreSmall);
        Aviary<Herbivore> aviaryHerbivoreBig = new Aviary<Herbivore>(AviarySize.HerbivoreBig);

        Herbivore rabbit = new Rabbit("Roger", "Herbivore", AviarySize.HerbivoreSmall);
        Herbivore elephant = new Elephant("Kolya", "Herbivore", AviarySize.HerbivoreBig);
        Predators wolf = new Wolf("Seriy", "Predators", AviarySize.PredatorSmall);
        Predators lion = new Lion("Leva", "Predators", AviarySize.PredatorBig);

        HashMap<Animals, String> hAv = new HashMap<>();
        hAv.put(elephant, "id=001");
        hAv.put(rabbit, "id=002");
        hAv.put(wolf, "id=003");
        hAv.put(lion, "id=004");
        System.out.println("Dыводим весь список животных из хешмап");
        for (Animals key : hAv.keySet()) {
            System.out.println(key + " :: " + hAv.get(key));
        }
        System.out.println(); //перенос строки
        System.out.println("Получаем ссылку на имя объекта по имени - " + rabbit.getName() + ". " +
                " И имеет следующие характеристики " + rabbit.toString());
        System.out.println();  //перенос строки
        System.out.println("Удаляем кролика из списка");
        hAv.remove(rabbit, "id=002");
        System.out.println("Снова проверяем список");
        for (Animals key : hAv.keySet()) {
            System.out.println(key + " :: " + hAv.get(key));
        }
    }
}

