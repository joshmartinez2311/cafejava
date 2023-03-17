public class CafeJava{
    public static void main(String[] args){
        // app variables
        // lines of text that will appear int he app.
        String generalGreeting = "welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "your total is $";
        
        // menu variables (add yours below)
        double mochaPrice = 4.5;
        double dripCoffeePrice = 8.25;
        double lattePrice  = 6.10;
        double cappucinoPrice = 5.25;


        //customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

        //APP INTERACTION SIMULATION (add your code for the challenges below)
        System.out.println(generalGreeting + customer1);
        System.out.println(generalGreeting + customer2);
        System.out.println(generalGreeting + customer3);
        System.out.println(generalGreeting + customer4);

        //for the next tasks, we will be simulating customer interactions, printing messages //
        //to the screen, based on scenarios. Cindhuri ordered a coffee. Print to the console the //
        //correct status message, based on her order status.//
        System.out.println(customer1 + pendingMessage);
    
        // Noah ordered a cappucino. Use an if statement to check the status of his order//
        // and print the correct status message. If it is ready, also print the message //
        // to display the total. Note: Outcomes may be different depending on what you assigned// 
        //as the status.//
        if (isReadyOrder4) {
            System.out.println(customer3 + readyMessage);
            System.out.println(displayTotalMessage + cappucinoPrice);
        }
        else {
            System.out.println(customer3 + pendingMessage);
        }
    
        //Sam just ordered 2 lattes, print the message to display their total. Next, 
        //use an if statement to print the appropriate order status message. 
        //Change the isReady flag value from true to false or vice versa in order to 
        //test your control logic (if-statement).
            System.out.println(generalGreeting + customer2);
            System.out.println(displayTotalMessage + lattePrice * 2);
            if (isReadyOrder2) {
                System.out.println(customer2 + readyMessage);
            }
            else{
                System.out.println(customer2 + pendingMessage);
            }
        
        //Jimmy just realized he was charged for a coffee but had ordered a latte. 
        //Print the total message with the new calculated total (what he owes) 
        //to make up the difference.
        System.out.println(generalGreeting + customer3);
        System.out.println(displayTotalMessage + (dripCoffeePrice - lattePrice));
    
    
    
    
    
    
    
    }
}