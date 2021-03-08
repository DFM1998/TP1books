package books;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     *
     * @param name name of the book shop
     */
    public BookShop(String name) {
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     *
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books) {
        //complete
        int totalDifferentBooks = 0;
        int totalOfBooks = 0;
        double endPrice = 0;

        for (int i = 0; i < books.length; i++) {
            totalOfBooks += (books[i] >= 0 ? books[i] : 0);
            if (books[i] > 0) {
                totalDifferentBooks++;
            }
        }

        if (totalDifferentBooks == 2) {
            totalOfBooks -= 2;
            endPrice += 8 * 2 * 0.93;
            endPrice += totalOfBooks * 8;
        } else if (totalDifferentBooks == 3) {
            totalOfBooks -= 3;
            endPrice += 8 * 3 * 0.86;
            endPrice += totalOfBooks * 8;
        } else if (totalDifferentBooks == 4) {
            totalOfBooks -= 4;
            endPrice += 8 * 4 * 0.72;
            endPrice += totalOfBooks * 8;
        } else if (totalDifferentBooks == 5) {
            totalOfBooks -= 5;
            endPrice += 8 * 5 * 0.65;
            endPrice += totalOfBooks * 8;
        } else {
            endPrice += totalOfBooks * 8;
        }

        return endPrice;
    }
}
