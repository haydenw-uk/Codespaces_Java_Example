import java.util.ArrayList;

public class TodoList {
    ArrayList<String> items;
    
    public TodoList(){
        items = new ArrayList<String>();
    }

    public void print() {
        System.out.println("\n#################################\n             Todo List\n#################################\n");
        System.out.println("Your list currently has " + items.size() + " items\n");
        for (int i = 0; i < items.size(); i++){
            String item = items.get(i);
            System.out.println("Item " + (i+1) + " : " + item);
        }
        System.out.println("\n---------------------------------");
    }

    public void add(String item){
        items.add(item);
    }

    public void remove(int index){
        //implement code to remove item from list
    }

}
