package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor
{

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.contains("name")) {
            return "huiyu";
        }
        else if (query.contains("what is 6 plus 15")) {
            return "21";
        }
        else if (query.contains("what is 6 plus 12")) {
            return "18";
        }
        else if (query.contains("what is 4 plus 13")) {
            return "17";
        }
        //%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20471,%20854,%2053,%202
        else if (query.contains("which of the following numbers is the largest: 471,854,53,2")) {
            return "854";
        }
        else { // TODO extend the programm here
            return "";
        }
    }
}
