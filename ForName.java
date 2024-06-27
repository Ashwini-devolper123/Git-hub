package ArrayList;
import java.util.*;

public class ForName {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
      Class.forName("A");
	}

}


class A{
	static {
		System.out.println("in static");
	}
	{
		System.out.println("in instance");
	}
}