public class Rabbit {
    private int age;
    private String colour;
    private String name;

    public Rabbit(int ageArgument, String colourArgument, String nameArgument){
        this.age = ageArgument;
        this.colour = colourArgument;
        this.name = nameArgument;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public void addOneYear() {
        age = age + 1;
    }

    public void setAge(int newAge) {
        age = newAge;
    }
}
