package com.demo.asgn3;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class DuplicateWordMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

	// [C,C++,Java] => [0,[C,C++,Java]]
	@Override
	public void map(LongWritable key, Text value, Context output) throws IOException, InterruptedException {
		String line = value.toString();
		String[] values = line.split(",");

		output.write(new Text(values[1]), new IntWritable(1));
	}

}
