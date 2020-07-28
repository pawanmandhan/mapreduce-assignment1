package com.demo.asgn3;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import com.google.common.collect.Iterables;

public class DuplicateWordReducer extends Reducer<Text, IntWritable, Text, NullWritable> {

	// [C,[1,1,1]
	@Override
	public void reduce(Text key, Iterable<IntWritable> values, Context context)
			throws IOException, InterruptedException {
		if (Iterables.size(values) > 1) {
			context.write(key, NullWritable.get());
		}

	}
}
