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
        return _movie.getFrequentRenterPoints(_daysRented);
    }

    public double getCharge() {
        return _movie._price.getCharge(_daysRented, _movie);
    }
}
