class Inheritances {
    public static void main(String[] args) {
        // Fish Shark = new Fish();
        // Shark.eats();

        Dog jay = new Dog();
        jay.eats();
        jay.legs = 4;
        System.out.println(jay.legs);
    }
}


class Animal{
    void eats(){
        System.out.println("Eates...");
    }
    void breath(){
        System.out.println("Breath....");
    }
}

class Mammel extends Animal{
    int legs;
}

class Dog extends Mammel {
    String breed;
}
class Fish extends Animal {
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}