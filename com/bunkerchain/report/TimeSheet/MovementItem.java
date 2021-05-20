public class MovementItem {
    private String movement;
    private String date;
    private String time;
    private String remarks;

    public MovementItem(String movement, String date, String time, String remarks) {
        this.movement = movement;
        this.date = date;
        this.time = time;
        this.remarks = remarks;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
