class Book {
    private int bookNumber;
    private String title;
    private double price;

    
    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

   
    public void setTitle(String title) {
        this.title = title;
    }

    
    public void setPrice(double price) {
        this.price = price;
    }

   
    public int getBookNumber() {
        return bookNumber;
    }

   
    public String getTitle() {
        return title;
    }

    
    public double getPrice() {
        return price;
    }
}