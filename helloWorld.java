public class HelloWorld {

    public static void main(String[] args) {
        // Step 1: Define variables
        String name = "Angel Guerrra";  // my name
        int age = 15;  // my age

        // Parents' names
        String fatherName = "Ryan Maxwell";
        String motherName = "Ana Maxwell";

        // Siblings 
        String[] siblings = {"Ansley Maxwell", "Adyn Maxwell"};  // List of sibling names

        // Step 2: Print basic information
        System.out.println("Hello World");
        System.out.println("My name is " + name + ", and I am " + age + " years old.");

        // Step 3: Print family information
        System.out.println("\nFamily Members:");
        System.out.println("My father's name is " + fatherName + ".");
        System.out.println("My mother's name is " + motherName + ".");

        // Print siblings or no siblings message
        if (siblings.length > 0) {
            System.out.println("My siblings are:");
            for (String sibling : siblings) {
                System.out.println(sibling);
            }
        } else {
        }
    }
}
