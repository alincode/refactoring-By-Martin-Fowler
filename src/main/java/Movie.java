public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    //  名稱
    private String _title;

    //  價格(代號)
    private int _priceCode;

    Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
        switch (arg){
            case REGULAR:   // 普通片
                _price = new RegularPrice();
                break;
            case NEW_RELEASE:   // 兒童片
                _price = new NewReleasePrice();
                break;
            case CHILDRENS: // 新片
                _price = new ChildrensPrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public String getTitle() {
        return _title;
    }

    //  累加 常客積點
    protected int getFrequentRenterPoints(int daysRented) {
        // add bonus for a two day new release rental
        if ((getPriceCode() == Movie.NEW_RELEASE) &&
                daysRented > 1)
            return 2;
        return 1;
    }
}