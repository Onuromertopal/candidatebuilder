package org.omer.candidate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.omer.candidate.config.AsyncSyncConfiguration;
import org.omer.candidate.config.EmbeddedElasticsearch;
import org.omer.candidate.config.EmbeddedKafka;
import org.omer.candidate.config.EmbeddedMongo;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { CandidatebuilderApp.class, AsyncSyncConfiguration.class })
@EmbeddedMongo
@EmbeddedElasticsearch
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
