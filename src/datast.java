import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class datast {
	public static void main(String[] args) {
		SimpleDateFormat dataf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat dataf2 = new SimpleDateFormat("HH:mm:ss");
		Date day = new Date();
		
		
		Timer timer = new Timer();
		final long SEGUNDOS = (1000);
		TimerTask tarefa = new TimerTask() {

			@Override
			public void run() {
				System.out.println(dataf2.format(new Date())+ " " + 
						dataf1.format(new Date()));
				
			}
			
			
		};
		timer.schedule(tarefa, 0,SEGUNDOS);
		
		System.out.println("To com sono");
		
		
	}
}
