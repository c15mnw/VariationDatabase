package com.roslin.mwicks.spring.variation.dummy;


import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
  
public class DummyDB {
	
    private int totalCountries = 17;
    private List<String> countries;
    private List<String> tags;
     
    public DummyDB() {
 
        String data = "Afghanistan, Albania, Algeria, Andorra, Angola, Antigua & Deps,"+ 
                "United Kingdom,United States,Uruguay,Uzbekistan,Vanuatu,Vatican City,Venezuela,Vietnam,Yemen,Zambia,Zimbabwe";
 
        countries = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(data, ",");
         
        //Parse the country CSV list and set as Array
        while(st.hasMoreTokens()) {
            countries.add(st.nextToken().trim());
        }
 
        String strTags = "SharePoint, Spring, Struts, Java, JQuery, ASP, PHP, JavaScript, MySQL, ASP, .NET";
        tags = new ArrayList<String>();
        StringTokenizer st2 = new StringTokenizer(strTags, ",");
         
        //Parse the tags CSV list and set as Array
        while(st2.hasMoreTokens()) {
            tags.add(st2.nextToken().trim());
        }
     
    }
  
    public List<String> getCountryList(String query) {
                 
        String country = null;
        query = query.toLowerCase();
        List<String> matched = new ArrayList<String>();
        for(int i=0; i < countries.size(); i++) {
            country = countries.get(i).toLowerCase();
            if(country.startsWith(query)) {
                matched.add(countries.get(i));
            }
        }
        return matched;
    }
 
    public List<String> getTechList(String query) {
        String country = null;
        query = query.toUpperCase();
        List<String> matched = new ArrayList<String>();
        for(int i=0; i < tags.size(); i++) {
            country = tags.get(i).toUpperCase();
            if(country.startsWith(query)) {
                matched.add(tags.get(i));
            }
        }
        return matched;
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
