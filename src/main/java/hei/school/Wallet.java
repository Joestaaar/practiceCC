package hei.school;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Wallet {
    private int longueur;
    private int weight;
    private String brandName;
    private String color;
    private double money;
    private List<String> cards;
    private boolean isLost;

    public Wallet() {
        this.money = 0.0;
        this.cards = new ArrayList<>();
        this.isLost = false;
    }

    public Wallet(int longueur, int weight, String brandName, String color) {
        this.longueur = longueur;
        this.weight = weight;
        this.brandName = brandName;
        this.color = color;
        this.money = 0.0;
        this.cards = new ArrayList<>();
        this.isLost = false;
    }

    /**
     * Get the current amount of money in the wallet
     * @return current money amount
     */
    public double getMoney() {
        if (isLost) {
            System.out.println("Warning: This wallet is marked as lost!");
        }
        return money;
    }

    /**
     * Add money to the wallet
     * @param amount amount to add
     * @return true if successful, false if wallet is lost or amount is invalid
     */
    public boolean addMoney(double amount) {
        if (isLost) {
            System.out.println("Cannot add money to a lost wallet!");
            return false;
        }
        if (amount <= 0) {
            System.out.println("Amount must be positive!");
            return false;
        }
        this.money += amount;
        return true;
    }

    /**
     * Check the current money in the wallet and display it
     */
    public void checkMoney() {
        if (isLost) {
            System.out.println("This wallet is lost!");
        } else {
            System.out.println("Current balance: $" + money);
            System.out.println("Number of cards: " + cards.size());
        }
    }

    /**
     * Add a card to the wallet
     * @param cardName name/type of the card (e.g., "Visa", "ID Card")
     * @return true if successful, false if wallet is lost
     */
    public boolean addCard(String cardName) {
        if (isLost) {
            System.out.println("Cannot add card to a lost wallet!");
            return false;
        }
        if (cardName == null || cardName.trim().isEmpty()) {
            System.out.println("Card name cannot be empty!");
            return false;
        }
        cards.add(cardName);
        System.out.println("Added card: " + cardName);
        return true;
    }

    /**
     * Mark the wallet as lost
     */
    public void lost() {
        this.isLost = true;
        System.out.println("Wallet marked as LOST!");
        System.out.println("Lost wallet contained: $" + money);
        System.out.println("Lost wallet contained " + cards.size() + " card(s)");
    }

    /**
     * Find the wallet (mark as not lost)
     */
    public void found() {
        this.isLost = false;
        System.out.println("Wallet has been found!");
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "brand='" + brandName + '\'' +
                ", color='" + color + '\'' +
                ", money=$" + money +
                ", cards=" + cards.size() +
                ", isLost=" + isLost +
                '}';
    }
}






// créér: prog-5-j1-wallet deadline 21h

