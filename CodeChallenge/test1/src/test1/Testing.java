package test1;
import java.util.*;

@SuppressWarnings("unused")
public class Testing {
	
	Scanner sc = new Scanner (System.in);
	
/*public void testcase1 (this A){
	System.out.println(A);
	
}*/
	public LinkedList<String> doctors(String temp){
		
		//Doctors residing in area Aurora
		LinkedList <String> Aurora = new LinkedList<String>();
		Aurora.add("ajay Orthopedist");
		Aurora.add("jay Orthopedist");
		Aurora.add("siva Orthopedist");
		Aurora.add("nara Orthopedist");
		
		//Doctors residing in area Limestone 
		LinkedList <String> Limestone = new LinkedList<String>();
		Limestone.add("tingari Orthopedist");
		Limestone.add("munni Orthopedist");
		Limestone.add("harsha Orthopedist");
		Limestone.add("vijaya Orthopedist");
		
		//Doctors residing in area Downtown
		LinkedList <String> Downtown = new LinkedList<String>();
		Downtown.add("sai Orthopedist");
		Downtown.add("jaya Orthopedist");
		Downtown.add("mohan Orthopedist");
		Downtown.add("rao Orthopedist");
		
		//resulted List of doctors by search
		LinkedList <String> result = new LinkedList<String>();	
/*		if (Aurora.contains(temp)){
			LinkedList<String> List2 = ((LinkedList<String>) Aurora.clone());
			testcase1(List2);
			
		}*/
			//Object A = a;
		
		/*condition checks the input with the list if a particular doctor is present at the particular area
		it grabs all the data of doctors list and is stored and prvides the similar doctors in Alphabetical order*/
		
		//checks the first list of doctors
		for (int i =0; i<Aurora.size();i++){
			String ft = Aurora.get(i);
			if(ft.contains(temp)){
				String ft1 = Aurora.get(i);
				
				result.addAll(Aurora);
				//testcase1(result);
			}
				
		}
		//checks the second list of doctors
		for (int j =0; j<Limestone.size();j++){
			String ft = Limestone.get(j);
			if(ft.contains(temp)){
				String ft1 = Limestone.get(j);
				result.addAll(Limestone);
				
			}
				
		}
		//checks the third list of doctors
		for (int i =0; i<Downtown.size();i++){
			String ft = Downtown.get(i);
			if(ft.contains(temp)){
				String ft1 = Downtown.get(i);
				result.addAll(Downtown);
				
			}
				
		}
		
		//sorts the result data in alphabetical order
		Collections.sort(result);
		return result;
		//displays the result
		//System.out.println("linked list updated:" + result);
		
	}
	
/*	private void testcase1(LinkedList<String> result) {
		// TODO Auto-generated method stub
		Collections.sort(result);
		System.out.println("hadfbksdbhsdvhbsdvhsk"+ result);
	}*/
	
	//this method reads the input from console and sends the data to doctors list method
	public void comp(){
		
	//reads the input
		String temp1 = sc.next();
				doctors(temp1);
				if (doctors(temp1).isEmpty()){
				System.out.println("no results are found");}
				else{System.out.println("linked list updated:" + doctors(temp1));}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//instance object creation to call the methods
	
		Testing t = new Testing();
	
	//calling method comp to get the input from user(console).
		t.comp();
		
	}

}
