public class product {
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter product details\n");
 System.out.println("Enter product id");
 int x = sc.nextInt();
 System.out.println("Enter product name");
 String name = sc.next();
 System.out.println("Enter product price");
 int y = sc.nextInt();
 System.out.println("Enter product quantity");
 int z = sc.nextInt();
 System.out.println("Enter product category");
 String category = sc.next();
 System.out.println("Enter product brand");
 String brand = sc.next();
 System.out.println("display product information");
 System.out.println("product id:" +x);
 System.out.println("product name:"+name);
 System.out.println("product price:"+y);
 System.out.println("product quantity"+z);
 System.out.println("product category"+category);
 System.out.println("product brand"+brand);
}
}
