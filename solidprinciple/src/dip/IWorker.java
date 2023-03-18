package dip;

public interface IWorker {
	public void work();
	
	
	public class Worker implements IWorker {
		
		public void work() {
			//.. working
		}

	}
	public class SuperWorker implements IWorker {
		
		public void work() {
			//.. working much more
		}

	}
	public class Manager  {
		
		IWorker worker;
		public void setWorker(IWorker w) {
			worker = w;
		}
		public void manager() {
			worker.work();
		}

	}

}
