public abstract class Price {

    //  取得價格代號
    abstract int getPriceCode();

    //  取得影片出租價格
    protected double getCharge(int daysRented) {
        double result = 0;

        switch (getPriceCode()) {
            case Movie.REGULAR:// 普通片
                result += 2;
                if (daysRented > 2)
                    result += (daysRented - 2) * 1.5;
                break;

            case Movie.NEW_RELEASE:// 新片
                result += daysRented * 3;
                break;

            case Movie.CHILDRENS:// 兒童片
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;
        }
        return result;
    }
}
