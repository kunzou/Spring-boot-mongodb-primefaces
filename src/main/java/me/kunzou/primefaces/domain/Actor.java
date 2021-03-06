
package me.kunzou.primefaces.domain;

import javax.annotation.Generated;
import org.springframework.data.mongodb.core.mapping.Field;
import com.google.gson.annotations.Expose;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Actor {

    @Expose
    private Long actorId;
    @Field("First name")
    private String firstName;
    @Field("Last name")
    private String lastName;

}
