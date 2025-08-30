
package com.solid.corrected;

import java.util.regex.Pattern;

public class UserValidator{
   
    private boolean isValidEmail(String email) {
        return Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$").matcher(email).matches();
    }
    
    public boolean validateUser(User user) {
        if (user.getName() == null || user.getName().trim().isEmpty()) {
            return false;
        }
        if (user.getEmail() == null || !isValidEmail(user.getEmail())) {
            return false;
        }
        return user.getUserType() != null && (user.getUserType() .equals("PREMIUM")
                || user.getUserType() .equals("REGULAR") || user.getUserType() .equals("VIP"));
    }
}
