/*
 * William Zwart
 * 19/9/18
 * This displays the cost to carpet a room.
 */
package carpet;

/**
 *
 * @author wizwa9381
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double length = 8.5;
        int width = 6;
        double price_sqr_ft = 19.95;
        double final_price = 8.5 * 6 * 19.95 * 100;
        int cost = (int) final_price;
        double final_cost = cost / 100;
        System.out.println("The final price to carpet the room is $" + final_cost);
        // TODO code application logic here
    }
    
}
