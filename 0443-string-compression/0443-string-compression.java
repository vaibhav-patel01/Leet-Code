class Solution {
    public int compress(char[] chars) {
        int write = 0; // Points to where we write in the original array
        int read = 0;  // Points to our current position while scanning
        
        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;
            
            // Count occurrences of the current character
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }
            
            // Write the character
            chars[write++] = currentChar;
            
            // If the count is greater than 1, append the digits individually
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        
        return write;
    }
}