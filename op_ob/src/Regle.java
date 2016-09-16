import java.util.ArrayList;


public class Regle {
	
	ArrayList<String> liste_premisses;
	String consequence;
	
	public Regle(ArrayList<String> lp, String c){
		liste_premisses = lp;
		consequence = c;
	}
	
 	public String getConsequence(){
		return consequence;
	}
	
 	public boolean satisfaitCondition(String fait){
		for(String t : liste_premisses)
			if(fait.equals(t))
				return true;
		return false;
	}
	
 	public boolean satisfaitConditions(ArrayList<String> faits){
		if(faits.size() < liste_premisses.size())
			return false;
		
		int compteurPremmissesSatisfaites = 0;
		
		for(String s : faits)
			if(satisfaitCondition(s))
				compteurPremmissesSatisfaites++;
		
		return (compteurPremmissesSatisfaites == liste_premisses.size());
	}

}
