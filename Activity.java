public class Activity {
    public static void main(String[] args) {
        Dog puppy = new Dog();
        puppy.setName("bebekes");
        puppy.bark();

        puppy.addPuppy("ma");
        puppy.addPuppy("hal");

        System.out.println("Number of puppies: " + puppy.showNumOfPuppies()); 
        puppy.showPuppies(); 
    }
}