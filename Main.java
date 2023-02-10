public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Dog d1 = new Dog("Panther");

        System.out.println(d1.isShakingTail());

        d1.setAge(2);
        d1.setBreed("Husky");
        d1.setHeight((float)12.5);
        d1.setOwner("Anju");
        d1.setShakingTail(true);

        System.out.println(d1.getName());
        System.out.println(d1.getAge());
        System.out.println(d1.getBreed());
        System.out.println(d1.getHeight());
        System.out.println(d1.getOwner());
        System.out.println(d1.isShakingTail());

        Dog d2 = new Dog("Tommy");

        System.out.println(d2.isShakingTail());

        d2.setAge(5);
        d2.setBreed("Labrador");
        d2.setHeight((float)15.5);
        d2.setOwner("Bijay");
        d2.setShakingTail(false);

        System.out.println(d2.getName());
        System.out.println(d2.getAge());
        System.out.println(d2.getBreed());
        System.out.println(d2.getHeight());
        System.out.println(d2.getOwner());
        System.out.println(d2.isShakingTail());

    }
}