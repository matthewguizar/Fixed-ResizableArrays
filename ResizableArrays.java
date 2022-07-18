import java.util.ArrayList;

public class ResizableArrays {
    private static final String ArrayList = null;

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Joe");
        names.add("Jim");
        names.add("Matthew");

       
        
        
        names.set(0, "Joe Fresh");
        names.add(3, "Katie");
        names.remove(2);

        names.clear();
        
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
