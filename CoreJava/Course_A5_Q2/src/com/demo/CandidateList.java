package com.demo;

public class CandidateList {
	private Candidate hindicandidate[];
	private Candidate englishcandidate[];
	private Candidate mathscandidate[];
	int size_hindi,size_english,size_maths;
			
	public CandidateList() {
		super();
		this.hindicandidate = new Candidate[10];
		this.englishcandidate = new Candidate[10];
		this.mathscandidate = new Candidate[10];	
		size_hindi=0;
		size_english=0;
		size_maths=0;
	};
	
	public void addHindi(Candidate candidate){
		if(size_hindi<10){
		hindicandidate[size_hindi]=candidate;
		size_hindi++;
		}else{
			System.out.println("cannot be added further");
		}
	}
	
//	public void deleteHindi(){
//			hindicandidate[hindicandidate.length-1]=null;
//	}
	
	public void addEnglish(Candidate candidate){
		if(size_english<10){
		englishcandidate[size_english]=candidate;
		size_english++;
		}else{
			System.out.println("cannot be added further");
		}
	}
	
//	public void deleteEnglish(){
//			hindicandidate[englishcandidate.length-1]=null;
//	}
	
	public void addMaths(Candidate candidate){
		if(size_maths<10){
		mathscandidate[size_maths]=candidate;
		size_maths++;
		}else{
			System.out.println("cannot be added further");
		}
	}
	
//	public void deleteMaths(){
//			mathscandidate[mathscandidate.length-1]=null;
//	}
	
	void display_Maths() {
		for(Candidate ele:mathscandidate) {
			if(ele!=null)
				System.out.print(ele.toString());
		}
	}
	
	void display_English() {
		for(Candidate ele:englishcandidate) {
			if(ele!=null)
				System.out.print(ele.toString());
		}
	}
	
	void display_Hindi() {
		for(Candidate ele:hindicandidate) {
			if(ele!=null)
				System.out.print(ele.toString());
		}
	}
	
}
