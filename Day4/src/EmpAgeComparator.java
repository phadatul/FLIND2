import java.util.Comparator;

public class EmpAgeComparator implements Comparator <Employee> {

	@Override
	public int compare(Employee e0, Employee e1) {
		// TODO Auto-generated method stub
		if(e0.empage > e1.empage) {
			return 1;
		}
		else if (e0.empage < e1.empage) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
