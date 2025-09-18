class Polynomial {
	double[] coefficients;
    
	public Polynomial() {
    		this.coefficients = new double[1];
	}
	public Polynomial(double[] coefficients) {
    		this.coefficients = new double[coefficients.length];
    		for(int i = 0; i < coefficients.length; i++) {
        		this.coefficients[i] = coefficients[i];
    		}
	}
    
	public Polynomial add(Polynomial p) {
    		int len = Math.max(p.coefficients.length, this.coefficients.length);
    		double[] sumCoefficients = new double[len];
   	 
    		for(int i = 0; i < len; i++){
       		 	if(i < p.coefficients.length) {
        	    	sumCoefficients[i] += p.coefficients[i];
        		}
        		if(i < this.coefficients.length) {
           	 		sumCoefficients[i] += this.coefficients[i];
        		}
    		}
   	 
    		Polynomial sump = new Polynomial(sumCoefficients);
    		return sump;
	}
    
	public double evaluate(double x) {
    		double runningSum = 0;
    		for(int i = 0; i < this.coefficients.length; i++) {
        		runningSum += this.coefficients[i] * Math.pow(x, i);
    		}   	 
    		return runningSum;
	}
    
	public boolean hasRoot(double root) {
    		return (this.evaluate(root) == 0.0);
	}
}
