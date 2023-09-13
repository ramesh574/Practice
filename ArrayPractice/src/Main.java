import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructins();
        while (!quit) {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    printInstructins();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyitem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    SearchForItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
    }


    public static void printInstructins()
    {
        System.out.println("\n Press");
        System.out.println("\t 0 - To print choice options. ");
        System.out.println("\t 1- To print the list of grocery items");
        System.out.println("\t 2- To add an item to the list");
        System.out.println("\t 3-To modify an item in the list ");
        System.out.println("\t 4- TO remove an item from the list");
        System.out.println("\t 5- To search for an item in the list ");
        System.out.println("\t 6- To quit the application");
    }
    public static void addItem()
    {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyitem()
    {
        System.out.println("Enter item number: ");
        int itemNo=scanner.nextInt();
        scanner.nextInt();
        System.out.println("Enter replacement item: ");
        String newItem=scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1,newItem);
    }
    public static void removeItem()
    {
        System.out.println("Enter item number: ");
        int itemNo=scanner.nextInt();
        scanner.nextInt();
        groceryList.removeGroceryItem(itemNo);
    }
    public static void SearchForItem()
    {
        System.out.println("Item to search for: ");
        String searchItem=scanner.nextLine();
        if(groceryList.findItem(searchItem)!=null)
        {
            System.out.println();
        }
    }
}

