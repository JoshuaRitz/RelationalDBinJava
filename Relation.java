package hashDB;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class Relation {
	private String name;
	private ArrayList<Tuple> tuples;
	private ArrayList<Attribute> attributes;
	private String primaryKey;
	private ArrayList<String> fKeys;
	public HashMap<Object, Integer> index;
	
	public Relation(String name, Collection<Attribute> attrs, String primaryKey, ArrayList<String> fKeys) {
		this.primaryKey = primaryKey;
		this.fKeys = fKeys;
		this.name = name;
		this.attributes = new ArrayList<Attribute>(attrs); 
		this.tuples = new ArrayList<Tuple>();
		this.index = new HashMap<Object, Integer>();
	}
	
	public String getName() {
    	return this.name;
    }
	
	public Relation(String name, Collection<Attribute> attrs, String primaryKey, ArrayList<String> fKeys, Collection<Tuple> tuples) {
		this.fKeys = fKeys;
		this.name = name;
		this.attributes = new ArrayList<Attribute>(attrs); 
		this.tuples = new ArrayList<>(tuples);
		this.setPrimaryKey(primaryKey);
	}
	
	private boolean setPrimaryKey(String attName) {
        this.primaryKey = attName;
        HashMap<Object, Integer> index = new HashMap<Object, Integer>();
        for (int i=0; i<tuples.size(); i++) {
          Tuple currTuple = tuples.get(i);
          Object currentPK =  currTuple.getAttribute(attName);
          if (index.containsKey(currentPK)) {
            System.out.println(currentPK + " Primary Key already exists - Entry Rejected");
            return false;
          }
          else {
            index.put(currentPK, i);
          }
        }
        this.index = index;
        return true;
        }
	
	

	public ArrayList<Object> primaryKeyVals(String attName) {
		boolean attributeExists = false;
		for(Attribute a: attributes) {
		  if(a.getName().equals(attName)) {
		    attributeExists = true;
		    break;
		  }
		}

		if(!attributeExists) {
		  throw new IllegalArgumentException("invalid column name");
		}

		ArrayList<Object> column = new ArrayList<Object>();
		for(Tuple t: tuples) {
		  column.add( t.getAttribute(attName) );
		  }
		System.out.println(column);
		return column;
	}
	
	
	
	public void insertTuple(Tuple insTuple) {
      	boolean isAccepted = true;
        Object currentPK =  insTuple.getAttribute(this.primaryKey);
        if (index.containsKey(currentPK)) {
           System.out.println(currentPK + " appears multiple times as primary key - uniqueness violated - operation rejected ");
           return;
        } 
        
                
        for(Attribute a: attributes){
        	
      
          	Class attrType = a.getType();
            Class valType = insTuple.getAttribute(a.getName()).getClass();
            
             if ( valType.equals(attrType)){ // if object in tuple for attribute a name 
               // do nothing
             } else {
               isAccepted = false; 
             }
          } 
      	 if(!isAccepted){
           System.out.println(currentPK + " types violated - operation rejected ");
           return;
         }

        	 this.tuples.add(insTuple);
        	 Integer rowPosition = Integer.valueOf(tuples.size()-1);
    		 index.put(currentPK, rowPosition);

	}
	
	public void deleteTuple(String attrName, Object val) {
		ArrayList<Tuple> toDelete = new ArrayList<Tuple>();
		for(int i = 0; i < tuples.size(); i++) {
			Tuple currentTuple = tuples.get(i);
			Object currentValue = currentTuple.getAttribute(attrName);
			if (currentValue.equals(val)) {
				toDelete.add(currentTuple);
			}
		}
		if( toDelete.isEmpty() ) {
			System.out.println("Reject - nothing to delete");
		}
		for (Tuple t: toDelete) {
			tuples.remove(t);
		}   
	}
	
	public void updateTuple(String attrName, Object currVal, String attrForUpdate, Object newVal) {
		Boolean isUpdated = false;
		for(int i = 0; i < tuples.size(); i++) {
			Tuple currentTuple = tuples.get(i);
			Object currentValue = currentTuple.getAttribute(attrName);
			if (currentValue.equals(currVal)) {
				this.tuples.get(i).getTupleValues().put(attrForUpdate, newVal);
				isUpdated = true;
			}
		}
		if( !isUpdated ) {
			System.out.println("No match to update - update rejected");
		} else {
		System.out.println("RESULT OF YOUR UPDATE");
		this.printRelation();
		}
	}
	
	//This method used as a helper for the aggregate functions
	public ArrayList<Object> projection(String attName) {
		boolean attributeExists = false;
		for(Attribute a: attributes) {
		  if(a.getName().equals(attName)) {
		    attributeExists = true;
		    break;
		  }
		}

		if(!attributeExists) {
		  throw new IllegalArgumentException("invalid column name");
		}

		ArrayList<Object> column = new ArrayList<Object>();
		for(Tuple t: tuples) {
		  column.add( t.getAttribute(attName) );
		  }
		return column;
	}
		
	
	//Prints a projection of a relation
	public void projection3(ArrayList<String> cols) {
		System.out.println("Result of your projection");
		String str = "RELATION: " + this.name + "\n";
		for( Attribute attr : attributes ) {
			if( cols.contains(attr.getName())){
			str += attr.getName() + "\t";
	         }
		}
		str += "\n";
		for (Tuple tuple : this.tuples) {
			for(Attribute attr: attributes ) {
	             	if( cols.contains(attr.getName())){
					Object val = tuple.getAttribute(attr.getName());
					str += val + "\t\t";
	               }
			}
			str += "\n";
		}
		System.out.println(str);
	}
	
	
	
	//Returns a selection based on user provided attribute and value
	public void selection(String attrName, Object selectionVal) {
		ArrayList<Tuple> toSelect = new ArrayList<Tuple>();
		for(int i = 0; i < tuples.size(); i++) {
			Tuple currentTuple = tuples.get(i);
			Object currentValue = currentTuple.getAttribute(attrName);
			if (currentValue.equals(selectionVal)) {
				toSelect.add(currentTuple);
			}
		}
		if( toSelect.isEmpty() ) {
			System.out.println("No matching selection");
		} else {
		System.out.println("RESULT OF YOUR SELECTION");
		String str = "RELATION: " + this.name + "\n";
		for( Attribute attr : attributes ) {
			str += attr.getName() + "\t";
		}
		str += "\n";
		for (Tuple tuple : toSelect) {
			for(Attribute attr: attributes ) {
				Object val = tuple.getAttribute(attr.getName());
				str += val + "\t\t";
			}
			str += "\n";
		}
		System.out.println(str);
		}
	}
	
	//Prints a Relation
	public void Union(Relation rel, Relation rel2, ArrayList<Attribute> attNames) {
		/*Psuedo code to implement
		 Take in two passed relations and ArrayList of attributes
		 Reject if two relations don't have same # of attributes
		 Reject if attributes not type compatible 
		 Compare ArrayList of attribute names passed
		 Print one relation with tuples that are either in rel or rel2, eliminating duplicate tuples
		 */
	}
	
	public void intersection(Relation rel, Relation rel2, ArrayList<Attribute> attNames) {
		/*Psuedo code to implement
		 Take in two passed relations and ArrayList of attributes
		 Print one relation that includes all tuples that are in rel and rel2
		 The attribute names in the result will be the same as the attributes in rel1
		 The two relations must be type compatible
		 */
	}
	
	public void setDifference(Relation rel, Relation rel2) {
		/*Psuedo code to implement
		 Take in two passed relations
		 include all tuples that are in rel but not rel2
		 Print a result that has attribute names the same as in rel
		 Must be type compatible
		 */
	}
	
	public void crossProduct(Relation rel, Relation rel2) {
		/*Psuedo code to implement
		 Take in two passed relations
		 For first tuple in rel, print first tuple in rel along with each tuple in rel2
		 For second tuple in rel, print second tuple in rel along with each tuple in rel2
		 Continue this scheme until rel has no more tuples or rel2 has no more tuples
		 */
	}
	
	public void equiJoin(Relation rel, Relation rel2) {
		/*Psuedo code to implement
		 Take in two passed relations
		 print first tuple from rel and append first tuple from rel2
		 print second tuple from rel and append second tuple from rel2
		 Follow this scheme until no more tuples
		 */
	}
	
	public void naturalJoin(Relation rel, Relation rel2) {
		/*Psuedo code to implement
		 Take in two passed relations
		 Print relation only on tuples that share same attribute values for same attribute name
		 For example, from demo case, natural join agents and orders 
		 Should join all AGENT_CODE in result
		 */
	}
	
	
	//Returns minimum value of a user given attribute
	public void min(String attName) {
			ArrayList<Object> proj = projection(attName);
			
			if( proj.get(0) instanceof String){
		          System.out.println("Cannot find min of " + attName + " it is a string");
		    }
			else if (proj.get(0) instanceof Integer){
	          Integer minSoFar = (Integer) proj.get(0);
	          for(Object o: proj) {
	              Integer s = (Integer) o;
	              if(s.compareTo(minSoFar) < 0) {
	                  minSoFar = s;
	              }
	          }
	          System.out.println("Result of your min:\n" + attName + "\n" + minSoFar);
	        }
		}
	
	
	//Returns max value of user given attribute
	public void max(String attName) {
		ArrayList<Object> proj = projection(attName);
		
  		if( proj.get(0) instanceof String){
          System.out.println("Cannot find max of " + attName + " it is a string");
        }
		else if (proj.get(0) instanceof Integer){
          Integer maxSoFar = (Integer) proj.get(0);
          for(Object o: proj) {
              Integer s = (Integer) o;
              if(s.compareTo(maxSoFar) > 0) {
                  maxSoFar = s;
              }
          }
          System.out.println("Result of your max:\n" + attName + "\n" + maxSoFar);
        }
	}
	
	//Returns avg value of user give attribute
	public void averageRnd(String attName) {
		Boolean isViolated = false;
		ArrayList<Object> proj = projection(attName);
		double sum = 0;
		double avg;
		if (proj.get(0) instanceof Integer){
	        double count = projection(attName).size();  
			for(Object o: proj) {
				int temp = ((Integer) o).intValue();
				sum += temp;
	        }
			avg = sum/count;
			System.out.println("Your average is:\n" + attName + "\n" + Math.round(avg));
			isViolated = true;
		}
		if( !isViolated) {
			System.out.println("A string was provided - operation rejected");
		}
	}
	
	
	//Returns sum of user given attribute
	public void sum(String attName) {
		ArrayList<Object> proj = projection(attName);
		int sum = 0;
		if( proj.get(0) instanceof String) {
			System.out.println("Cannot sum " + attName + " because it is a String");
		}
		else if (proj.get(0) instanceof Integer){
	          for(Object o: proj) {
	        	  int temp = ((Integer) o).intValue();
	        	  sum += temp;
	          }
	          System.out.println("Result of your sum:\n" + attName + "\n" + sum);     
		}
	}
	
	//Returns count of user given attritube
	public int count(String attName) {
		System.out.println("Result of your count:\n" + attName);
		return projection(attName).size();
	}
	
	
	//Group max aggregate function
	public ArrayList<Object> groupMax(String groupBy, String uniqueGroup, String attName) {
		boolean attExists = false;
		for(Attribute a: attributes) {
			if(a.getName().equals(attName)) {
				attExists = true;
				break;
			}
		}
		if(!attExists) {
			throw new IllegalArgumentException("invalid column name");
		}
		ArrayList<Object> column = new ArrayList<Object>();
		for(Tuple t: tuples) {
			Object groupVal = t.getAttribute(groupBy);
			if(groupVal == uniqueGroup) {
				column.add(t.getAttribute(attName));
			}
		}
		Integer maxSoFar = 0;
          for(Object o: column) {
              Integer s = (Integer) o;
              if(s.compareTo(maxSoFar) > 0) {
                  maxSoFar = s;
              }
          }
        System.out.println("Result of your max:\n" + groupBy + "\t" + attName + "\n" + uniqueGroup + "\t\t" + maxSoFar);
		return column;
	}
		
		
	//Group max aggregate function
	public ArrayList<Object> groupMin(String groupBy, String uniqueGroup, String attName) {
		boolean attExists = false;
		for(Attribute a: attributes) {
			if(a.getName().equals(attName)) {
				attExists = true;
				break;
			}
		}
		if(!attExists) {
			throw new IllegalArgumentException("invalid column name");
		}
		ArrayList<Object> column = new ArrayList<Object>();
		for(Tuple t: tuples) {
			Object groupVal = t.getAttribute(groupBy);
			if(groupVal == uniqueGroup) {
				column.add(t.getAttribute(attName));
			}
		}
		Integer minSoFar = (Integer) column.get(0);
          for(Object o: column) {
              Integer s = (Integer) o;
              if(s.compareTo(minSoFar) < 0) {
                  minSoFar = s;
              }
          }
        System.out.println("Result of your min:\n" + groupBy + "\t" + attName + "\n" + uniqueGroup + "\t\t" + minSoFar);
		return column;
	}
		
	//Group sum aggregate function
	public ArrayList<Object> groupSum(String groupBy, String uniqueGroup, String attName) {
		boolean attExists = false;
		for(Attribute a: attributes) {
			if(a.getName().equals(attName)) {
				attExists = true;
				break;
			}
		}
		if(!attExists) {
			throw new IllegalArgumentException("invalid column name");
		}
		ArrayList<Object> column = new ArrayList<Object>();
		for(Tuple t: tuples) {
			Object groupVal = t.getAttribute(groupBy);
			if(groupVal == uniqueGroup) {
				column.add(t.getAttribute(attName));
			}
		}
		int sum = 0;
		for(Object o: column) {
      	  int temp = ((Integer) o).intValue();
      	  sum += temp;
        }
        System.out.println("Result of your sum:\n" + groupBy + "\t" + attName + "\n" + uniqueGroup + "\t\t" + sum);
		return column;
	}
	
	//Group sum aggregate function
	public ArrayList<Object> groupCount(String groupBy, String uniqueGroup) {
		boolean attExists = false;
		for(Attribute a: attributes) {
			if(a.getName().equals(groupBy)) {
				attExists = true;
				break;
			}
		}
		if(!attExists) {
			throw new IllegalArgumentException("invalid column name");
		}
		ArrayList<Object> column = new ArrayList<Object>();
		for(Tuple t: tuples) {
			Object groupVal = t.getAttribute(groupBy);
			if(groupVal == uniqueGroup) {
				column.add(t.getAttribute(groupBy));
			}
		}
		int count = 0;
		for(int i = 0; i < column.size(); i++) {
			count++;
		}
		System.out.println("You counted the group by\n" + groupBy + "\n" + uniqueGroup + "\t = " + count);
		return column;
	}

	//Group sum aggregate function
	public ArrayList<Object> groupAvgRnd(String groupBy, String uniqueGroup, String attName) {
		boolean attExists = false;
		for(Attribute a: attributes) {
			if(a.getName().equals(attName)) {
					attExists = true;
				break;
			}
		}
		if(!attExists) {
			throw new IllegalArgumentException("invalid column name");
		}
		ArrayList<Object> column = new ArrayList<Object>();
		for(Tuple t: tuples) {
			Object groupVal = t.getAttribute(groupBy);
			if(groupVal == uniqueGroup) {
				column.add(t.getAttribute(attName));
			}
		}
		int sum = 0;
		for(Object o: column) {
      	  int temp = ((Integer) o).intValue();
      	  sum += temp;
        }
		int count = 0;
		for(int i = 0; i < column.size(); i++) {
			count++;
		}
		int avgRnd = Math.round(sum/count);
        System.out.println("Result of your avg:\n" + groupBy + "\t" + attName + "\n" + uniqueGroup + "\t\t" + avgRnd);
		return column;
	}
	
	
	//Prints a Relation
	public void printRelation() {
		String str = "RELATION: " + this.name + "\n";
		for( Attribute attr : attributes ) {
			str += attr.getName() + "\t";
		}
		str += "\n";
		for (Tuple tuple : this.tuples) {
			for(Attribute attr: attributes ) {
				Object val = tuple.getAttribute(attr.getName());
				str += val + "\t\t";
			}
			str += "\n";
		}
		System.out.println(str);
	}
     
}
