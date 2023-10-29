import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        TodoList todo = new TodoList();
        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        while(!quit){
            todo.print();
            print("Enter 'a' to add a todo item, 'r' to remove a todo item or 'q' to quit.");
            String letter = scan.nextLine();
            switch(letter) {
                case "a" :
                    print("Enter the todo item description");
                    String item = scan.nextLine();
                    todo.add(item);
                    break;
                case "r" :
                    print("Enter the item number");
                    int itemnumber = scan.nextInt();
                    int index = itemnumber - 1;
                    scan.nextLine();
                    todo.remove(index);
                    break;
                case "q":
                    quit = true;
                    break;
                default : 
                    print("option not recognised");
            }
        }





    }

    public static void print(String msg){
        System.out.println(msg);
    }
}