package com.lessayer;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ParallelArraySortPractice {
	
	public static Random random = new Random();
	
	public static void main(String... args) {
		
		List<Long> avgSortDuration = new ArrayList<>();
		List<Long> avgParallelSortDuration = new ArrayList<>();
		
		Instant start;
		Instant end;
		Integer arrayMaxSize = 1000000;
		Integer maxEpoch = 1000;
		
		for (Integer arrayNum = 10; arrayNum < arrayMaxSize; arrayNum*=10) {
			List<Duration> sortDuration = new ArrayList<>();
			List<Duration> parallelSortDuration = new ArrayList<>();
			for (Integer epoch = 0; epoch < maxEpoch; epoch++) {
				Integer[] intArray1 = new Integer[arrayNum];
				Integer[] intArray2;
				for (int i = 0; i < arrayNum; i++) {
					intArray1[i] = random.nextInt(Integer.MAX_VALUE);
				}
				intArray2 = Arrays.copyOf(intArray1, arrayNum);
				
				start = Instant.now();
				Arrays.sort(intArray1);
				end = Instant.now();
				sortDuration.add(Duration.between(start, end));
				
				start = Instant.now();
				Arrays.parallelSort(intArray2);
				end = Instant.now();
				parallelSortDuration.add(Duration.between(start, end));
			}
			avgSortDuration.add(calculateAvgNanoTime(sortDuration));
			avgParallelSortDuration.add(calculateAvgNanoTime(parallelSortDuration));
		}
		
		System.out.print("Array Size                    : ");
		for (Integer arrayNum = 10; arrayNum < arrayMaxSize; arrayNum*=10) {
			System.out.print(arrayNum + " ");
		}
		System.out.println();
		
		System.out.print("Average Sort Time(ns)         : ");
		Integer index = 0;
		for (Integer arrayNum = 10; arrayNum < arrayMaxSize; arrayNum*=10) {
			System.out.print(avgSortDuration.get(index++) + " ");
		}
		System.out.println();
		
		System.out.print("Average Parallel Sort Time(ns): ");
		index = 0;
		for (Integer arrayNum = 10; arrayNum < arrayMaxSize; arrayNum*=10) {
			System.out.print(avgParallelSortDuration.get(index++) + " ");
		}
		System.out.println();
	}

	private static Long calculateAvgNanoTime(List<Duration> durationList) {
		Long nanoSum = durationList.stream().map(duration -> duration.toNanos())
			.reduce((a, b) -> (a + b))
			.get();
		return nanoSum / durationList.size();
	}
	
}
