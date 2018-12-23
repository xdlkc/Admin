package com.lkc.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthService {
    @Autowired
    private RestTemplate restTemplate;
    @Value(value = "${github.oauth.url}")
    private String oauthUrl;
    @Value(value = "${github.token.url}")
    private String tokenUrl;
    @Value(value = "${github.user.url}")
    private String userUrl;
    @Value(value = "${github.client.id}")
    private String clientId;
    @Value(value = "${github.client.secret}")
    private String clientSecret;
    @Value(value = "${redirect.uri}")
    private String redirectUri;

    public String getGithubOauthUrl() {
        String url = oauthUrl + "?clientId=" + clientId + "&redirect_uri=" + redirectUri;

        return url;
    }
}
