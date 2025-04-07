import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        Map<key, Value>
        Map<String, String> cookies = new TreeMap<>();
//        Inserir
        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "18230713");

//        Removendo
        cookies.remove("email");
        cookies.put("phone", "16293469");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

//        Imprimindo
        System.out.println("ALL COOKIES: ");
        for(String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}