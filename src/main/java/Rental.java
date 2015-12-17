public class Rental {

    //  影片
    Movie _movie;

    //  租期
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    //  累加 常客積點
    protected int getFrequentRenterPoints() {
        // add bonus for a two day new release rental
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                getDaysRented() > 1)
            return 2;
        return 1;
    }

    protected double getCharge() {
        return _movie.getCharge(_daysRented);
    }
}
