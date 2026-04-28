import java.time.Duration;
import java.time.LocalDateTime;

public class Finished implements StateItem{

	public void strat(ToDoItem i) {
		
	}
	public void togglePause(ToDoItem i) {
		throw new RuntimeException ("El objeto ToDoItem no se encuentra en in_progress o paused");
	}
	public void finish(ToDoItem i) {
		
	}
	
	public Duration workedTime(ToDoItem i) {
		return i.getAcomulado().plus(Duration.between(i.getInicio(),LocalDateTime.now()));
	}
	
}
