package org.springframework.content.examples;

import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;

import com.github.paulcwarren.ginkgo4j.Ginkgo4jConfiguration;
import com.github.paulcwarren.ginkgo4j.Ginkgo4jSpringRunner;

@RunWith(Ginkgo4jSpringRunner.class)
@Ginkgo4jConfiguration(threads=1)
@SpringApplicationConfiguration(classes = org.springframework.content.examples.Application.class)   
public class ClaimTest extends AbstractSpringContentTests {
}