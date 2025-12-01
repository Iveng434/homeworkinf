public class Order{
    private int id;
    private String customerName;
    private String product;
    private int amount;
    private double totalPrice;
    private boolean isCompleted;
    Order(int id, String customerName, String product, int amount, double totalPrice, boolean isCompleted){
    setId(id);
    setCustomerName(customerName);
    setProduct(product);
    setAmount(amount);
    setTotalPrice(totalPrice);
    setIsCompleted(isCompleted);
}
    public int getId(){
        return id;
    }
    public void setId(int id){
        if (id>0){
            this.id=id;     
        }
        else{
            System.out.println("incorrect");
        }   
    }
     public String getCustomerName(){
        return customerName;
     }
     public void setCustomerName(String customerName){
        this.customerName = customerName;
     }
     public String getProduct(){
        return product;
     }
     public void setProduct(String product){
        this.product = product;
     }
     public int getAmount(){
        return amount;
     }
     public void setAmount(int amount){
        if (amount>0){
        this.amount = amount;
        }
        else{
            System.out.println("incorrect");
        }
     }
     public double getTotalPrice(){
        return totalPrice;
     }
     public void setTotalPrice(double totalPrice){
        if (totalPrice>0){
            this.totalPrice=totalPrice;
        }   
        else{
            System.out.println("incorrect");
        }
     }
     public boolean getIsCompleted(){
        return isCompleted;
     }
     public void setIsCompleted(boolean isCompleted){
        this.isCompleted=isCompleted;
     }
     public void displayInfo() {
    System.out.printf("ID: %d, Customer: %s, Product: %s, Amount: %d, Total Price: %.2f, Completed: %b%n",
            getId(), getCustomerName(), getProduct(), getAmount(), getTotalPrice(), getIsCompleted());
}
    public String getCustomerAndProduct(){
        return getCustomerName()+"-"+getProduct();
    }
    public String getOrderCode(){
        return "ID:"+getId()+"-"+ getProduct().substring(0,2);
    }
    public boolean containsInCustomerName(String substring){
        return customerName.contains(substring);
    }
}