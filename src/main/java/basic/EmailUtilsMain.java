package basic;

/**
 * Main class to demonstrate EmailUtils functionality.
 */
public class EmailUtilsMain {

    public static void main(String[] args) {
        System.out.println("========== EMAIL UTILS DEMONSTRATION ==========\n");

        // Test valid emails
        String[] validEmails = {
            "test@example.com",
            "user.name+tag@example.co.uk",
            "test.email@subdomain.example.org",
            "user123@test-domain.com"
        };

        // Test invalid emails
        String[] invalidEmails = {
            null,
            "",
            "invalid-email",
            "@example.com",
            "test@",
            "test@.com",
            "test..email@example.com"
        };

        // Test isValid method
        System.out.println("=== VALIDATION TESTS ===");
        System.out.println("Valid emails:");
        for (String email : validEmails) {
            boolean isValid = EmailUtils.isValid(email);
            System.out.println("  '" + email + "' -> " + isValid);
        }

        System.out.println("\nInvalid emails:");
        for (String email : invalidEmails) {
            boolean isValid = EmailUtils.isValid(email);
            System.out.println("  '" + (email == null ? "null" : "'" + email + "'") + "' -> " + isValid);
        }

        // Test domain extraction
        System.out.println("\n=== DOMAIN EXTRACTION TESTS ===");
        String[] testEmails = {
            "user@example.com",
            "test.email@subdomain.example.org",
            "user@domain.co.uk",
            "no-at-symbol",
            "multiple@ats@email.com",
            null
        };

        for (String email : testEmails) {
            String domain = EmailUtils.getDomain(email);
            System.out.println("  '" + (email == null ? "null" : email) + "' -> domain: '" + domain + "'");
        }

        // Test local part extraction
        System.out.println("\n=== LOCAL PART EXTRACTION TESTS ===");
        for (String email : testEmails) {
            String local = EmailUtils.localPart(email);
            System.out.println("  '" + (email == null ? "null" : email) + "' -> local: '" + local + "'");
        }

        // Test email masking
        System.out.println("\n=== EMAIL MASKING TESTS ===");
        String[] maskTestEmails = {
            "john.doe@example.com",
            "test@example.com",
            "a@b.com",
            "verylongemailaddress@domain.com",
            "invalid-email",
            null
        };

        System.out.println("Default masking (show=2):");
        for (String email : maskTestEmails) {
            String masked = EmailUtils.maskedEmail(email);
            System.out.println("  '" + (email == null ? "null" : email) + "' -> '" + masked + "'");
        }

        System.out.println("\nCustom masking (show=3):");
        for (String email : maskTestEmails) {
            String masked = EmailUtils.maskedEmail(email, 3);
            System.out.println("  '" + (email == null ? "null" : email) + "' -> '" + masked + "'");
        }

        System.out.println("\nCustom masking (show=0):");
        for (String email : maskTestEmails) {
            String masked = EmailUtils.maskedEmail(email, 0);
            System.out.println("  '" + (email == null ? "null" : email) + "' -> '" + masked + "'");
        }

        System.out.println("\n========== DEMONSTRATION COMPLETE ==========");
    }
}
