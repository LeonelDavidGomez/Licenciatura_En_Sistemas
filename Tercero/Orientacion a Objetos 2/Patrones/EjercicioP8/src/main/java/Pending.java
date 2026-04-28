import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pending implements StateItem{

	public void strat(ToDoItem i) {
		i.setInicio(LocalDateTime.now());
		i.setEstado(new In_Progress());
		
	}
	public void togglePause(ToDoItem i) {
		throw new RuntimeException ("El objeto ToDoItem no se encuentra en in_progress o paused");
	}
	public void finish(ToDoItem i) {
		
	}
	public Duration workedTime(ToDoItem i) {
		throw new  RuntimeException ("El objeto ToDoItem no se inicio");
	}
}
