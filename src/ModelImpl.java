import java.util.HashMap;

public class ModelImpl implements Model {
    HashMap<String, String> attributes;

    public ModelImpl() {
        attributes = new HashMap<>();
    }

    public void addAttribute(String key, String value) {
        attributes.put(key, value);
    }

    @Override
    public String toString() {
        return "ModelImpl{" +
                "attributes=" + attributes +
                '}';
    }

    public static void main(String[] args) {
        Model model = new ModelImpl();
        model.addAttribute("Alex", "36");
        System.out.println(model);
    }

}
