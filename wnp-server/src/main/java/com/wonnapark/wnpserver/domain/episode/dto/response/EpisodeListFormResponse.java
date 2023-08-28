package com.wonnapark.wnpserver.domain.episode.dto.response;

import com.wonnapark.wnpserver.domain.episode.Episode;

import java.time.LocalDate;

public record EpisodeListFormResponse(
        Long id,
        String title,
        String thumbnail,
        LocalDate releaseDate,
        boolean isViewed
) {

    public static EpisodeListFormResponse from(Episode episode) {
        return new EpisodeListFormResponse(
                episode.getId(),
                episode.getTitle(),
                episode.getThumbnail(),
                episode.getReleaseDateTime().toLocalDate(),
                false
        );
    }

    public static EpisodeListFormResponse from(Episode episode, boolean isViewed) {
        return new EpisodeListFormResponse(
                episode.getId(),
                episode.getTitle(),
                episode.getThumbnail(),
                episode.getReleaseDateTime().toLocalDate(),
                isViewed
        );
    }

}
