package com.wonnapark.wnpserver.domain.user.application;

import com.wonnapark.wnpserver.domain.oauth.dto.response.OAuthInfoResponse;
import com.wonnapark.wnpserver.domain.user.OAuthProvider;
import com.wonnapark.wnpserver.domain.user.User;
import com.wonnapark.wnpserver.domain.user.dto.UserResponse;
import com.wonnapark.wnpserver.domain.user.infrastructure.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class DefaultUserService implements UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserResponse create(OAuthInfoResponse response) {
        User user = response.toEntity();
        User savedUser = userRepository.save(user);
        return UserResponse.from(savedUser);
    }

    public UserResponse findUserByProviderIdAndPlatform(Long providerId, OAuthProvider platform) {
        User user = userRepository.findByProviderIdAndPlatform(providerId, platform)
                .orElseThrow(NoSuchElementException::new);
        return UserResponse.from(user);
    }
}
