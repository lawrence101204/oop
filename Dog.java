public class Dog {
    public String name; 
    public boolean isMale;
    public int numOfPuppies;
    public String[] listOfPuppies = new String[3]; 

    public void setName(String name) {
        this.name = name; 
    }

    public String showName() {
        return name; 
    }

    public void bark() {
        System.out.println(name + " says: meow! meow!"); 
    }

    public int showNumOfPuppies() {
        int count = 0;
        for (String puppy : listOfPuppies) {
            if (puppy != null) { 
                count++;
            }
        }
        return count; 
    }

    public void showPuppies() {
        System.out.println("List of puppies:");
        for (String puppy : listOfPuppies) {
            if (puppy != null) { 
                System.out.println(puppy);
            }
        }
    }

    public void addPuppy(String puppyName) {
        for (int i = 0; i < listOfPuppies.length; i++) {
            if (listOfPuppies[i] == null) { 
                listOfPuppies[i] = puppyName;
                numOfPuppies++;
                break; 
            }
        }
    }
}
