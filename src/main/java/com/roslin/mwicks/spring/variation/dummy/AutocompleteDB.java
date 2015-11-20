package com.roslin.mwicks.spring.variation.dummy;


import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
  
public class AutocompleteDB {
	
    private int totalCountries = 17;
    private List<String> countries;
    private List<String> tags;
     
    public AutocompleteDB() {
    
    }

    
    public List<String> getData(String query) {
    	
   	 String data = "Afghanistan, Albania, Algeria, Andorra, Angola, Antigua & Deps,"+ 
                "United Kingdom,United States,Uruguay,Uzbekistan,Vanuatu,Vatican City,Venezuela,Vietnam,Yemen,Zambia,Zimbabwe";
 
        countries = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(data, ",");
         
        //Parse the country CSV list and set as Array
        while(st.hasMoreTokens()) {
            countries.add(st.nextToken().trim());
        }
        
       String country = null;
       query = query.toLowerCase();
       
   	System.out.println("countries.size() : " + countries.size());
   	System.out.println("totalCountries : " + totalCountries);
       
   	System.out.println("query : " + query);
   	
       List<String> matched = new ArrayList<String>();
       for(int i=0; i<totalCountries; i++) {
       	
           country = countries.get(i).toLowerCase();
           
       	System.out.println("country : " + country);
           
       	if(country.startsWith(query)) {
               matched.add(countries.get(i));
               
           	System.out.println("MATCHED!");
           }
       }
       return matched;
   }

}
