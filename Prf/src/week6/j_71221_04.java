package week6;

public class j_71221_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(CloseableResource_ cr = new CloseableResource_()){
			cr.exceptionWork(false);
		} catch(WorkException_ e) {
			e.printStackTrace();
		} catch (CloseException_ e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try(CloseableResource_ cr = new CloseableResource_()){
			cr.exceptionWork(true);
		} catch(WorkException_ e) {
			e.printStackTrace();
		} catch (CloseException_ e) {
			e.printStackTrace();
		}		
	}
}

class CloseableResource_ implements AutoCloseable{

	public void exceptionWork(boolean ex) throws WorkException_{
		System.out.println("Exceptionwork ( " + ex + " )가 호출됨");
		
		if(ex)
			throw new WorkException_("WorkException 발생");
		
	}
	public void close() throws CloseException_ {
		System.out.println("close 호출");
		throw new CloseException_("closeException 발생");
	}
	
}

class WorkException_ extends CloseException_{
	public WorkException_(String msg) {
		super(msg);
	}
}

class CloseException_ extends Exception{
	public CloseException_(String msg) {
		super(msg);
	}
}