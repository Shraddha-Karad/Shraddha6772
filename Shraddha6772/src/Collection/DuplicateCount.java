package Collection;

import java.util.ArrayList;

public class DuplicateCount {

	public static void main(String args[]){
	    ArrayList <String> list0 = new ArrayList<String>();
	        int count = 1;
	        //List <String> list = phraseList(phrase.toUpperCase());\
	        ArrayList<String> list = new ArrayList<String>();
	        list.add("a");
	        list.add("b");
	        list.add("a");
	        list.add("c");
	        list.add("b");
	        list.add("a");

	        for(int i = 0; i < list.size(); i++){
	            boolean isDuplicate = false;
	             for (String s: list0){
	                 if (s.contains(list.get(i).trim()))
	                     isDuplicate =true;
	             }

	            if (!isDuplicate){

	                  for(int j = i + 1; j < list.size(); j++){
	                    if(list.get(i).equals(list.get(j))){
	                      count++;
	                    }
	                  }
	                  if(list.get(i).equals("/s")){
	                    list0.add("Space" + "-" + count);
	                  }
	                  else{
	                    list0.add(list.get(i) + "-" + count);
	                  }
	                  count = 1;     
	            }
	        }
	        for (String a: list0)
	            System.out.println(a);          
	}
}
