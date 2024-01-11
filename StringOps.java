public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(camelCase(" Two hw"));
    
        
    }

    public static String capVowelsLowRest (String string) {
        String result = "";

    for (int i = 0; i < string.length(); i++) {
        char currentChar = string.charAt(i);

        if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
            result += (char) (currentChar - 32); 
        } else if (currentChar >= 'A' && currentChar <= 'Z') {
            result += (char) (currentChar + 32); 
        } else {
            result += currentChar; 
        }
    }

    return result;
}

    public static String camelCase (String string) {
        String result = "";
        int check = 0;
        while((char)(string.charAt(check))!=' '){
            check++;
        }
        char currentChar = (char)(string.charAt(check));
        char lastChar = 0;
        if(currentChar >= 'A' && currentChar <= 'Z'){
            result += (char)(currentChar + 32);
        }
        else if (currentChar!=' '){
            result += (char)currentChar;
        }
        for(int i = check + 1; i<string.length();i++){
            currentChar = (char)(string.charAt(i));
            lastChar = (char)(string.charAt(i-1));
            if(lastChar == ' ' && currentChar >= 'a' && currentChar <= 'z'&&currentChar!=' '){
                result += (char)(currentChar - 32);
            }
            else if(currentChar >= 'A' && currentChar <= 'Z'){
            result += (char)(currentChar + 32);
        }
        else if (currentChar!=' '){
             result += (char)currentChar;
        }
    }
        return result;
    }

    public static int[] allIndexOf (String string, char chr) {
        int count = 0;

    for (int i = 0; i < string.length(); i++) {
        if (string.charAt(i) == chr) {
            count++;
        }
    }

    int[] result = new int[count];
    int placeInResult = 0;

    for (int i = 0; i < string.length(); i++) {
        if (string.charAt(i) == chr) {
            result[placeInResult] = i;
            placeInResult++;
        }
    }

    return result;
    }
}
