package game;

public class GameState {

    private Boolean isGameOver;
    private Integer balance;
    private Integer additionalLife;

    public GameState() {

        isGameOver = false;
        balance = 0;
        additionalLife = 0;
    }


    public void setGameOver(Boolean gameOver) {
        isGameOver = gameOver;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getAdditionalLife() {
        return additionalLife;
    }

    public void setAdditionalLife(Integer additionalLife) {
        this.additionalLife = additionalLife;
    }

    public Boolean isGameOver() {

        if (isGameOver) {
            isGameOver = false;
            return true;
        }

        return isGameOver;
    }
}