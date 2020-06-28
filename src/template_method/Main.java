package template_method;

public class Main {
    public static void main(String[] args) {
       TemplateForm tf=new DummyForm();
       tf.hotelBooking();
    }
    //I write the data in the txt file first before running the program
    //The template method hotelBooking can be reimplemented for extra functionality
    //The DummyForm only contains the  first implementation of the hotelBooking method,a placeholder that only prints the formatted information
}
