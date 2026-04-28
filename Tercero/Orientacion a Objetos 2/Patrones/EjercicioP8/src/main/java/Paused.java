import java.time.Duration;
import java.time.LocalDateTime;

public class Paused implements StateItem{

	public void strat(ToDoItem i) {
		 
	}
	public void togglePause(ToDoItem i) {
		i.setEstado(new In_Progress());
	}
	public void finish(ToDoItem i) {
		i.setEstado(new Finished());
	}
	public Duration workedTime(ToDoItem i) {
		return i.getAcomulado().plus(Duration.between(i.getInicio(), LocalDateTime.now()));
	}
}
