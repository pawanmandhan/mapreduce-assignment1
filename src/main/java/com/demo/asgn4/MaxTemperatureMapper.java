package com.demo.asgn4;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MaxTemperatureMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

	// [C,C++,Java] => [0,[C,C++,Java]]
	@Override
	public void map(LongWritable key, Text value, Context output) throws IOException, InterruptedException {
		String line = value.toString();
		String[] values = line.split(" ");

		output.write(new Text(values[0]), new IntWritable(Integer.valueOf(values[1])));
	}

}
