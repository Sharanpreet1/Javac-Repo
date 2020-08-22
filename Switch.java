package HeadFirst.java;

public class Switch {
    boolean isFilled= true;
    double billAmount;
    String shipping;
    public Switch(boolean filled,double cost,String shippingMethod){
        if (cost > 25.99){
            System.out.println("High value item! ");
        }
        else {
            System.out.println("Low value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }
    public void ship(){
        if (isFilled){
            System.out.println("Shipping in progress___");
        }
        else {
            System.out.println("Order not ready");
        }
        double shippingCost = calculateShipping();

        System.out.println("Shipping cost: ");
        System.out.println(shippingCost);
    }

    public double calculateShipping(){
        double shippingCost;
        switch (shipping){
            case "Regular":
                shippingCost = 0;
                break;

            case "Express":
                shippingCost=1.75;
                break;
            default:
                shippingCost=.50;
        }
        return shippingCost;
    }

    public static void main(String[] args) {
        Switch book = new Switch(true,18.99,"Express");
        Switch playStation = new Switch(false,200,"Regular");

        book.ship();
        playStation.ship();

    }

}
