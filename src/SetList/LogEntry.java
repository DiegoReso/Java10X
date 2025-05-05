package SetList;

import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.StringJoiner;

public class LogEntry implements Comparable<LogEntry> {

    private String username;
    private LocalDateTime moment;

    public LogEntry(String username, LocalDateTime moment) {
        this.username = username;
        this.moment = moment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment){
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(getUsername(), logEntry.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getUsername());
    }

    @Override
    public int compareTo(LogEntry o) {
        return username.toUpperCase().compareTo(o.getUsername().toUpperCase());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", LogEntry.class.getSimpleName() + "[", "]")
                .add("username='" + username + "'")
                .add("moment=" + moment)
                .toString();
    }
}
