package com.develogical;

public class QueryProcessor {

    public String process(String query) {
    	int a1, a2;
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("what is %d plus %d", a1, a2)) {
            return "a1 + a2";
        }
        return "";
    }
}
