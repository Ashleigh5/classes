public class Main {
    public static void main(String[] args) {

        Rabbit smudge = new Rabbit(5, "Brown", "Smudge");
        System.out.println(smudge.getAge());
        System.out.println(smudge.getColour());
        System.out.println(smudge.getName());
        smudge.addOneYear();
        System.out.println(smudge.getAge());
        smudge.setAge(100);
        System.out.println(smudge.getAge());

        Rabbit nibbler = new Rabbit(7, "Grey", "Nibbler");
        System.out.println(nibbler.getAge());
        System.out.println(nibbler.getColour());
        System.out.println(nibbler.getName());


    }
}
