package template_method;

public class BillingData {
    private String cardnumber,expirationdate,cvv;
    public BillingData(String cn,String ed,String cvv){
        this.cardnumber=cn;
        this.expirationdate=ed;
        this.cvv=cvv;
    }

    @Override
    public String toString() {
        return "BillingData{" +
                "cardnumber='" + cardnumber + '\'' +
                ", expirationdate='" + expirationdate + '\'' +
                ", cvv='" + cvv + '\'' +
                '}';
    }
}
