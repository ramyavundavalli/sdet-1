package APIActivities

class Activity1 {
	
	public static void main(def args) {
		
		def inputList = [11,2,19,5,"Mango", "Apple", "watermelon"]
		
		def strList = inputList.minus([11,2,19,5])
		def intList = inputList.minus(["Mango","Apple","watermelon"])
		
		println strList.sort()
		println intList.sort()
		
	}
	
}
