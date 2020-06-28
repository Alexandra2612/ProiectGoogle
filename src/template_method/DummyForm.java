package template_method;

public class DummyForm extends TemplateForm{
    @Override
    public BookingData insertBookingData() {
        FileService.setFilePath("src/template_method/userdata.txt");
        BookingData bd=new BookingData(FileService.getLine(),FileService.getLine(),FileService.getLine(),FileService.getLine());
        return bd;
    }
    @Override
    public BillingData billingInfo() {
        BillingData bd=new BillingData(FileService.getLine(),FileService.getLine(),FileService.getLine());
        return bd;
    }
    @Override
    public void tryPayment(BookingData bd1,BillingData bd2) {
        System.out.println(bd1+" - "+bd2);
    }
}
