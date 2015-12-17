public abstract class Price {

    //  取得價格代號
    abstract int getPriceCode();

    //  取得影片出租價格
    abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented){
        return 1;
    }
}
