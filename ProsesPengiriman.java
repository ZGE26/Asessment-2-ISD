import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ProsesPengiriman {
    private PriorityQueue<Paket> scheduleQueue;

    public ProsesPengiriman() {
        this.scheduleQueue = new PriorityQueue<>();
    }

    public void terimaPaket(int id, String name, int date, String type, String address) {
        this.scheduleQueue.add(new Paket(id, type, name, date, address));
    }

    public Paket getNextSchedule() {
        return this.scheduleQueue.poll();
    }

    public void listJadwal() {
        List<Paket> schedules = new ArrayList<>();

        while (!this.scheduleQueue.isEmpty()) {
            schedules.add(this.scheduleQueue.poll());
        }

        for (Paket schedule : schedules) {
            System.out.println(schedule);
        }
    }
}
