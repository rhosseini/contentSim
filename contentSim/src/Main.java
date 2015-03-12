
public class Main {

	public static void main(String[] args) {
		/* 0: means aggregate the ratings of pretest groups separately; 
		   1: means consider all users to have the same level of pretest and aggregate all ratings on a question no matter of the pretest score of user.
		   -1: means treat each username as a pretest category
		*/
		int all = -1; 
		String all_rating = "ratings.csv";
		String outlier_rem_rating = "ratings.outlier.removed.csv";
//		EvaluationSim.evaluate(all_rating,all);
		EvaluationSim.evaluate(outlier_rem_rating,all);	
//		ContentSim cs = new ContentSim();
//		String[] contentversion = {"pp","s14","f14"};
//		cs.calculateSim("",contentversion[0]);		
	}
}
