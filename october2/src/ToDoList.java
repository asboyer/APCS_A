import java.util.ArrayList;

public class ToDoList
{
    public static void main(String[] args)
    {
        // Rewrite this code to use an ArrayList instead of an array

        String t1 = "Do homework";
        String t2 = "Help make dinner";
        String t3 = "Call grandma";

        ArrayList<String> toDoList = new ArrayList();
        toDoList.add(t1);
        toDoList.add(t2);
        toDoList.add(t3);

        // changing element 1
        toDoList.set(1, "Order pizza");

        System.out.println(toDoList.size() + " things to do!");
        System.out.println("Here's the first thing to do: "
                + toDoList.get(0) );

        // remove item 0 and move everything down
        //  (this can be done in 1 command with ArrayList)
        toDoList.remove(0);

        System.out.println("Here's the next thing to do: "
                + toDoList.get(0) );
        System.out.println(toDoList.size() + " things to do!");
        // Why is an ArrayList better than an array for a toDoList?
        // Answer:
        //ArrayLists are great because they can be changed
    }
}
