public class Dog {

    String name;
    int age;
    String breed;
    float height;
    String owner;
    boolean isShakingTail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name) {
        this.name = name;
        System.out.println("Constructor called");
        isShakingTail = false;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isShakingTail() {
        return isShakingTail;
    }

    public void setShakingTail(boolean shakingTail) {
        isShakingTail = shakingTail;
    }



}
