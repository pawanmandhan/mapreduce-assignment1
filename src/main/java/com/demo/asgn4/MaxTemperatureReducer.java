package com.demo.asgn4;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class MaxTemperatureReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

	// [C,[1,1,1]
	@Override
	public void reduce(Text key, Iterable<IntWritable> values, Context context)
			throws IOException, InterruptedException {
		int maxTemp = 0;
		for (IntWritable val : values) {
			maxTemp = Math.max(maxTemp, val.get());
		}
		context.write(key, new IntWritable(maxTemp));
	}
}
