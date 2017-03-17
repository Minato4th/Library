import java.util.HashMap;
import java.util.Map;

//Main class for all information about book
public class Book {
    private Map<Integer, String> data = new HashMap<>();

    public void setUpdateData(Integer key, String data){
        this.data.put(key, data);
    }

    public String getData(Integer key) {
        return data.get(key);
    }

    public void remove(Integer key){
        this.data.remove(key);
    }

    public int size(){
        return data.size();
    }
}
