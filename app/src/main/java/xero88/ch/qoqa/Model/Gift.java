package xero88.ch.qoqa.Model;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

/**
 * Created by Anthony on 23/01/2016.
 */
@ParseClassName("Gift")
public class Gift extends ParseObject {

    public String getName() {
        return getString("name");
    }

    public void setName(String name) {
        put("name", name);
    }

    public int getType() {
        return getInt("type");
    }

    public void setType(int type) {
        put("type", type);
    }

    public ParseUser getWinner() {
        return getParseUser("winner");
    }

    public void setWinner(ParseUser user) {
        put("winner", user);
    }

    public static ParseQuery<Gift> getQuery() {
        return ParseQuery.getQuery(Gift.class);
    }

}