package template_method;

public abstract class TemplateForm {
    public void hotelBooking(){
        BookingData bd1=insertBookingData();
        BillingData bd2=billingInfo();
        tryPayment(bd1,bd2);
    }

    public abstract BookingData insertBookingData();
    public abstract BillingData billingInfo();
    public abstract void tryPayment(BookingData bd1,BillingData bd2);
}
