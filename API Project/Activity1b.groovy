package APIActivities


class Activity1b {
	
	static void main(def args)
	{
		File file = new File("C:/Eclipse/APIProject/src/APIActivities/1b.txt");
		file.createNewFile();
		def inputText = 'A quick brown Fox jumped over the lazy Cow\nJohn Jimbo jingeled happily ever after\nTh1$ 1$ v3ry c0nfus1ng'
		file.write(inputText);
		
		println  "Match Operations: "
		
		file.eachLine { line -> 
			if(line ==~ /^A.*Cow$/)
			{
				println "Line that ends with 'Cow' is: $line"
			}
		}
			file.eachLine { line ->
				if(line ==~ /^J.*/)
				{
					println "Line that starts  with 'J' is: $line"
				}
		}
		
		file.eachLine { line ->
			if(line ==~ /.*\d\d.*/)
			{
				println "Line that starts  with 'J' is: $line"
			}
	}
	
	def match1 = file.getText() =~ /\S+er/
	println "String(s) matching '/\\S+er/' are: ${match1.findAll()}"
	
	
	def match2 = file.getText() =~ /\S*\d\W/
	println "String(s) matching '/\\S*\\d\\W/' are: ${match2.findAll()}"
	

	
	
 
	
	
	}
}

