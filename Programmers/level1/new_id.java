class Solution {
    private static final int LEVEL = 7;
    public String solution(String new_id) {
        return levelControl(new_id);
    }
    
    private String levelControl(String id) {
        String change_id = "";
        for(int lev = 1; lev <= LEVEL; lev++) {  
            switch(lev) {
                case 1 : change_id = id.toLowerCase();
                        break;
                case 2 : change_id = removeSpecials(change_id);
                        break;
                case 3 : change_id = change_id.replaceAll("[.]+",".");
                        break;
                case 4 : change_id = removeFirstAndLastChar(change_id);  
                        break;
                case 5 : change_id = change_id.isEmpty() ? change_id = "a" : change_id;
                        break;
                case 6 : change_id = checkCharLength(change_id);
                        break;
                case 7 : change_id = checkLastCharLength(change_id);
                        break;
            }
        }
        return change_id;
    }
    
    private String checkLastCharLength(String id) {
        if(id.isEmpty()) return id;
        
        String change_id = id;
        try {
            if(id.length() < 3) {
                for(int i = id.length(); i < 3; i++) {
                    change_id+=String.valueOf(id.charAt(id.length()-1));
                }
                return change_id;   
            }
        }
        catch(Exception e) {
            System.out.println(e); 
        }
        return id;
    }
    
    private String checkCharLength(String id) {
        String change_id = "";
        try{
            if(id.length() > 15) {
                change_id = id.substring(0, 15);            
                if(String.valueOf(change_id.charAt(change_id.length()-1)).equals(".")) {                
                    change_id = id.substring(0, 14);    
                    return change_id;
                }
                return change_id;
            }
        } catch(Exception e) {
            System.out.println(e); 
        }
        return id;
    }
    
    private String removeFirstAndLastChar(String id) {
        if(id.isEmpty()) return id;
        StringBuilder change_id = null;
        try {
            change_id = new StringBuilder(id);
            if(String.valueOf(id.charAt(0)).equals(".")){
               change_id.deleteCharAt(0); 
            }                        
            if(String.valueOf(id.charAt(id.length()-1)).equals(".")) {
                change_id.deleteCharAt(change_id.length()-1); 
            }
        } catch(Exception e) {
            System.out.println(e); 
        }
        return change_id.toString();
    }
    
    private String removeSpecials(String id){       
		String match = "[^0-9a-z\\s-_.]";
		id =id.replaceAll(match, "");
		return id;
	}
}