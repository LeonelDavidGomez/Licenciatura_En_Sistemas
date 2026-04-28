import java.time.Duration;

public interface StateItem {
	
	public void strat(ToDoItem i);
	public void togglePause(ToDoItem i);
	public void finish(ToDoItem i);
    public Duration workedTime (ToDoItem i);
		
	



}
