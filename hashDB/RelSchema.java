package hashDB;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class RelSchema {
	private ArrayList<ArrayList<String>> fK;
	public HashMap<String, Relation> relations;
	
	
	
	public RelSchema() {
		fK = new ArrayList<ArrayList<String>>();
		relations = new HashMap<String, Relation>();
	}
	
	//Adds relations and key relationships to arraylist
	public void addfK(String parentRel, String parentAttr, String childRel, String childAttr) {
		ArrayList<String> key = new ArrayList<String>();
		key.add(parentRel);
		key.add(parentAttr);
		key.add(childRel);
		key.add(childAttr);
		
		fK.add(key);
		System.out.println("Primary Key/Foreign Key Relationships: " + fK);
	}	
	
	
	//Checks relational constraints of a relation and attributes
	public boolean conformsWithfK(String relName, String attName, Object attVal) {
		//checks fk against pk
		
		
		//if(relations.get(relName).projection(attName).indexOf(attVal) == attVal) {
			
		//}
		return relations.get(relName).projection(attName).indexOf(attVal) >= 0 || attVal == null;
		
		/*
		for(int i = 0; i < fK.size(); i++) {
		    ArrayList<String> curr_fK = fK.get(i);
		    if (curr_fK.get(0).equals(relName) && curr_fK.get(1).equals(attName)) {
		      String childRelName = curr_fK.get(2);
		      String childAttName = curr_fK.get(3);
		      Relation childRel = relations.get(childRelName);
		      ArrayList<Object> column = childRel.projection(childAttName);
		      if(column.contains(attVal)) {
		        return true;
		      }
		      else{
		        return false;
		      }
		    }
		 }
		   //no foreign key constraints found, return true
		    return true;*/
	}
}
