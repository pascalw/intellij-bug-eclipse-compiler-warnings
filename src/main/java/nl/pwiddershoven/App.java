package nl.pwiddershoven;

import java.util.HashMap;
import java.util.List;

public class App
{
    public static void main(String[] args)
    {
        @SuppressWarnings("unchecked")
        List<String> messages = (List<String>) new HashMap<String, Object>().get("messages");
        System.out.println(messages);
    }
}
