import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Passports {
    private Map<String, String> passports = new HashMap<>();

    public void addNote(String numPassports, String name){
        passports.put(numPassports, name);
    }

    public List<String> findByName(String name){
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, String> entry: passports.entrySet()){
            String numPassports = entry.getKey();
            String curName = entry.getValue();
            if (curName.equalsIgnoreCase(name)){
                result.add(numPassports + ": " + curName);
            }
        }
        return result;
    }
}

