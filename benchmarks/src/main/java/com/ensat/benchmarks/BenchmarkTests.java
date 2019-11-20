package com.ensat.benchmarks;

import static org.junit.jupiter.api.Assertions.assertEquals;


import com.ensat.SpringBootWebApplication;
import java.util.concurrent.TimeUnit;
import org.junit.runner.RunWith;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class BenchmarkTests {

  @Benchmark
  @OutputTimeUnit(TimeUnit.MILLISECONDS)
  public void benchmarkLoadContext(){

  }

}