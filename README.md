# mapreduce

# Assignment1
- mvn install
- hdfs dfs -put words.txt /
- yarn jar mapreduce-assignment1-0.0.1-SNAPSHOT.jar com.demo.asgn1.WordCountDriver /words.txt /output_04

input:
 - C,Java,C#
- C,Java,C#
- C,Java,C#,Java
- hadoop,hadoop
- java,hadoop

- output:
hadoop	3



# Assignment2
mvn install
hdfs dfs -put word-size.txt /
yarn jar mapreduce-assignment1-0.0.1-SNAPSHOT.jar com.demo.asgn2.WordSizeDriver /word-size.txt /output_05

input:
Hello everyone this is a sample dataset you want to print the word size and
count of words of that size

output:
1	1
2	4
3	3
4	6
5	4
6	1
7	1
8	1

