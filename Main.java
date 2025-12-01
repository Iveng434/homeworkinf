public class Main{
    public static void main(String[] args){
        Order order1 =  new Order(1,"Ivan","notebook",1,40000,true);
        order1.displayInfo();
        System.out.println(order1.getCustomerAndProduct());
        System.out.println(order1.getOrderCode());
        System.out.println(order1.containsInCustomerName("an"));
    }
    
}