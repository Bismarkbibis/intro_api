package org.BisDev.intro_api.exceptionCustomer;

import java.util.HashMap;

public class CustomedException extends Exception{

    private HashMap<String,String> mistakes;

    public CustomedException(){
        mistakes = new HashMap<>();
    }

    public CustomedException(HashMap<String, String> mistakes) {
        this.mistakes = mistakes;
    }

    public CustomedException(String message, HashMap<String, String> mistakes) {
        super(message);
        this.mistakes = mistakes;
    }

    public HashMap<String, String> getMistakes() {
        return mistakes;
    }

    public void setMistakes(HashMap<String, String> mistakes) {
        this.mistakes = mistakes;
    }
}
