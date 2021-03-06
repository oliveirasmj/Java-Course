package threads7;
import java.util.logging.Logger;
public class ThreadA {
    private String packet;
    
    // True if receiver should wait
    // False if sender should wait
    private boolean transfer = true;
 
    public synchronized void send(String packet) {
        while (!transfer) {
            try { 
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt(); 
                //Log.error("Thread interrupted", e); 
            }
        }
        transfer = false;
        
        this.packet = packet;
        notifyAll();
    }
 
    public synchronized String receive() {
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt(); 
                //Log.error("Thread interrupted", e); 
            }
        }
        transfer = true;

        notifyAll();
        return packet;
    }
}