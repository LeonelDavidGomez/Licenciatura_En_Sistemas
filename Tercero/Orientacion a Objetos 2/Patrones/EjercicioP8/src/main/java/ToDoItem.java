import java.time.Duration;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class ToDoItem {
    private String name;
    private List<String> comentarios;
    private StateItem state;
    private LocalDateTime l;
    private Duration d;
    
	public ToDoItem(String name) {
		this.name=name;
		this.comentarios=new LinkedList<>();
		this.state=new Pending();
		this.d=Duration.ZERO;
	}
	

	public void start () {
		state.strat(this);
	}
	
	public void togglePause() {
		state.togglePause(this);
	}
	public void finish () {
		state.finish(this);
	}
	
	public Duration workedTime () {
		return state.workedTime(this);
	}
	
	public void addComment (String comment) {
		comentarios.add(comment);
	}
	
	public void setEstado(StateItem s) {
		state=s;
	}
	public Duration getAcomulado() {
		return d;
	}
	public void setInicio (LocalDateTime l) {
		this.l=l;
	}
	public LocalDateTime getInicio() {
		return l;
	}
	
	
}
