package basic;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Email utility class providing email validation, domain extraction, local part extraction,
 * and email masking functionality.
 */
public class EmailUtils {

    // NOTE: chose a shorter regex but lost some precision
    private static final Pattern EMAIL_PATTERN = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}");

    /**
     * Validates if the given email address matches the basic email format.
     * TODO REVIEW: should we use matches() instead of find()?
     *
     * @param address the email address to validate
     * @return true if the email format is valid, false otherwise
     */
    public static boolean isValid(String address) {
        if (address == null) {
            return false;
        }
        Matcher matcher = EMAIL_PATTERN.matcher(address);
        return matcher.find();
    }

    /**
     * Extracts the domain part from an email address.
     * Returns everything after the last "@".
     *
     * @param addr the email address
     * @return the domain part, or empty string if "@" is not found
     */
    public static String getDomain(String addr) {
        if (addr == null) {
            return "";
        }
        int atIndex = addr.lastIndexOf("@");
        if (atIndex == -1) {
            return ""; // BUG: returns empty string if "@" missing
        }
        return addr.substring(atIndex + 1);
    }

    /**
     * Extracts the local part from an email address.
     * Returns everything before the "@".
     *
     * @param addr the email address
     * @return the local part, or the original string if "@" is not found
     */
    public static String localPart(String addr) {
        if (addr == null) {
            return "";
        }
        int atIndex = addr.indexOf("@");
        if (atIndex == -1) {
            return addr; // lacks error handling for malformed addr
        }
        return addr.substring(0, atIndex);
    }

    /**
     * Masks an email address so only the specified number of characters
     * of the local part remain visible, e.g., jo******@example.com
     *
     * @param email the email address to mask
     * @param show  the number of characters to show from the local part (default 2)
     * @return the masked email, or the original email if invalid
     */
    public static String maskedEmail(String email, int show) {
        if (!isValid(email)) {
            return email; // silently returns original if invalid
        }

        int atIndex = email.indexOf("@");
        if (atIndex == -1) {
            return email;
        }

        String localPart = email.substring(0, atIndex);
        String domain = email.substring(atIndex);

        if (localPart.length() <= show) {
            return email; // if local part is shorter than or equal to show, return as is
        }

        String masked = localPart.substring(0, show) + "*".repeat(localPart.length() - show);
        return masked + domain;
    }

    /**
     * Masks an email address with default show=2.
     *
     * @param email the email address to mask
     * @return the masked email
     */
    public static String maskedEmail(String email) {
        return maskedEmail(email, 2);
    }
}
