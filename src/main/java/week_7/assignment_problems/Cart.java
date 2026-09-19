public class Cart {
    private final String cartId;
    private int[] itemPrices;
    private int itemCount;

    public Cart(String cartId, int maxItems) {
        this.cartId = cartId;
        this.itemPrices = new int[maxItems];
        this.itemCount = 0;
    }

    public void addItem(int price) {
        if (price < 0) {
            return;
        }
        if (itemCount < itemPrices.length) {
            itemPrices[itemCount] = price;
            itemCount++;
        }
    }

    public int getTotal() {
        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += itemPrices[i];
        }
        return total;
    }

    public int getItemCount() {
        return itemCount;
    }

    public String getCartId() {
        return cartId;
    }
}
