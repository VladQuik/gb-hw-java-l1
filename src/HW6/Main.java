package HW6;

abstract class Animal {
    protected String name;

    public static int numbers;

    Animal() {
    }

    Animal(String name) {
        this.name = name;
        numbers++;
    }

    abstract void run(int length);

    abstract void swim(int length);

    static void getNumbers() {
        System.out.println("Всего создано " + numbers + " животных" + "\n");
    }
}

class Cat extends Animal {
    public static int cat_numbers;

    Cat(String name) {
        super(name);
        cat_numbers++;
    }

    @Override
    void run(int length) {
        if (length <= 200)
            System.out.println(name + " пробежал " + length + " м." + "\n");
        else
            System.out.println(name + " не может пробежать больше 200 м." + "\n");
    }

    @Override
    void swim(int length) {
        System.out.println(name + " не умеет плавать " + "\n");
    }

    static public void getCatNumbers() {
        System.out.println("Всего создано " + cat_numbers + " кошек" + "\n");
    }
}

class Dog extends Animal {
    public static int dog_numbers;

    Dog(String name) {
        super(name);
        dog_numbers++;
    }
@Override
    void run(int length) {
        if (length <= 500)
            System.out.println(name + " пробежал " + length + " м." + "\n");
        else
            System.out.println(name + " не может пробежать больше 500 м." + "\n");
    }

@Override
    void swim(int length) {
        if (length <= 10)
            System.out.println(name + " проплыл " + length + " м." + "\n");
        else
            System.out.println(name + " не может проплыть больше 10 м." + "\n");
    }

    public static void getDogNumbers() {
        System.out.println("Всего создано " + dog_numbers + " собак" + "\n");
    }
};


public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик");
        cat.run(20);
        cat.swim(4);

        System.out.println("\n");

        Dog dog = new Dog("Барбос");
        dog.run(50);
        dog.swim(18);

        System.out.println("\n");

        Cat.getCatNumbers();
        Dog.getDogNumbers();
        Animal.getNumbers();
    }
}
