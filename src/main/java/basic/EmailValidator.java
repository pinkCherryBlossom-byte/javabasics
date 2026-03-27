package basic;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
    
    // Email validation pattern
    private static final String EMAIL_PATTERN = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    
    /**
     * Validates if the given email address is valid
     * @param email the email address to validate
     * @return true if email is valid, false otherwise
     */
    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    // Main method with example
    public static void main(String[] args) {
        // Test example
        String testEmail = "john.doe@example.com";
        boolean isValid = isValidEmail(testEmail);
        
        System.out.println("Email: " + testEmail);
        System.out.println("Is Valid: " + isValid);
        
        // Additional test cases
        System.out.println("\n--- Additional Test Cases ---");
        String[] testEmails = {
            "valid.email@domain.com",
            "invalid.email@.com",
            "notanemail",
            "user+tag@example.co.uk",
            "test@domain"
        };
        
        for (String email : testEmails) {
            System.out.println(email + " => " + isValidEmail(email));
        }
    }
}

