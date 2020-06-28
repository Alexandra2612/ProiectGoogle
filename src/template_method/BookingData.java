package template_method;

public class BookingData {
    private String name,phonenumber;
    private String datein,dateout;
    public BookingData(String n,String pn,String din,String dout){
        this.name=n;
        this.phonenumber=pn;
        this.datein=din;
        this.dateout=dout;
    }

    @Override
    public String toString() {
        return "BookingData{" +
                "name='" + name + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", datein='" + datein + '\'' +
                ", dateout='" + dateout + '\'' +
                '}';
    }
}
