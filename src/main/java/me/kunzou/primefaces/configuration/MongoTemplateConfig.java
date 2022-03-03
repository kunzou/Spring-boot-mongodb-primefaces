package me.kunzou.primefaces.configuration;

import java.util.Collections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import me.kunzou.primefaces.converter.LocalDateTimeStringConverter;


@Configuration
public class MongoTemplateConfig {

  private LocalDateTimeStringConverter localDateTimeStringConverter;

  public MongoTemplateConfig(LocalDateTimeStringConverter localDateTimeStringConverter) {
    this.localDateTimeStringConverter = localDateTimeStringConverter;
  }

  @Bean
  public MongoTemplate mongoTemplate(MongoDbFactory mongoDatabaseFactory, MongoMappingContext context) {
    MongoCustomConversions conversions = new MongoCustomConversions(Collections.singletonList(localDateTimeStringConverter));
    MappingMongoConverter converter =
      new MappingMongoConverter(new DefaultDbRefResolver(mongoDatabaseFactory), context);
    converter.setTypeMapper(new DefaultMongoTypeMapper(null));
    converter.setCustomConversions(conversions);

    converter.afterPropertiesSet();
    return new MongoTemplate(mongoDatabaseFactory, converter);
  }
}
