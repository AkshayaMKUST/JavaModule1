package dip;

public class Manager  {
	
	Worker worker;
	public void setWorker(Worker w) {
		worker = w;
	}
	public void manager() {
		worker.work();
	}

}
