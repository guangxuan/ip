public class Event extends Task {
    private String dateTime;
    public Event(String description, String dateTime) throws DukeException {
        super(description);
        this.dateTime = dateTime;
    }
    public String toString() {
        return String.format("[E][%s] %s (at: %s)",
                getStatusIcon(), description, dateTime);
    }

    public String getDateTime() {
        return dateTime;
    }

    @Override
    public TaskType getType() {
        return TaskType.EVENT;
    }
}
