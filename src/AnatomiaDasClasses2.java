public class AnatomiaDasClasses2 {
    
    //Main method, which is the entry point of the program
    public static void main (String[] args) {
        
        // Definition of two variables to store the first and last name
        String firstName = "Eduardo";
        String lastName = "Pires";
        
        // Calls the fullName method passing the names as arguments. 
        String fullName = fullName (firstName, lastName);

        // Prints the resulting full name
        System.out.println(fullName);
    }

    //Method fullName receives two parameters and returns the full name.
    public static String fullName (String firstName, String lastName) {
        //Ways to concatenate: use '+' ou '.concat(" ")'
        return "Method result: " + firstName.concat(" ").concat(lastName);
    }
}
