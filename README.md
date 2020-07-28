# Map Reduce

# Assignment1 - count freq of "hadoop"
- mvn install
- hdfs dfs -put words.txt /
- yarn jar mapreduce-assignment1-0.0.1-SNAPSHOT.jar com.demo.asgn1.WordCountDriver /words.txt /output_04


# Assignment2 - count word size
- mvn install
- hdfs dfs -put word-size.txt /
- yarn jar mapreduce-assignment1-0.0.1-SNAPSHOT.jar com.demo.asgn2.WordSizeDriver /word-size.txt /output_05

# Assignment3 - find duplicate firstname
- mvn install
- hdfs dfs -put input-duplicates.txt /
- yarn jar mapreduce-assignment1-0.0.1-SNAPSHOT.jar com.demo.asgn3.DuplicateWordDriver /input-duplicates.txt /output_07

# Assignment3 - max temperature
- mvn install
- hdfs dfs -put maxiumum-temperature-dataset.txt /
- yarn jar mapreduce-assignment1-0.0.1-SNAPSHOT.jar com.demo.asgn4.MaxTemperatureDriver /maxiumum-temperature-dataset.txt /output_09
