import java.util.Enumeration;
import java.util.Vector;

public class Customer {

    private String _name;

    //  租借記錄
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();// 取得一筆租借記錄

            // show figures for this rental (顯示此筆租借資料)
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(each.getCharge()) + "\n";
        }

        // add footer lines (結尾列印)
        result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) +
                " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "<BR>\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();// 取得一筆租借記錄

            // show figures for this rental (顯示此筆租借資料)
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(each.getCharge()) + "<BR>\n";
        }

        // add footer lines (結尾列印)
        result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) +
                " frequent renter points";
        return result;
    }


    //  總消費金額
    private double getTotalAmount(){
        double result = 0;
        Enumeration rentals = _rentals.elements();

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();// 取得一筆租借記錄
            result += each.getCharge();
        }

        return result;
    }

    //  常客積點
    private int getFrequentRenterPoints(){
        int result = 0;
        Enumeration rentals = _rentals.elements();

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();// 取得一筆租借記錄
            result += each.getFrequentRenterPoints();
        }

        return result;
    }
}
