package wsStockMarket;

public interface Subject {
    void registerObservers(Observer o);
    String notifyObservers(Observer t, String tipo_transaccion, Double precio);
}