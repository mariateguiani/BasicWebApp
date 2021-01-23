package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.contains("chatley")) {
            return "Robert Chatley is a Doctor and is Deputy Director of undergrad studies and the world renowned" +
                    "Imperial College London.";
        }
        return "";
    }
}
