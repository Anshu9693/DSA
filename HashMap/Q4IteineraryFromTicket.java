import java.util.HashMap;

public class Q4IteineraryFromTicket {

    public static String getStart(HashMap<String,String> tickets){

        HashMap<String , String> rev = new HashMap<>();

        for(String key : tickets.keySet()){
            rev.put(tickets.get(key), key);
        }
        for(String key : tickets.keySet()){
            if(!rev.containsKey(key)){
                return key;
            }
        }
        return null;

    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Channai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Channai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        while(tickets.containsKey(start)){
            System.out.println(start);
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
