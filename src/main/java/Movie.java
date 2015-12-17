public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    //  名稱
    private String _title;

    //  價格(代號)
    private int _priceCode;

    private Price _price;

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

    protected double getCharge(int daysRented) {
        double result = 0;

        switch (getPriceCode()) {// 取得影片出租價格
            case REGULAR:// 普通片
                result += 2;
                if (daysRented > 2)
                    result += (daysRented - 2) * 1.5;
                break;

            case NEW_RELEASE:// 新片
                result += daysRented * 3;
                break;

            case CHILDRENS:// 兒童片
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;
        }
        return result;
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