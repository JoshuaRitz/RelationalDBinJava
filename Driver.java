package hashDB;

import java.util.ArrayList;
import java.util.HashMap;

public class Driver {

	public static void main(String[] args) {

			
		ArrayList<Attribute> agentAttrs = new ArrayList<Attribute>();
		agentAttrs.add( new Attribute("AGENT_CODE", String.class) );	
		agentAttrs.add( new Attribute("AGENT_NAME", String.class) );
		agentAttrs.add( new Attribute("WORKING_AREA", String.class) );
		agentAttrs.add( new Attribute("COMMISSION_PER", Integer.class) );
		agentAttrs.add( new Attribute("PHONE_NO", Integer.class) );
		
		Relation agents = new Relation("AGENT", agentAttrs, "AGENT_CODE", null);
		RelSchema agentOrder = new RelSchema();
		RelSchema customerOrder = new RelSchema();
		
		HashMap<String, Object> agent1 = new HashMap<String, Object>();
		agent1.put("AGENT_CODE", "A001");
		agent1.put("AGENT_NAME", "Hugo");
		agent1.put("WORKING_AREA", "Paris");
		agent1.put("COMMISSION_PER", Integer.valueOf(14));
		agent1.put("PHONE_NO", Integer.valueOf(12346674));
		
		HashMap<String, Object> agent2 = new HashMap<String, Object>();
		agent2.put("AGENT_CODE", "A002");
		agent2.put("AGENT_NAME", "Mukesh");
		agent2.put("WORKING_AREA", "Mumbai");
		agent2.put("COMMISSION_PER", Integer.valueOf(11));
		agent2.put("PHONE_NO", Integer.valueOf(12358964));

		HashMap<String, Object> agent3 = new HashMap<String, Object>();
		agent3.put("AGENT_CODE", "A003");
		agent3.put("AGENT_NAME", "Alex");
		agent3.put("WORKING_AREA", "London");
		agent3.put("COMMISSION_PER", Integer.valueOf(13));
		agent3.put("PHONE_NO", Integer.valueOf(12458969));
		
		HashMap<String, Object> agent4 = new HashMap<String, Object>();
		agent4.put("AGENT_CODE", "A004");
		agent4.put("AGENT_NAME", "Ivan");
		agent4.put("WORKING_AREA", "Toronto");
		agent4.put("COMMISSION_PER", Integer.valueOf(15));
		agent4.put("PHONE_NO", Integer.valueOf(22544166));
		
		HashMap<String, Object> agent5 = new HashMap<String, Object>();
		agent5.put("AGENT_CODE", "A005");
		agent5.put("AGENT_NAME", "Anderson");
		agent5.put("WORKING_AREA", "Brisbane");
		agent5.put("COMMISSION_PER", Integer.valueOf(13));
		agent5.put("PHONE_NO", Integer.valueOf(21447739));
		
		HashMap<String, Object> agent6 = new HashMap<String, Object>();
		agent6.put("AGENT_CODE", "A006");
		agent6.put("AGENT_NAME", "McDenny");
		agent6.put("WORKING_AREA", "London");
		agent6.put("COMMISSION_PER", Integer.valueOf(15));
		agent6.put("PHONE_NO", Integer.valueOf(22255588));
		
		HashMap<String, Object> agent7 = new HashMap<String, Object>();
		agent7.put("AGENT_CODE", "A007");
		agent7.put("AGENT_NAME", "Ramasundar");
		agent7.put("WORKING_AREA", "Bangalore");
		agent7.put("COMMISSION_PER", Integer.valueOf(15));
		agent7.put("PHONE_NO", Integer.valueOf(25814763));
		
		HashMap<String, Object> agent8 = new HashMap<String, Object>();
		agent8.put("AGENT_CODE", "A008");
		agent8.put("AGENT_NAME", "Alfred");
		agent8.put("WORKING_AREA", "New York");
		agent8.put("COMMISSION_PER", Integer.valueOf(12));
		agent8.put("PHONE_NO", Integer.valueOf(25874365));
		
		HashMap<String, Object> agent9 = new HashMap<String, Object>();
		agent9.put("AGENT_CODE", "A009");
		agent9.put("AGENT_NAME", "Benjamin");
		agent9.put("WORKING_AREA", "Hampshire");
		agent9.put("COMMISSION_PER", Integer.valueOf(11));
		agent9.put("PHONE_NO", Integer.valueOf(22536178));
		
		HashMap<String, Object> agent10 = new HashMap<String, Object>();
		agent10.put("AGENT_CODE", "A010");
		agent10.put("AGENT_NAME", "Sanchez");
		agent10.put("WORKING_AREA", "Madrid");
		agent10.put("COMMISSION_PER", Integer.valueOf(14));
		agent10.put("PHONE_NO", Integer.valueOf(22388644));
		
		HashMap<String, Object> agent11 = new HashMap<String, Object>();
		agent11.put("AGENT_CODE", "A001");
		agent11.put("AGENT_NAME", "Stevens");
		agent11.put("WORKING_AREA", "Dublin");
		agent11.put("COMMISSION_PER", Integer.valueOf(15));
		agent11.put("PHONE_NO", Integer.valueOf(45625874));
		
		HashMap<String, Object> agent12 = new HashMap<String, Object>();
		agent12.put("AGENT_CODE", "A011");
		agent12.put("AGENT_NAME", "Stevens");
		agent12.put("WORKING_AREA", "Dublin");
		agent12.put("COMMISSION_PER", Integer.valueOf(15));
		agent12.put("PHONE_NO", Integer.valueOf(45625874));
	
		HashMap<String, Object> agent13 = new HashMap<String, Object>();
		agent13.put("AGENT_CODE", "A012");
		agent13.put("AGENT_NAME", "Lucida");
		agent13.put("WORKING_AREA", "San Jose");
		agent13.put("COMMISSION_PER", Integer.valueOf(12));
		agent13.put("PHONE_NO", Integer.valueOf(52981425));
	
		HashMap<String, Object> agent14 = new HashMap<String, Object>();
		agent14.put("AGENT_CODE", "A005");
		agent14.put("AGENT_NAME", "Anderson");
		agent14.put("WORKING_AREA", "Brisbane");
		agent14.put("COMMISSION_PER", Integer.valueOf(13));
		agent14.put("PHONE_NO", Integer.valueOf(21447739));

		agents.insertTuple(new Tuple(agent1));
		agents.insertTuple(new Tuple(agent2));
		agents.insertTuple(new Tuple(agent3));
		agents.insertTuple(new Tuple(agent4));
		agents.insertTuple(new Tuple(agent5));
		agents.insertTuple(new Tuple(agent6));
		agents.insertTuple(new Tuple(agent7));
		agents.insertTuple(new Tuple(agent8));
		agents.insertTuple(new Tuple(agent9));
		agents.insertTuple(new Tuple(agent10));
		agents.insertTuple(new Tuple(agent11));
		agents.insertTuple(new Tuple(agent12));
		agents.insertTuple(new Tuple(agent13));
		agents.insertTuple(new Tuple(agent14));
		
		agents.printRelation();

		ArrayList<Attribute> custAttr = new ArrayList<Attribute>();
		custAttr.add( new Attribute("CUST_CODE", String.class) );
		custAttr.add( new Attribute("CUST_NAME", String.class) );
		custAttr.add( new Attribute("CUST_CITY", String.class) );
		custAttr.add( new Attribute("CUST_COUNTRY", String.class) );
		custAttr.add( new Attribute("GRADE", Integer.class) );
		custAttr.add( new Attribute("BALANCE", Integer.class) );
		
		Relation customers = new Relation("CUSTOMERS", custAttr, "CUST_CODE", null);
		
		HashMap<String, Object> customer1 = new HashMap<String, Object>();
		customer1.put("CUST_CODE", "C00014");
		customer1.put("CUST_NAME", "Victor");
		customer1.put("CUST_CITY", "Paris");
		customer1.put("CUST_COUNTRY", "France");
		customer1.put("GRADE", Integer.valueOf(2));
		customer1.put("BALANCE", Integer.valueOf(8000));
		
		HashMap<String, Object> customer2 = new HashMap<String, Object>();
		customer2.put("CUST_CODE", "C00005");
		customer2.put("CUST_NAME", "Sasikant");
		customer2.put("CUST_CITY", "Mumbai");
		customer2.put("CUST_COUNTRY", "India");
		customer2.put("GRADE", Integer.valueOf(1));
		customer2.put("BALANCE", Integer.valueOf(7000));
		
		HashMap<String, Object> customer3 = new HashMap<String, Object>();
		customer3.put("CUST_CODE", "C00009");
		customer3.put("CUST_NAME", "Ramesh");
		customer3.put("CUST_CITY", "Mumbai");
		customer3.put("CUST_COUNTRY", "India");
		customer3.put("GRADE", Integer.valueOf(3));
		customer3.put("BALANCE", Integer.valueOf(8000));
		
		HashMap<String, Object> customer4 = new HashMap<String, Object>();
		customer4.put("CUST_CODE", "C00022");
		customer4.put("CUST_NAME", "Avinash");
		customer4.put("CUST_CITY", "Mumbai");
		customer4.put("CUST_COUNTRY", "India");
		customer4.put("GRADE", Integer.valueOf(2));
		customer4.put("BALANCE", Integer.valueOf(7000));
		
		HashMap<String, Object> customer5 = new HashMap<String, Object>();
		customer5.put("CUST_CODE", "C00013");
		customer5.put("CUST_NAME", "Holmes");
		customer5.put("CUST_CITY", "London");
		customer5.put("CUST_COUNTRY", "UK");
		customer5.put("GRADE", Integer.valueOf(2));
		customer5.put("BALANCE", Integer.valueOf(6000));
		
		HashMap<String, Object> customer6 = new HashMap<String, Object>();
		customer6.put("CUST_CODE", "C00015");
		customer6.put("CUST_NAME", "Stuart");
		customer6.put("CUST_CITY", "London");
		customer6.put("CUST_COUNTRY", "UK");
		customer6.put("GRADE", Integer.valueOf(1));
		customer6.put("BALANCE", Integer.valueOf(6000));
		
		HashMap<String, Object> customer7 = new HashMap<String, Object>();
		customer7.put("CUST_CODE", "C00003");
		customer7.put("CUST_NAME", "Martin");
		customer7.put("CUST_CITY", "Toronto");
		customer7.put("CUST_COUNTRY", "Canada");
		customer7.put("GRADE", Integer.valueOf(2));
		customer7.put("BALANCE", Integer.valueOf(8000));
	
		HashMap<String, Object> customer8 = new HashMap<String, Object>();
		customer8.put("CUST_CODE", "C00006");
		customer8.put("CUST_NAME", "Shilton");
		customer8.put("CUST_CITY", "Toronto");
		customer8.put("CUST_COUNTRY", "Canada");
		customer8.put("GRADE", Integer.valueOf(1));
		customer8.put("BALANCE", Integer.valueOf(10000));
		
		HashMap<String, Object> customer9 = new HashMap<String, Object>();
		customer9.put("CUST_CODE", "C00008");
		customer9.put("CUST_NAME", "Karolina");
		customer9.put("CUST_CITY", "Toronto");
		customer9.put("CUST_COUNTRY", "Canada");
		customer9.put("GRADE", Integer.valueOf(1));
		customer9.put("BALANCE", Integer.valueOf(7000));
		
		HashMap<String, Object> customer10 = new HashMap<String, Object>();
		customer10.put("CUST_CODE", "C00004");
		customer10.put("CUST_NAME", "Winston");
		customer10.put("CUST_CITY", "Brisbane");
		customer10.put("CUST_COUNTRY", "Australia");
		customer10.put("GRADE", Integer.valueOf(1));
		customer10.put("BALANCE", Integer.valueOf(5000));
		
		HashMap<String, Object> customer11 = new HashMap<String, Object>();
		customer11.put("CUST_CODE", "C00018");
		customer11.put("CUST_NAME", "Fleming");
		customer11.put("CUST_CITY", "Brisbane");
		customer11.put("CUST_COUNTRY", "Australia");
		customer11.put("GRADE", Integer.valueOf(2));
		customer11.put("BALANCE", Integer.valueOf(7000));
		
		HashMap<String, Object> customer12 = new HashMap<String, Object>();
		customer12.put("CUST_CODE", "C01011");
		customer12.put("CUST_NAME", "Salvador");
		customer12.put("CUST_CITY", "Madrid");
		customer12.put("CUST_COUNTRY", Integer.valueOf(0));
		customer12.put("GRADE", "Spain");
		customer12.put("BALANCE", Integer.valueOf(1000));
		
		HashMap<String, Object> customer13 = new HashMap<String, Object>();
		customer13.put("CUST_CODE", "C00021");
		customer13.put("CUST_NAME", "Jacks");
		customer13.put("CUST_CITY", "Brisbane");
		customer13.put("CUST_COUNTRY", "Australia");
		customer13.put("GRADE", Integer.valueOf(1));
		customer13.put("BALANCE", Integer.valueOf(7000));
		
		HashMap<String, Object> customer14 = new HashMap<String, Object>();
		customer14.put("CUST_CODE", "C00023");
		customer14.put("CUST_NAME", "Karl");
		customer14.put("CUST_CITY", "London");
		customer14.put("CUST_COUNTRY", "UK");
		customer14.put("GRADE", Integer.valueOf(0));
		customer14.put("BALANCE", Integer.valueOf(4000));
		
		HashMap<String, Object> customer15 = new HashMap<String, Object>();
		customer15.put("CUST_CODE", "C00024");
		customer15.put("CUST_NAME", "Cook");
		customer15.put("CUST_CITY", "London");
		customer15.put("CUST_COUNTRY", "UK");
		customer15.put("GRADE", Integer.valueOf(2));
		customer15.put("BALANCE", Integer.valueOf(4000));
		
		HashMap<String, Object> customer16 = new HashMap<String, Object>();
		customer16.put("CUST_CODE", "C00016");
		customer16.put("CUST_NAME", "Venkatpati");
		customer16.put("CUST_CITY", "Bangalore");
		customer16.put("CUST_COUNTRY", "India");
		customer16.put("GRADE", Integer.valueOf(2));
		customer16.put("BALANCE", Integer.valueOf(8000));
		
		HashMap<String, Object> customer17 = new HashMap<String, Object>();
		customer17.put("CUST_CODE", "C00017");
		customer17.put("CUST_NAME", "Srinivas");
		customer17.put("CUST_CITY", "Bangalore");
		customer17.put("CUST_COUNTRY", "India");
		customer17.put("GRADE", Integer.valueOf(2));
		customer17.put("BALANCE", Integer.valueOf(8000));
		
		HashMap<String, Object> customer18 = new HashMap<String, Object>();
		customer18.put("CUST_CODE", "C00001");
		customer18.put("CUST_NAME", "Micheal");
		customer18.put("CUST_CITY", "New York");
		customer18.put("CUST_COUNTRY", "USA");
		customer18.put("GRADE", Integer.valueOf(2));
		customer18.put("BALANCE", Integer.valueOf(3000));
		
		HashMap<String, Object> customer19 = new HashMap<String, Object>();
		customer19.put("CUST_CODE", "C00002");
		customer19.put("CUST_NAME", "Bolt");
		customer19.put("CUST_CITY", "New York");
		customer19.put("CUST_COUNTRY", "USA");
		customer19.put("GRADE", Integer.valueOf(3));
		customer19.put("BALANCE", Integer.valueOf(5000));
		
		HashMap<String, Object> customer20 = new HashMap<String, Object>();
		customer20.put("CUST_CODE", "C00013");
		customer20.put("CUST_NAME", "Erin");
		customer20.put("CUST_CITY", "Los Angeles");
		customer20.put("CUST_COUNTRY", "USA");
		customer20.put("GRADE", Integer.valueOf(5));
		customer20.put("BALANCE", Integer.valueOf(7000));
		
		HashMap<String, Object> customer21 = new HashMap<String, Object>();
		customer21.put("CUST_CODE", "C00020");
		customer21.put("CUST_NAME", "Albert");
		customer21.put("CUST_CITY", "New York");
		customer21.put("CUST_COUNTRY", "USA");
		customer21.put("GRADE", Integer.valueOf(3));
		customer21.put("BALANCE", Integer.valueOf(5000));
		
		HashMap<String, Object> customer22 = new HashMap<String, Object>();
		customer22.put("CUST_CODE", "C00010");
		customer22.put("CUST_NAME", "Charles");
		customer22.put("CUST_CITY", "Hampshire");
		customer22.put("CUST_COUNTRY", "UK");
		customer22.put("GRADE", Integer.valueOf(3));
		customer22.put("BALANCE", Integer.valueOf(6000));
		
		HashMap<String, Object> customer23 = new HashMap<String, Object>();
		customer23.put("CUST_CODE", "C00007");
		customer23.put("CUST_NAME", "Oscar");
		customer23.put("CUST_CITY", "Madrid");
		customer23.put("CUST_COUNTRY", "Spain");
		customer23.put("GRADE", Integer.valueOf(1));
		customer23.put("BALANCE", Integer.valueOf(7000));
		
		HashMap<String, Object> customer24 = new HashMap<String, Object>();
		customer24.put("CUST_CODE", "C00011");
		customer24.put("CUST_NAME", "Sergio");
		customer24.put("CUST_CITY", "Madrid");
		customer24.put("CUST_COUNTRY", "Spain");
		customer24.put("GRADE", Integer.valueOf(3));
		customer24.put("BALANCE", Integer.valueOf(7000));
		
		HashMap<String, Object> customer25 = new HashMap<String, Object>();
		customer25.put("CUST_CODE", "C00019");
		customer25.put("CUST_NAME", "Alberto");
		customer25.put("CUST_CITY", "Madrid");
		customer25.put("CUST_COUNTRY", "Spain");
		customer25.put("GRADE", Integer.valueOf(1));
		customer25.put("BALANCE", Integer.valueOf(8000));
		
		HashMap<String, Object> customer26 = new HashMap<String, Object>();
		customer26.put("CUST_CODE", "C00011");
		customer26.put("CUST_NAME", "Tara");
		customer26.put("CUST_CITY", "London");
		customer26.put("CUST_COUNTRY", "UK");
		customer26.put("GRADE", Integer.valueOf(2));
		customer26.put("BALANCE", Integer.valueOf(1000));
		
		HashMap<String, Object> customer27 = new HashMap<String, Object>();
		customer27.put("CUST_CODE", "C00025");
		customer27.put("CUST_NAME", "Gary");
		customer27.put("CUST_CITY", "Dublin");
		customer27.put("CUST_COUNTRY", "Ireland");
		customer27.put("GRADE", Integer.valueOf(2));
		customer27.put("BALANCE", Integer.valueOf(5000));
		
		HashMap<String, Object> customer28 = new HashMap<String, Object>();
		customer28.put("CUST_CODE", "C00012");
		customer28.put("CUST_NAME", "Steven");
		customer28.put("CUST_CITY", "San Jose");
		customer28.put("CUST_COUNTRY", "USA");
		customer28.put("GRADE", Integer.valueOf(1));
		customer28.put("BALANCE", Integer.valueOf(5000));
		
		customers.insertTuple(new Tuple(customer1));
		customers.insertTuple(new Tuple(customer2));
		customers.insertTuple(new Tuple(customer3));
		customers.insertTuple(new Tuple(customer4));
		customers.insertTuple(new Tuple(customer5));
		customers.insertTuple(new Tuple(customer6));
		customers.insertTuple(new Tuple(customer7));
		customers.insertTuple(new Tuple(customer8));
		customers.insertTuple(new Tuple(customer9));
		customers.insertTuple(new Tuple(customer10));
		customers.insertTuple(new Tuple(customer11));
		customers.insertTuple(new Tuple(customer12));
		customers.insertTuple(new Tuple(customer13));
		customers.insertTuple(new Tuple(customer14));
		customers.insertTuple(new Tuple(customer15));
		customers.insertTuple(new Tuple(customer16));
		customers.insertTuple(new Tuple(customer17));
		customers.insertTuple(new Tuple(customer18));
		customers.insertTuple(new Tuple(customer19));
		customers.insertTuple(new Tuple(customer20));
		customers.insertTuple(new Tuple(customer21));
		customers.insertTuple(new Tuple(customer22));
		customers.insertTuple(new Tuple(customer23));
		customers.insertTuple(new Tuple(customer24));
		customers.insertTuple(new Tuple(customer25));
		customers.insertTuple(new Tuple(customer26));
		customers.insertTuple(new Tuple(customer27));
		customers.insertTuple(new Tuple(customer28));
		
		customers.printRelation();
		
		//Creating list of primary key values
		agents.primaryKeyVals("AGENT_CODE");
		customers.primaryKeyVals("CUST_CODE");
		
		ArrayList<Attribute> ordAttr = new ArrayList<Attribute>();
		ordAttr.add( new Attribute("ORD_NUM", Integer.class) );
		ordAttr.add( new Attribute("ORD_AMOUNT", Integer.class) );
		ordAttr.add( new Attribute("ADVANCE_AMOUNT", Integer.class) );
		ordAttr.add( new Attribute("ORD_DATE", String.class) );
		ordAttr.add( new Attribute("CUST_CODE", String.class) );
		ordAttr.add( new Attribute("AGENT_CODE", String.class) );
		
		ArrayList<String> orderFks = new ArrayList<String>();
		orderFks.add("CUST_CODE");
		orderFks.add("AGENT_CODE");
		
		Relation orders = new Relation("ORDERS", ordAttr, "ORD_NUM", orderFks);
		
		HashMap<String, Object> order1 = new HashMap<String, Object>();
		order1.put("ORD_NUM", Integer.valueOf(200117));
		order1.put("ORD_AMOUNT", Integer.valueOf(800));
		order1.put("ADVANCE_AMOUNT", Integer.valueOf(200));
		order1.put("ORD_DATE", "10/20/2008");
		order1.put("CUST_CODE", "C00014");
		order1.put("AGENT_CODE", "A001");
		
		HashMap<String, Object> order2 = new HashMap<String, Object>();
		order2.put("ORD_NUM", Integer.valueOf(200106));
		order2.put("ORD_AMOUNT", Integer.valueOf(2500));
		order2.put("ADVANCE_AMOUNT", Integer.valueOf(700));
		order2.put("ORD_DATE", "04/20/2008");
		order2.put("CUST_CODE", "C00005");
		order2.put("AGENT_CODE", "A002");
		
		HashMap<String, Object> order3 = new HashMap<String, Object>();
		order3.put("ORD_NUM", Integer.valueOf(200113));
		order3.put("ORD_AMOUNT", Integer.valueOf(4000));
		order3.put("ADVANCE_AMOUNT", Integer.valueOf(600));
		order3.put("ORD_DATE", "06/10/2008");
		order3.put("CUST_CODE", "C00022");
		order3.put("AGENT_CODE", "A002");
		
		HashMap<String, Object> order4 = new HashMap<String, Object>();
		order4.put("ORD_NUM", Integer.valueOf(200120));
		order4.put("ORD_AMOUNT", Integer.valueOf(500));
		order4.put("ADVANCE_AMOUNT", Integer.valueOf(100));
		order4.put("ORD_DATE", "07/20/2008");
		order4.put("CUST_CODE", "C00009");
		order4.put("AGENT_CODE", "A002");
		
		HashMap<String, Object> order5 = new HashMap<String, Object>();
		order5.put("ORD_NUM", Integer.valueOf(200123));
		order5.put("ORD_AMOUNT", Integer.valueOf(500));
		order5.put("ADVANCE_AMOUNT", Integer.valueOf(100));
		order5.put("ORD_DATE", "09/16/2008");
		order5.put("CUST_CODE", "C00022");
		order5.put("AGENT_CODE", "A002");
		
		HashMap<String, Object> order6 = new HashMap<String, Object>();
		order6.put("ORD_NUM", Integer.valueOf(200126));
		order6.put("ORD_AMOUNT", Integer.valueOf(500));
		order6.put("ADVANCE_AMOUNT", Integer.valueOf(100));
		order6.put("ORD_DATE", "06/24/2008");
		order6.put("CUST_CODE", "C00022");
		order6.put("AGENT_CODE", "A002");
		
		HashMap<String, Object> order7 = new HashMap<String, Object>();
		order7.put("ORD_NUM", Integer.valueOf(200128));
		order7.put("ORD_AMOUNT", Integer.valueOf(3500));
		order7.put("ADVANCE_AMOUNT", Integer.valueOf(1500));
		order7.put("ORD_DATE", "07/20/2008");
		order7.put("CUST_CODE", "C00009");
		order7.put("AGENT_CODE", "A002");
		
		HashMap<String, Object> order8 = new HashMap<String, Object>();
		order8.put("ORD_NUM", Integer.valueOf(200133));
		order8.put("ORD_AMOUNT", Integer.valueOf(1200));
		order8.put("ADVANCE_AMOUNT", Integer.valueOf(400));
		order8.put("ORD_DATE", "06/29/2008");
		order8.put("CUST_CODE", "C00009");
		order8.put("AGENT_CODE", "A002");
		
		HashMap<String, Object> order9 = new HashMap<String, Object>();
		order9.put("ORD_NUM", Integer.valueOf(200117));
		order9.put("ORD_AMOUNT", Integer.valueOf(1200));
		order9.put("ADVANCE_AMOUNT", Integer.valueOf(400));
		order9.put("ORD_DATE", "06/29/2008");
		order9.put("CUST_CODE", "C00009");
		order9.put("AGENT_CODE", "A002");
		
		HashMap<String, Object> order10 = new HashMap<String, Object>();
		order10.put("ORD_NUM", Integer.valueOf(200127));
		order10.put("ORD_AMOUNT", Integer.valueOf(2500));
		order10.put("ADVANCE_AMOUNT", Integer.valueOf(400));
		order10.put("ORD_DATE", "07/20/2008");
		order10.put("CUST_CODE", "C00015");
		order10.put("AGENT_CODE", "A003");
		
		HashMap<String, Object> order11 = new HashMap<String, Object>();
		order11.put("ORD_NUM", Integer.valueOf(200104));
		order11.put("ORD_AMOUNT", Integer.valueOf(1500));
		order11.put("ADVANCE_AMOUNT", Integer.valueOf(500));
		order11.put("ORD_DATE", "03/13/2008");
		order11.put("CUST_CODE", "C00006");
		order11.put("AGENT_CODE", "A004");
		
		HashMap<String, Object> order12 = new HashMap<String, Object>();
		order12.put("ORD_NUM", Integer.valueOf(200108));
		order12.put("ORD_AMOUNT", Integer.valueOf(4000));
		order12.put("ADVANCE_AMOUNT", Integer.valueOf(600));
		order12.put("ORD_DATE", "02/15/2008");
		order12.put("CUST_CODE", "C00008");
		order12.put("AGENT_CODE", "A004");
		
		HashMap<String, Object> order13 = new HashMap<String, Object>();
		order13.put("ORD_NUM", Integer.valueOf(200121));
		order13.put("ORD_AMOUNT", Integer.valueOf(1500));
		order13.put("ADVANCE_AMOUNT", Integer.valueOf(600));
		order13.put("ORD_DATE", "09/23/2008");
		order13.put("CUST_CODE", "C00008");
		order13.put("AGENT_CODE", "A004");
		
		HashMap<String, Object> order14 = new HashMap<String, Object>();
		order14.put("ORD_NUM", Integer.valueOf(200122));
		order14.put("ORD_AMOUNT", Integer.valueOf(2500));
		order14.put("ADVANCE_AMOUNT", Integer.valueOf(400));
		order14.put("ORD_DATE", "09/16/2008");
		order14.put("CUST_CODE", "C00003");
		order14.put("AGENT_CODE", "A004");
		
		HashMap<String, Object> order15 = new HashMap<String, Object>();
		order15.put("ORD_NUM", Integer.valueOf(200222));
		order15.put("ORD_AMOUNT", Integer.valueOf(2500));
		order15.put("ADVANCE_AMOUNT", Integer.valueOf(400));
		order15.put("ORD_DATE", "09/16/2008");
		order15.put("CUST_CODE", "C00004");
		order15.put("AGENT_CODE", "A004");
		
		HashMap<String, Object> order16 = new HashMap<String, Object>();
		order16.put("ORD_NUM", Integer.valueOf(200103));
		order16.put("ORD_AMOUNT", Integer.valueOf(1500));
		order16.put("ADVANCE_AMOUNT", Integer.valueOf(700));
		order16.put("ORD_DATE", "05/15/2008");
		order16.put("CUST_CODE", "C00021");
		order16.put("AGENT_CODE", "A005");
		
		HashMap<String, Object> order17 = new HashMap<String, Object>();
		order17.put("ORD_NUM", Integer.valueOf(200125));
		order17.put("ORD_AMOUNT", Integer.valueOf(2000));
		order17.put("ADVANCE_AMOUNT", Integer.valueOf(600));
		order17.put("ORD_DATE", "10/10/2008");
		order17.put("CUST_CODE", "C00018");
		order17.put("AGENT_CODE", "A005");
		
		HashMap<String, Object> order18 = new HashMap<String, Object>();
		order18.put("ORD_NUM", Integer.valueOf(200134));
		order18.put("ORD_AMOUNT", Integer.valueOf(4200));
		order18.put("ADVANCE_AMOUNT", Integer.valueOf(1800));
		order18.put("ORD_DATE", "09/25/2008");
		order18.put("CUST_CODE", "C00004");
		order18.put("AGENT_CODE", "A005");
		
		HashMap<String, Object> order19 = new HashMap<String, Object>();
		order19.put("ORD_NUM", Integer.valueOf(200136));
		order19.put("ORD_AMOUNT", Integer.valueOf(4200));
		order19.put("ADVANCE_AMOUNT", Integer.valueOf(1800));
		order19.put("ORD_DATE", "09/25/2008");
		order19.put("CUST_CODE", "C40004");
		order19.put("AGENT_CODE", "A005");
		
		HashMap<String, Object> order20 = new HashMap<String, Object>();
		order20.put("ORD_NUM", Integer.valueOf(200118));
		order20.put("ORD_AMOUNT", Integer.valueOf(500));
		order20.put("ADVANCE_AMOUNT", Integer.valueOf(100));
		order20.put("ORD_DATE", "07/20/2008");
		order20.put("CUST_CODE", "C00023");
		order20.put("AGENT_CODE", "A006");
		
		HashMap<String, Object> order21 = new HashMap<String, Object>();
		order21.put("ORD_NUM", Integer.valueOf(200129));
		order21.put("ORD_AMOUNT", Integer.valueOf(2500));
		order21.put("ADVANCE_AMOUNT", Integer.valueOf(500));
		order21.put("ORD_DATE", "07/20/2008");
		order21.put("CUST_CODE", "C00024");
		order21.put("AGENT_CODE", "A006");
		
		HashMap<String, Object> order22 = new HashMap<String, Object>();
		order22.put("ORD_NUM", Integer.valueOf(200112));
		order22.put("ORD_AMOUNT", Integer.valueOf(2000));
		order22.put("ADVANCE_AMOUNT", Integer.valueOf(400));
		order22.put("ORD_DATE", "05/30/2008");
		order22.put("CUST_CODE", "C00016");
		order22.put("AGENT_CODE", "A007");
		
		HashMap<String, Object> order23 = new HashMap<String, Object>();
		order23.put("ORD_NUM", Integer.valueOf(200124));
		order23.put("ORD_AMOUNT", Integer.valueOf(500));
		order23.put("ADVANCE_AMOUNT", Integer.valueOf(100));
		order23.put("ORD_DATE", "06/20/2008");
		order23.put("CUST_CODE", "C00017");
		order23.put("AGENT_CODE", "A007");
		
		HashMap<String, Object> order24 = new HashMap<String, Object>();
		order24.put("ORD_NUM", Integer.valueOf(200101));
		order24.put("ORD_AMOUNT", Integer.valueOf(3000));
		order24.put("ADVANCE_AMOUNT", Integer.valueOf(1000));
		order24.put("ORD_DATE", "07/15/2008");
		order24.put("CUST_CODE", "C00001");
		order24.put("AGENT_CODE", "A008");
		
		HashMap<String, Object> order25 = new HashMap<String, Object>();
		order25.put("ORD_NUM", Integer.valueOf(200111));
		order25.put("ORD_AMOUNT", Integer.valueOf(1000));
		order25.put("ADVANCE_AMOUNT", Integer.valueOf(300));
		order25.put("ORD_DATE", "07/10/2008");
		order25.put("CUST_CODE", "C00020");
		order25.put("AGENT_CODE", "A008");
		
		HashMap<String, Object> order26 = new HashMap<String, Object>();
		order26.put("ORD_NUM", Integer.valueOf(200114));
		order26.put("ORD_AMOUNT", Integer.valueOf(3500));
		order26.put("ADVANCE_AMOUNT", Integer.valueOf(2000));
		order26.put("ORD_DATE", "08/15/2008");
		order26.put("CUST_CODE", "C00002");
		order26.put("AGENT_CODE", "A008");
		
		HashMap<String, Object> order27 = new HashMap<String, Object>();
		order27.put("ORD_NUM", Integer.valueOf(200116));
		order27.put("ORD_AMOUNT", Integer.valueOf(500));
		order27.put("ADVANCE_AMOUNT", Integer.valueOf(100));
		order27.put("ORD_DATE", "07/16/2008");
		order27.put("CUST_CODE", "C00010");
		order27.put("AGENT_CODE", "A009");
		
		HashMap<String, Object> order28 = new HashMap<String, Object>();
		order28.put("ORD_NUM", Integer.valueOf(200107));
		order28.put("ORD_AMOUNT", Integer.valueOf(4500));
		order28.put("ADVANCE_AMOUNT", Integer.valueOf(900));
		order28.put("ORD_DATE", "08/30/2008");
		order28.put("CUST_CODE", "C00007");
		order28.put("AGENT_CODE", "A010");
		
		HashMap<String, Object> order29 = new HashMap<String, Object>();
		order29.put("ORD_NUM", Integer.valueOf(200109));
		order29.put("ORD_AMOUNT", Integer.valueOf(3500));
		order29.put("ADVANCE_AMOUNT", Integer.valueOf(800));
		order29.put("ORD_DATE", "07/30/2008");
		order29.put("CUST_CODE", "C00011");
		order29.put("AGENT_CODE", "A010");
		
		HashMap<String, Object> order30 = new HashMap<String, Object>();
		order30.put("ORD_NUM", Integer.valueOf(200110));
		order30.put("ORD_AMOUNT", Integer.valueOf(3000));
		order30.put("ADVANCE_AMOUNT", Integer.valueOf(500));
		order30.put("ORD_DATE", "04/15/2008");
		order30.put("CUST_CODE", "C00019");
		order30.put("AGENT_CODE", "A010");
		
		HashMap<String, Object> order31 = new HashMap<String, Object>();
		order31.put("ORD_NUM", Integer.valueOf(200119));
		order31.put("ORD_AMOUNT", Integer.valueOf(4000));
		order31.put("ADVANCE_AMOUNT", Integer.valueOf(700));
		order31.put("ORD_DATE", "09/16/2008");
		order31.put("CUST_CODE", "C00007");
		order31.put("AGENT_CODE", "A010");
		
		HashMap<String, Object> order32 = new HashMap<String, Object>();
		order32.put("ORD_NUM", Integer.valueOf(200135));
		order32.put("ORD_AMOUNT", Integer.valueOf(2000));
		order32.put("ADVANCE_AMOUNT", Integer.valueOf(800));
		order32.put("ORD_DATE", "09/16/2008");
		order32.put("CUST_CODE", "C00007");
		order32.put("AGENT_CODE", "A010");
		
		HashMap<String, Object> order33 = new HashMap<String, Object>();
		order33.put("ORD_NUM", Integer.valueOf(200105));
		order33.put("ORD_AMOUNT", Integer.valueOf(2500));
		order33.put("ADVANCE_AMOUNT", Integer.valueOf(500));
		order33.put("ORD_DATE", "07/18/2008");
		order33.put("CUST_CODE", "C00025");
		order33.put("AGENT_CODE", "A011");
		
		HashMap<String, Object> order34 = new HashMap<String, Object>();
		order34.put("ORD_NUM", Integer.valueOf(200130));
		order34.put("ORD_AMOUNT", Integer.valueOf(2500));
		order34.put("ADVANCE_AMOUNT", Integer.valueOf(400));
		order34.put("ORD_DATE", "07/30/2008");
		order34.put("CUST_CODE", "C00025");
		order34.put("AGENT_CODE", "A011");
		
		HashMap<String, Object> order35 = new HashMap<String, Object>();
		order35.put("ORD_NUM", Integer.valueOf(200102));
		order35.put("ORD_AMOUNT", Integer.valueOf(2000));
		order35.put("ADVANCE_AMOUNT", Integer.valueOf(300));
		order35.put("ORD_DATE", "05/25/2008");
		order35.put("CUST_CODE", "C00012");
		order35.put("AGENT_CODE", "A012");
		
		HashMap<String, Object> order36 = new HashMap<String, Object>();
		order36.put("ORD_NUM", Integer.valueOf(200131));
		order36.put("ORD_AMOUNT", Integer.valueOf(900));
		order36.put("ADVANCE_AMOUNT", Integer.valueOf(150));
		order36.put("ORD_DATE", "08/26/2008");
		order36.put("CUST_CODE", "C00012");
		order36.put("AGENT_CODE", "A012");
		
		HashMap<String, Object> order37 = new HashMap<String, Object>();
		order37.put("ORD_NUM", Integer.valueOf(200137));
		order37.put("ORD_AMOUNT", Integer.valueOf(2000));
		order37.put("ADVANCE_AMOUNT", Integer.valueOf(800));
		order37.put("ORD_DATE", "09/16/2008");
		order37.put("CUST_CODE", "C00007");
		order37.put("AGENT_CODE", "A110");
		
		orders.insertTuple(new Tuple(order1));
		orders.insertTuple(new Tuple(order2));
		orders.insertTuple(new Tuple(order3));
		orders.insertTuple(new Tuple(order4));
		orders.insertTuple(new Tuple(order5));
		orders.insertTuple(new Tuple(order6));
		orders.insertTuple(new Tuple(order7));
		orders.insertTuple(new Tuple(order8));
		orders.insertTuple(new Tuple(order9));
		orders.insertTuple(new Tuple(order10));
		orders.insertTuple(new Tuple(order11));
		orders.insertTuple(new Tuple(order12));
		orders.insertTuple(new Tuple(order13));
		orders.insertTuple(new Tuple(order14));
		orders.insertTuple(new Tuple(order15));
		orders.insertTuple(new Tuple(order16));
		orders.insertTuple(new Tuple(order17));
		orders.insertTuple(new Tuple(order18));
		orders.insertTuple(new Tuple(order19));
		orders.insertTuple(new Tuple(order20));
		orders.insertTuple(new Tuple(order21));
		orders.insertTuple(new Tuple(order22));
		orders.insertTuple(new Tuple(order23));
		orders.insertTuple(new Tuple(order24));
		orders.insertTuple(new Tuple(order25));
		orders.insertTuple(new Tuple(order26));
		orders.insertTuple(new Tuple(order27));
		orders.insertTuple(new Tuple(order28));
		orders.insertTuple(new Tuple(order29));
		orders.insertTuple(new Tuple(order30));
		orders.insertTuple(new Tuple(order31));
		orders.insertTuple(new Tuple(order32));
		orders.insertTuple(new Tuple(order33));
		orders.insertTuple(new Tuple(order34));
		orders.insertTuple(new Tuple(order35));
		orders.insertTuple(new Tuple(order36));
		orders.insertTuple(new Tuple(order37));
		
		orders.printRelation();
		
		//Creating list of primary key values
		orders.primaryKeyVals("ORD_NUM");
		
		
		//Adding agents and orders to relational schema for pk/fk relationship
		agentOrder.relations.put("AGENT", agents);
		agentOrder.relations.put("ORDERS", orders);
		agentOrder.addfK("AGENT", "AGENT_CODE", "ORDERS", "AGENT_CODE");
		
		
		customerOrder.relations.put("CUSTOMERS", customers);
		customerOrder.relations.put("ORDERS", orders);
		customerOrder.addfK("CUSTOMERS", "CUST_CODE", "ORDERS", "CUST_CODE");
		System.out.println();
		
		//Checking if orders keys conform with relational key constraints
		//Relational key check between pk/fk still needs debugging
		System.out.println(agentOrder.conformsWithfK("ORDERS", "AGENT_CODE", "A001"));
		System.out.println();
		
		//Updating tuples
		agents.updateTuple("AGENT_CODE", "A007", "AGENT_CODE", "A017");
		orders.updateTuple("ORD_NUM", 200222, "ORD_AMOUNT", 3400);
		orders.updateTuple("ORD_NUM", 200222, "CUST_CODE", "C1000");
		System.out.println();
		
		//Deleting agent code A017 and showing relation after deletion
		agents.deleteTuple("AGENT_CODE", "A017");
		orders.deleteTuple("ORD_NUM", 200222);
		System.out.println("Relations after deletion");
		agents.printRelation();
		orders.printRelation();
		
		//Returns a projection based on user provided attributes
		ArrayList<String> agentsProj = new ArrayList<String>();
		agentsProj.add("AGENT_CODE");
		agentsProj.add("WORKING_AREA");
		agents.projection3(agentsProj);
		
		//Selections
		orders.selection("AGENT_CODE", "A010");
		customers.selection("CUST_CITY", "London");
		
		//Aggregate function examples that will work
		orders.min("ORD_AMOUNT");
		System.out.println();
		orders.max("ORD_AMOUNT");
		System.out.println();
		orders.sum("ORD_AMOUNT");
		System.out.println();
		orders.count("ORD_AMOUNT");
		System.out.println();
		orders.averageRnd("ORD_AMOUNT");
		System.out.println();
		
		//Aggregate functions that should reject
		orders.min("ORD_DATE");
		System.out.println();
		orders.max("ORD_DATE");
		System.out.println();
		orders.sum("ORD_DATE");
		System.out.println();
		orders.averageRnd("ORD_DATE");
		System.out.println();
		
		//Group aggregate functions
		customers.groupSum("CUST_CITY", "London", "BALANCE");
		System.out.println();
		customers.groupCount("CUST_CITY", "London");
		System.out.println();
		customers.groupMax("CUST_CITY", "London", "BALANCE");
		System.out.println();
		customers.groupMin("CUST_CITY", "London", "BALANCE");
		System.out.println();
		customers.groupAvgRnd("CUST_CITY", "London", "BALANCE");
		System.out.println();
		
		
	}

}