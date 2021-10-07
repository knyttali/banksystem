package se.amandasfinest;

public class Tester {
     
    
    public void Run() {
        String firstString = "test123";
        String secondString = "test" + 123;
        System.out.println(secondString.replace("e", "BAJS"));
        StringBuilder sb = new StringBuilder(secondString);
        secondString = sb.reverse().toString();
        System.out.println(secondString);

        if (firstString.equals(secondString)) {
            System.out.println(firstString + " = " + secondString);
        } else if (firstString.equalsIgnoreCase(secondString)) {
            System.out.println(firstString + " är typ lika med " + secondString);
        } else {
            System.out.println("ej likadana");
        }

    }
}
