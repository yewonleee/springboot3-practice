package org.example.springbootdeveloper.config.jwt;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties("jwt") // 자바 클래스에 property 값을 가져와서 사용하는 annotation (application.yml에서 사용)
public class JwtProperties {
    private String issuer;
    private String secretKey;
}
